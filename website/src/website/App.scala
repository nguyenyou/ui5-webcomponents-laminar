package website

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.scalawind.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.Button.ButtonDesign
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigThemeMod.setTheme
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleApplyDirectionMod
import org.scalajs.dom
import website.components.Demo
import website.components.IframePreview
import website.components.PreviewCode
import website.components.Sidebar
import website.components.TableOfContents
import website.components.ThemeProvider.contentDensityVar
import website.components.ThemeProvider.directionVar
import website.components.ThemeProvider.websiteThemeSignal
import website.components.ThemeProvider.websiteThemeVar
import website.examples.PopoverExampleBasic
import website.extensions.scalawind.*
import website.macros.Source
import website.components.ThemeToggle
import website.components.Icons

case class App() {
  def renderDefaultLayout(): HtmlElement = {
    div(
      tw.relative.flex.min_h_svh.flex_col.bg_sap_background,
      div(
        tw.border_grid.flex.flex_col.flex_1,
        headerTag(
          tw.border_b.border_grid.sticky.top_0.z_50.w_full.bg_sap_background.bg_opacity_95.backdrop_blur,
          div(
            tw.container_wrapper,
            div(
              tw.container.flex.h_14.items_center.gap_2.md(tw.gap_4),
              div(
                tw.mr_4.flex,
                a(
                  href := "/",
                  tw.mr_4.flex.items_center.gap_2.lg(tw.mr_6),
                  img(
                    src := "/logo.png",
                    tw.h_6.w_6.object_contain
                  ),
                  span(
                    tw.inline_block.font_bold,
                    "Laminar[UI5 Web Components]"
                  )
                )
              ),
              div(
                tw.ml_auto.flex.items_center.gap_2.md(tw.flex_1.justify_end),
                navTag(
                  tw.flex.items_center.gap_2,
                  ThemeToggle()()
                )
              )
            )
          )
        ),
        mainTag(
          tw.flex.flex_1.flex_col,
          div(
            tw.container_wrapper.flex_1.flex.flex_col,
            div(
              tw.container.flex_1.items_start,
              tw.md(tw.grid.gap_6),
              tw.lg(tw.grid.gap_10),
              cls(
                "md:grid-cols-[220px_minmax(0,1fr)] lg:grid-cols-[240px_minmax(0,1fr)]"
              ),
              Sidebar()(),
              mainTag(
                tw.relative.py_6
                  .lg(tw.gap_10.py_8)
                  .xl(tw.grid.grid_cols_("1fr_300px")),
                div(
                  tw.mx_auto.w_full.min_w_0.max_w_2xl,
                  child <-- pageViews
                ),
                div(
                  tw.hidden.text_sm.xl(tw.block),
                  div(
                    tw.sticky.top_20._mt_6.pt_4,
                    cls("h-[calc(100vh-3.5rem)]"),
                    TableOfContents()()
                  )
                )
              )
            )
          )
        ),
        footerTag(
          tw.border_grid.border_t.py_6.md(tw.py_0),
          div(
            tw.container_wrapper,
            div(
              tw.container.py_4,
              div(
                tw.text_balance.text_center.text_sm.leading_loose
                  .md(tw.text_left),
                "Built by ",
                Link(
                  _.href   := "https://github.com/nguyenyou",
                  _.target := "_blank",
                  _.design := "Subtle"
                )("Tu Nguyen"),
                ". The source code is available on ",
                Link(
                  _.href   := "https://github.com/nguyenyou/ui5-webcomponents-laminar",
                  _.target := "_blank",
                  _.design := "Subtle"
                )("GitHub")
              )
            )
          )
        )
      )
    )
  }

  def renderApp(): HtmlElement = {
    div(
      child <-- AppRouter.currentPageSignal.distinct.map { case _ =>
        renderDefaultLayout()
      }
    )
  }

  def apply(): HtmlElement = {
    renderApp()
  }
}
