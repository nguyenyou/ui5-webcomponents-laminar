package website

import io.bullet.borer.*
import io.bullet.borer.derivation.MapBasedCodecs.*
import com.raquo.waypoint.*
import Pages.*
import AppRouter.*
import com.raquo.waypoint.SplitRender
import com.raquo.laminar.api.L.{*, given}
import com.raquo.waypoint
import website.utils.JsonUtils.*
import org.scalajs.dom
import views.docs.*
import views.HomeView

// Step 1: Define Pages
object Pages {

  sealed trait Page(val title: String, val url: String = "") {
    def path = if (url.isEmpty) title.toLowerCase.replace(" ", "-") else url
  }

  case object HomePage           extends Page("Home")
  case object NotFoundPage       extends Page("Not Found")
  case object AvatarPage         extends Page("Avatar")
  case object AvatarGroupPage    extends Page("Avatar Group")
  case object BarPage            extends Page("Bar")
  case object BreadcrumbsPage    extends Page("Breadcrumbs")
  case object BusyIndicatorPage  extends Page("Busy Indicator")
  case object ButtonPage         extends Page("Button")
  case object CalendarPage       extends Page("Calendar")
  case object CalendarLegendPage extends Page("Calendar Legend")
  case object CardPage           extends Page("Card")
  case object IntroductionPage   extends Page("Introduction")

  given pageCodec: Codec[Page] = deriveAllCodecs
}

// Step 2: Map Page to View
val pageViews: Signal[HtmlElement] = AppRouter.currentPageSignal.splitMatchOne
  .handleValue(HomePage)(HomeView())
  .handleValue(IntroductionPage)(IntroductionView())
  .handleValue(ButtonPage)(ButtonView())
  .handleValue(AvatarPage)(AvatarView())
  .handleValue(AvatarGroupPage)(AvatarGroupView())
  .handleValue(BarPage)(BarView())
  .handleValue(BreadcrumbsPage)(BreadcrumbsView())
  .handleValue(BusyIndicatorPage)(BusyIndicatorView())
  .handleValue(CalendarPage)(CalendarView())
  .handleValue(CalendarLegendPage)(CalendarLegendView())
  .handleValue(CardPage)(CardView())
  .handleValue(NotFoundPage)(div("Not Found"))
  .toSignal

// Step 3 (Optional): Display in Sidebar
val docPages: List[Page] = List(
  AvatarPage,
  AvatarGroupPage,
  BarPage,
  BreadcrumbsPage,
  BusyIndicatorPage,
  ButtonPage,
  CalendarPage,
  CalendarLegendPage,
  CardPage
)

// Step 4: Map URL to Page
object AppRouter
    extends waypoint.Router[Page](
      routes = List(
        Route.static(HomePage, root / endOfSegments),
        Route.static(IntroductionPage, root / "docs" / endOfSegments),
        Route
          .static(ButtonPage, root / ButtonPage.path / endOfSegments, "/docs"),
        Route
          .static(AvatarPage, root / AvatarPage.path / endOfSegments, "/docs"),
        Route
          .static(
            AvatarGroupPage,
            root / AvatarGroupPage.path / endOfSegments,
            "/docs"
          ),
        Route
          .static(BarPage, root / BarPage.path / endOfSegments, "/docs"),
        Route
          .static(
            BreadcrumbsPage,
            root / BreadcrumbsPage.path / endOfSegments,
            "/docs"
          ),
        Route
          .static(BusyIndicatorPage, root / BusyIndicatorPage.path / endOfSegments, "/docs"),
        Route
          .static(CalendarPage, root / CalendarPage.path / endOfSegments, "/docs"),
        Route
          .static(CalendarLegendPage, root / CalendarLegendPage.path / endOfSegments, "/docs"),
        Route
          .static(CardPage, root / CardPage.path / endOfSegments, "/docs")
      ),
      getPageTitle =
        page =>
          s"${page.title} | Laminar wrappers for UI5 Web Components", // displayed in the browser tab next to favicon
      serializePage = page =>
        Json
          .encode(page)
          .toUtf8String, // serialize page data for storage in History API log
      deserializePage = pageStr => Json.decodeString(pageStr).to[Page].value, // deserialize the above
      routeFallback = _ => NotFoundPage
    ) {

  currentPageSignal.foreach { page =>
    // Reset scroll position (see Waypoint docs for caveats / more details)
    dom.window.scrollTo(x = 0, y = 0)
  }(owner)

}
