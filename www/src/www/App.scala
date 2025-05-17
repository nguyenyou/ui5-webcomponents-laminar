package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.BuildInfo
import www.components.Codeblock
import www.components.Icons
import www.components.Sidebar
import www.components.TableOfContents
import www.components.ThemeToggle
import www.libs.scalawind.*

case class App() {
  def renderDefaultLayout(): HtmlElement = {
    div(
      tw.relative.flex.min_h_svh.flex_col.bg_sap_background,
      div(
        tw.flex.flex_col.flex_1,
        headerTag(
          tw.sticky.border_b.border_grid.top_0.z_50.w_full.bg_sap_background.bg_opacity_95.backdrop_blur,
          div(
            tw.container_wrapper.border_l.border_r.border_grid,
            div(
              tw.container.flex.h_14.items_center.gap_2.md(tw.gap_4),
              div(
                tw.mr_4.flex.h_full,
                a(
                  href := "/",
                  tw.h_full.mr_4.flex.items_center.gap_2.lg(tw.mr_6),
                  img(
                    src := "/logo.png",
                    tw.h_6.w_6.object_contain
                  ),
                  div(
                    tw.font_mono.h_full.flex.items_center.relative.font_bold,
                    div(
                      "UI5 Laminar",
                      span(
                        tw.text_xs.font_normal.font_mono.ml_2,
                        s"v${BuildInfo.version}"
                      )
                    )
                  )
                )
              ),
              div(
                tw.ml_auto.flex.items_center.gap_2.md(tw.flex_1.justify_end),
                navTag(
                  tw.flex.items_center.gap_1,
                  compactSize(true),
                  Codeblock.ThemeSwitcher,
                  ThemeToggle()(),
                  a(
                    href   := BuildInfo.repoUrl,
                    target := "_blank",
                    rel    := "noopener noreferrer",
                    Button(
                      _.design := "Transparent"
                    )(
                    )
                  )
                )
              )
            )
          )
        ),
        mainTag(
          tw.flex.flex_1.flex_col,
          div(
            tw.container_wrapper.border_l.border_r.border_grid.flex_1.flex.flex_col,
            div(
              tw.container.flex_1.items_start,
              tw.md(tw.grid.gap_6.grid_cols_("220px_minmax(0,1fr)")),
              tw.lg(tw.grid.gap_6.grid_cols_("240px_minmax(0,1fr)")),
              Sidebar()(),
              mainTag(
                tw.relative.py_6
                  .lg(tw.gap_10.py_8)
                  .xl(tw.grid.grid_cols_("1fr_300px")),
                div(
                  tw.mx_auto.w_full.min_w_0.max_w_4xl,
                  child <-- pageViews
                ),
                div(
                  tw.hidden.text_sm.xl(tw.block),
                  div(
                    tw.sticky.top_20._mt_6.pt_4,
                    tw.h_("calc(100vh-3.5rem)"),
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
            tw.container_wrapper.border_l.border_r.border_grid,
            div(
              tw.container.py_4,
              div(
                tw.text_balance.text_center.text_sm.leading_loose
                  .md(tw.text_left),
                "Built by ",
                Link(
                  _.href   := BuildInfo.githubProfile,
                  _.target := "_blank",
                  _.design := "Subtle"
                )(BuildInfo.author),
                ". The source code is available on ",
                Link(
                  _.href   := BuildInfo.repoUrl,
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
    renderDefaultLayout()
  }

  def apply(): HtmlElement = {
    renderApp()
  }
}
