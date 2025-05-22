package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.AppRouter.navigateTo
import www.BuildInfo
import www.Pages.AvatarPage
import www.Pages.ThemesPage
import www.components.Codeblock
import www.components.Sidebar
import www.components.TableOfContents
import www.components.ThemeProvider
import www.components.ThemeToggle
import www.components.WebsiteIcons
import www.libs.scalawind.*

case class App() {
  private enum Layout derives CanEqual {
    case Docs
    case Themes
  }

  private val layoutSignal: Signal[Layout] = AppRouter.currentPageSignal.map {
    case ThemesPage => Layout.Themes
    case _          => Layout.Docs
  }.distinct

  def renderThemesLayout(): HtmlElement = {
    mainTag(
      tw.flex.flex_1.flex_col,
      sectionTag(
        tw.border_grid.border_b,
        div(
          tw.container_wrapper.border_l.border_r.border_grid,
          div(
            tw.container.flex.flex_col.items_start.gap_1.py_8.md(tw.py_10).lg(tw.py_12),
            h1(
              tw.text_2xl.font_bold.leading_tight.tracking_tighter.sm(tw.text_3xl).md(tw.text_4xl).m_0.p_0,
              "Add colors. Make it yours."
            ),
            p(
              tw.max_w_2xl.text_base.font_light.sm(tw.text_lg).m_0.p_0,
              "Changing the theme of your application is a great way to add visual identity to your application. You can change the theme of your application to match your brand colors, or to match the colors of your application."
            )
          )
        )
      ),
      div(
        tw.border_grid.border_b,
        div(
          tw.container_wrapper.border_l.border_r.border_grid.flex_1,
          div(
            tw.container.flex.gap_2.py_4,
            ThemeProvider.Theme.values.toList.map { theme =>
              Button(
                _.onClick.mapTo(theme.key) --> ThemeProvider.websiteThemeVar.writer
              )(
                theme.name
              )
            }
          )
        )
      ),
      div(
        tw.container_wrapper.border_l.border_r.border_grid.flex_1,
        div(
          tw.container.py_6,
          child <-- pageViews
        )
      )
    )
  }

  def renderDocsLayout(): HtmlElement = {
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
    )
  }

  def renderApp(): HtmlElement = {
    div(
      tw.relative.flex.min_h_svh.flex_col,
      backgroundColor(ThemingParameters.sapBackgroundColor),
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
                ),
                navTag(
                  tw.flex.items_center.gap_4.text_sm.xl(tw.gap_6),
                  a(
                    navigateTo(AvatarPage),
                    "Docs"
                  ),
                  a(
                    navigateTo(ThemesPage),
                    "Themes"
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
                      WebsiteIcons.icon := "Github"
                    )
                  )
                )
              )
            )
          )
        ),
        child <-- layoutSignal.map {
          case Layout.Themes => renderThemesLayout()
          case Layout.Docs   => renderDocsLayout()
        },
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

  def apply(): HtmlElement = {
    renderApp()
  }
}
