package website

import com.raquo.laminar.api.L.*
import com.raquo.waypoint
import com.raquo.waypoint.*
import io.bullet.borer.*
import io.bullet.borer.derivation.MapBasedCodecs.*
import org.scalajs.dom
import website.utils.JsonUtils.*

import Pages.*
import AppRouter.*
import views.docs.*
import views.HomeView

// Step 1: Define Pages
object Pages {

  sealed trait Page(val title: String, val url: String = "") {
    def path = if (url.isEmpty) title else url
  }

  case object HomePage                 extends Page("Home")
  case object NotFoundPage             extends Page("Not Found")
  case object AvatarPage               extends Page("Avatar")
  case object AvatarGroupPage          extends Page("AvatarGroup")
  case object BarPage                  extends Page("Bar")
  case object BreadcrumbsPage          extends Page("Breadcrumbs")
  case object BusyIndicatorPage        extends Page("BusyIndicator")
  case object ButtonPage               extends Page("Button")
  case object CalendarPage             extends Page("Calendar")
  case object CalendarLegendPage       extends Page("CalendarLegend")
  case object CardPage                 extends Page("Card")
  case object CarouselPage             extends Page("Carousel")
  case object CheckBoxPage             extends Page("CheckBox")
  case object ColorPalettePage         extends Page("ColorPalette")
  case object ColorPalettePopoverPage  extends Page("ColorPalettePopover")
  case object ColorPickerPage          extends Page("ColorPicker")
  case object ComboBoxPage             extends Page("ComboBox")
  case object DatePickerPage           extends Page("DatePicker")
  case object DateRangePickerPage      extends Page("DateRangePicker")
  case object DateTimePickerPage       extends Page("DateTimePicker")
  case object DialogPage               extends Page("Dialog")
  case object InputPage                extends Page("Input")
  case object LabelPage                extends Page("Label")
  case object LinkPage                 extends Page("Link")
  case object ListViewPage             extends Page("List")
  case object MenuPage                 extends Page("Menu")
  case object MessageStripPage         extends Page("MessageStrip")
  case object MultiComboBoxPage        extends Page("MultiComboBox")
  case object MultiInputPage           extends Page("MultiInput")
  case object RadioButtonPage          extends Page("RadioButton")
  case object RangeSliderPage          extends Page("RangeSlider")
  case object RatingIndicatorPage      extends Page("RatingIndicator")
  case object SplitButtonPage          extends Page("SplitButton")
  case object SelectPage               extends Page("Select")
  case object SegmentedButtonPage      extends Page("SegmentedButton")
  case object SwitchPage               extends Page("Switch")
  case object SliderPage               extends Page("Slider")
  case object ToastPage                extends Page("Toast")
  case object TagPage                  extends Page("Tag")
  case object TextPage                 extends Page("Text")
  case object TitlePage                extends Page("Title")
  case object PanelPage                extends Page("Panel")
  case object ProgressIndicatorPage    extends Page("ProgressIndicator")
  case object PopoverPage              extends Page("Popover")
  case object TreeViewPage             extends Page("Tree")
  case object ToggleButtonPage         extends Page("ToggleButton")
  case object TokenPage                extends Page("Token")
  case object TextAreaPage             extends Page("TextArea")
  case object BarcodeScannerDialogPage extends Page("BarcodeScannerDialog")

  // AI
  case object AiButtonPage extends Page("AI Button")
  given pageCodec: Codec[Page] = deriveAllCodecs
}

// Step 2: Map Page to View
val pageViews: Signal[HtmlElement] = AppRouter.currentPageSignal.splitMatchOne
  .handleValue(HomePage)(HomeView())
  .handleValue(ButtonPage)(ButtonView())
  .handleValue(AvatarPage)(AvatarView())
  .handleValue(AvatarGroupPage)(AvatarGroupView())
  .handleValue(BarPage)(BarView())
  .handleValue(BreadcrumbsPage)(BreadcrumbsView())
  .handleValue(BusyIndicatorPage)(BusyIndicatorView())
  .handleValue(CalendarPage)(CalendarView())
  .handleValue(CalendarLegendPage)(CalendarLegendView())
  .handleValue(CardPage)(CardView())
  .handleValue(CarouselPage)(CarouselView())
  .handleValue(CheckBoxPage)(CheckboxView())
  .handleValue(ColorPalettePage)(ColorPaletteView())
  .handleValue(ColorPalettePopoverPage)(ColorPalettePopoverView())
  .handleValue(ColorPickerPage)(ColorPickerView())
  .handleValue(ComboBoxPage)(ComboBoxView())
  .handleValue(DatePickerPage)(DatePickerView())
  .handleValue(DateRangePickerPage)(DateRangePickerView())
  .handleValue(DateTimePickerPage)(DateTimePickerView())
  .handleValue(DialogPage)(DialogView())
  .handleValue(InputPage)(InputView())
  .handleValue(LabelPage)(LabelView())
  .handleValue(LinkPage)(LinkView())
  .handleValue(ListViewPage)(ListView())
  .handleValue(MenuPage)(MenuView())
  .handleValue(MessageStripPage)(MessageStripView())
  .handleValue(MultiComboBoxPage)(MultiComboBoxView())
  .handleValue(RadioButtonPage)(RadioButtonView())
  .handleValue(RangeSliderPage)(RangeSliderView())
  .handleValue(RatingIndicatorPage)(RatingIndicatorView())
  .handleValue(SplitButtonPage)(SplitButtonView())
  .handleValue(SelectPage)(SelectView())
  .handleValue(SegmentedButtonPage)(SegmentedButtonView())
  .handleValue(SwitchPage)(SwitchView())
  .handleValue(SliderPage)(SliderView())
  .handleValue(ToastPage)(ToastView())
  .handleValue(TagPage)(TagView())
  .handleValue(TextView)(TextView())
  .handleValue(TextPage)(TextView())
  .handleValue(TitlePage)(TitleView())
  .handleValue(PanelPage)(PanelView())
  .handleValue(ProgressIndicatorPage)(ProgressIndicatorView())
  .handleValue(PopoverPage)(PopoverView())
  .handleValue(TreeViewPage)(TreeView())
  .handleValue(ToggleButtonPage)(ToggleButtonView())
  .handleValue(TokenPage)(TokenView())
  .handleValue(TextAreaPage)(TextAreaView())
  .handleValue(MultiInputPage)(MultiInputView())
  .handleValue(AiButtonPage)(AiButtonView())
  .handleValue(BarcodeScannerDialogPage)(BarcodeScannerDialogView())
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
  CardPage,
  CarouselPage,
  CheckBoxPage,
  ColorPalettePage,
  ColorPalettePopoverPage,
  ColorPickerPage,
  ComboBoxPage,
  DatePickerPage,
  DateRangePickerPage,
  DateTimePickerPage,
  DialogPage,
  InputPage,
  LabelPage,
  LinkPage,
  ListViewPage,
  MenuPage,
  MessageStripPage,
  MultiInputPage,
  MultiComboBoxPage,
  RadioButtonPage,
  RangeSliderPage,
  RatingIndicatorPage,
  SplitButtonPage,
  SelectPage,
  SegmentedButtonPage,
  SwitchPage,
  SliderPage,
  ToastPage,
  ToggleButtonPage,
  TokenPage,
  TagPage,
  TextAreaPage,
  TextPage,
  TitlePage,
  PanelPage,
  ProgressIndicatorPage,
  PopoverPage,
  TreeViewPage,
  BarcodeScannerDialogPage
)

// Step 4: Map URL to Page
object AppRouter
    extends waypoint.Router[Page](
      routes = List(
        Route.static(HomePage, root / endOfSegments),
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
          .static(CardPage, root / CardPage.path / endOfSegments, "/docs"),
        Route
          .static(CarouselPage, root / CarouselPage.path / endOfSegments, "/docs"),
        Route
          .static(CheckBoxPage, root / CheckBoxPage.path / endOfSegments, "/docs"),
        Route
          .static(ColorPalettePage, root / ColorPalettePage.path / endOfSegments, "/docs"),
        Route
          .static(ColorPalettePopoverPage, root / ColorPalettePopoverPage.path / endOfSegments, "/docs"),
        Route
          .static(ColorPickerPage, root / ColorPickerPage.path / endOfSegments, "/docs"),
        Route
          .static(ComboBoxPage, root / ComboBoxPage.path / endOfSegments, "/docs"),
        Route
          .static(DatePickerPage, root / DatePickerPage.path / endOfSegments, "/docs"),
        Route
          .static(DateRangePickerPage, root / DateRangePickerPage.path / endOfSegments, "/docs"),
        Route
          .static(DateTimePickerPage, root / DateTimePickerPage.path / endOfSegments, "/docs"),
        Route
          .static(DialogPage, root / DialogPage.path / endOfSegments, "/docs"),
        Route
          .static(InputPage, root / InputPage.path / endOfSegments, "/docs"),
        Route
          .static(LabelPage, root / LabelPage.path / endOfSegments, "/docs"),
        Route
          .static(LinkPage, root / LinkPage.path / endOfSegments, "/docs"),
        Route
          .static(ListViewPage, root / ListViewPage.path / endOfSegments, "/docs"),
        Route
          .static(MenuPage, root / MenuPage.path / endOfSegments, "/docs"),
        Route
          .static(MessageStripPage, root / MessageStripPage.path / endOfSegments, "/docs"),
        Route
          .static(MultiInputPage, root / MultiInputPage.path / endOfSegments, "/docs"),
        Route
          .static(MultiComboBoxPage, root / MultiComboBoxPage.path / endOfSegments, "/docs"),
        Route
          .static(RadioButtonPage, root / RadioButtonPage.path / endOfSegments, "/docs"),
        Route
          .static(RangeSliderPage, root / RangeSliderPage.path / endOfSegments, "/docs"),
        Route
          .static(RatingIndicatorPage, root / RatingIndicatorPage.path / endOfSegments, "/docs"),
        Route
          .static(SplitButtonPage, root / SplitButtonPage.path / endOfSegments, "/docs"),
        Route
          .static(SelectPage, root / SelectPage.path / endOfSegments, "/docs"),
        Route
          .static(SegmentedButtonPage, root / SegmentedButtonPage.path / endOfSegments, "/docs"),
        Route
          .static(SwitchPage, root / SwitchPage.path / endOfSegments, "/docs"),
        Route
          .static(SliderPage, root / SliderPage.path / endOfSegments, "/docs"),
        Route
          .static(ToastPage, root / ToastPage.path / endOfSegments, "/docs"),
        Route
          .static(TagPage, root / TagPage.path / endOfSegments, "/docs"),
        Route
          .static(TextPage, root / TextPage.path / endOfSegments, "/docs"),
        Route
          .static(TitlePage, root / TitlePage.path / endOfSegments, "/docs"),
        Route
          .static(PanelPage, root / PanelPage.path / endOfSegments, "/docs"),
        Route
          .static(ProgressIndicatorPage, root / ProgressIndicatorPage.path / endOfSegments, "/docs"),
        Route
          .static(PopoverPage, root / PopoverPage.path / endOfSegments, "/docs"),
        Route
          .static(TreeViewPage, root / TreeViewPage.path / endOfSegments, "/docs"),
        Route
          .static(ToggleButtonPage, root / ToggleButtonPage.path / endOfSegments, "/docs"),
        Route
          .static(TokenPage, root / TokenPage.path / endOfSegments, "/docs"),
        Route
          .static(TextAreaPage, root / TextAreaPage.path / endOfSegments, "/docs"),
        Route
          .static(AiButtonPage, root / AiButtonPage.path / endOfSegments, "/docs"),
        Route
          .static(BarcodeScannerDialogPage, root / BarcodeScannerDialogPage.path / endOfSegments, "/docs")
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

  currentPageSignal.foreach { _ =>
    // Reset scroll position (see Waypoint docs for caveats / more details)
    dom.window.scrollTo(x = 0, y = 0)
  }(using owner)

}
