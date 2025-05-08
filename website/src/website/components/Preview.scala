package website.components

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import website.libs.scalawind.*

object Preview {

  private type Tab = "Preview" | "Code"
  private val initialTab: Tab = "Preview"
  private case class IndicatorStyles(width: Int, left: Int)

  private def getIndicatorStyles(ele: HtmlElement) =
    IndicatorStyles(ele.ref.offsetWidth.toInt, ele.ref.offsetLeft.toInt)

  private def render(
      title: => String,
      preview: => Node = emptyNode,
      sourceCode: => String
  ) = {
    val hoverTabVar     = Var[Option[Tab]](None)
    val hoverTabSignal  = hoverTabVar.signal.distinct
    val activeTabVar    = Var[Tab](initialTab)
    val activeTabSignal = activeTabVar.signal.distinct

    def TabItem(name: Tab, isActiveSignal: Signal[Boolean]) = {
      val isInitialTab = name == initialTab
      div(
        tw.flex.items_center.justify_center.transition_colors.duration_300.h_9.px_3.py_1.cursor_pointer.gap_2.text_sm,
        cls := (tw.opacity_80.css -> isInitialTab, tw.opacity_50.css -> !isInitialTab),
        cls <-- isActiveSignal.map(
          if (_) tw.important(tw.opacity_100).css
          else tw.important(tw.opacity_80).css
        ),
        onMouseEnter.mapTo(Option(name)) --> hoverTabVar,
        onMouseLeave.mapTo(None) --> hoverTabVar,
        onClick.mapTo(name) --> activeTabVar,
        name match {
          case "Preview" => Icons.windowIcon
          case "Code"    => Icons.codeIcon
        },
        name
      )
    }

    val previewNode: HtmlElement =
      TabItem(
        name = "Preview",
        isActiveSignal = activeTabSignal.map(_ == "Preview").distinct
      )

    val codeNode: HtmlElement = TabItem(
      name = "Code",
      isActiveSignal = activeTabSignal.map(_ == "Code").distinct
    )

    val initialNode = initialTab match {
      case "Preview" => previewNode
      case "Code"    => codeNode
    }

    val PreviewTabWidth = 107

    val initialIndicatorStyles =
      IndicatorStyles(PreviewTabWidth, initialNode.ref.offsetLeft.toInt)

    val hoverStylesVar     = Var[IndicatorStyles](initialIndicatorStyles)
    val hoverStylesSignal  = hoverStylesVar.signal
    val activeStylesVar    = Var[IndicatorStyles](initialIndicatorStyles)
    val activeStylesSignal = activeStylesVar.signal

    val hoverHandler: Binder.Base =
      hoverTabSignal.changes --> Observer[Option[Tab]] { tabOpt =>
        hoverStylesVar.update { prev =>
          tabOpt match {
            case Some("Preview") => getIndicatorStyles(previewNode)
            case Some("Code")    => getIndicatorStyles(codeNode)
            case None            => prev
          }
        }
      }

    val activeTabHandler: Binder.Base =
      activeTabSignal.changes --> Observer[Tab] { tab =>
        activeStylesVar.update { prev =>
          tab match {
            case "Preview" => getIndicatorStyles(previewNode)
            case "Code"    => getIndicatorStyles(codeNode)
          }
        }
      }

    val hoverHighlight: HtmlElement =
      div(
        tw.absolute.rounded.transition_all.duration_300.ease_out.h_9.opacity_0,
        tw.bg_sap_brand,
        cls <-- hoverTabSignal.map {
          case Some(_) => tw.important(tw.opacity_10).css
          case None    => tw.important(tw.opacity_0).css
        },
        left.px <-- hoverStylesSignal.map(_.left),
        width.px <-- hoverStylesSignal.map(_.width)
      )

    val activeIndicator: HtmlElement =
      div(
        tw.absolute.rounded.transition_all.bg_sap_brand.duration_300.ease_out.`h_0.5`.`_bottom_1.5`,
        left.px <-- activeStylesSignal.map(_.left),
        width.px <-- activeStylesSignal.map(_.width)
      )

    // Create an ID from the title for use in the URL hash
    val titleId = title.toLowerCase.replace(" ", "-")

    div(
      tw.space_y_2.mb_4,
      h2(
        tw.font_semibold.text_lg.group,
        idAttr := titleId,
        a(
          href := s"#${titleId}",
          tw.flex.items_center.gap_1.relative,
          span(
            dataAttr("heading-title") := "true",
            title
          )
        )
      ),
      div(
        tw.relative,
        onMountCallback { _ =>
          org.scalajs.dom.window.requestAnimationFrame { _ =>
            activeStylesVar.set(getIndicatorStyles(initialNode))
          }

          // Check if the current hash matches this component's ID and scroll to it if needed
          // val currentHash = dom.window.location.hash
          // if (currentHash == s"#${titleId}") {
          //   Option(dom.document.getElementById(titleId)).foreach { ele =>
          //     dom.window.requestAnimationFrame { _ =>
          //       scrollIntoViewIfNeeded(
          //         ele,
          //         ScrollOptions(
          //           behavior = ScrollOptions.SMOOTH,
          //           block = ScrollOptions.CENTER,
          //           inline = ScrollOptions.CENTER,
          //           scrollMode = ScrollOptions.IF_NEEDED
          //         )
          //       )
          //     }
          //   }
          // }
        },
        div(
          tw.relative.mb_5,
          activeIndicator,
          hoverHighlight,
          activeTabHandler,
          hoverHandler,
          div(
            tw.flex.relative.gap_2,
            previewNode,
            codeNode
          )
        ),
        div(
          div(
            tw.relative.rounded_md.overflow_hidden,
            div(
              tw.relative.z_10.p_10.rounded_md.overflow_hidden.min_h_("118px"),
              tw.bg_sap_background.text_sap_text.border.border_grid,
              tw.hidden <-- activeTabSignal.map(_ == "Preview").not,
              preview
            )
          ),
          div(
            tw.relative,
            tw.hidden <-- activeTabSignal.map(_ == "Code").not,
            Codeblock(sourceCode)
          )
        )
      )
    )
  }

  def apply(
      title: => String = ""
  )(preview: => Node = emptyNode)(sourceCode: => String = ""): HtmlElement = {
    render(
      title,
      preview,
      sourceCode
    )
  }

}
