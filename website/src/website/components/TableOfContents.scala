package website.components

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import org.scalajs.dom.IntersectionObserver
import org.scalajs.dom.IntersectionObserverEntry
import website.AppRouter.currentPageSignal
import website.extensions.scalawind.*
import website.facades.ScrollOptions
import website.facades.scrollIntoViewIfNeeded

import scala.scalajs.js
import scala.util.Random

case class TableOfContents() {

  private case class Heading(
      id: String,
      text: String,
      level: Int,
      isVisible: Boolean = false,
      ele: dom.Element
  )

  private val headingsVar    = Var(List.empty[Heading])
  private val headingsSignal = headingsVar.signal.distinct

  private def handleIntersection(
      entries: js.Array[IntersectionObserverEntry]
  ): Unit = {
    val visibilities = entries.toList
      .map(entry => entry.target.getAttribute("id") -> entry.isIntersecting)
      .toMap

    headingsVar.update { currentHeadings =>
      currentHeadings.map { heading =>
        heading.copy(isVisible = visibilities.getOrElse(heading.id, heading.isVisible))
      }
    }
  }

  private val intersectionObserver = IntersectionObserver((entries, _) => handleIntersection(entries))

  private def findHeadings(): Unit = {
    val mainContentElement = Option(dom.document.querySelector("main"))

    mainContentElement.foreach { mainElement =>
      val headingElements = mainElement.querySelectorAll("h2, h3, h4, h5, h6")

      val foundHeadings = headingElements.map { el =>
        val headingId = Option(el.getAttribute("id")).getOrElse {
          val id = Random.alphanumeric.take(10).mkString
          el.setAttribute("id", id)
          id
        }

        val cleanedText = Option(el.querySelector("[data-heading-title]"))
          .map(_.textContent.trim)
          .getOrElse(el.textContent.trim)

        Heading(
          id = headingId,
          text = cleanedText,
          level = el.tagName.toLowerCase.charAt(1).toString.toInt,
          isVisible = false,
          ele = el
        )
      }.toList

      headingsVar.update { prev =>
        // Unobserve previous headings
        prev.foreach { heading =>
          intersectionObserver.unobserve(heading.ele)
        }

        // Observe new headings
        foundHeadings.foreach { heading =>
          intersectionObserver.observe(heading.ele)
        }

        foundHeadings
      }
    }
  }

  @SuppressWarnings(
    Array(
      "scalafix:DisableSyntax.null"
    )
  )
  private def renderHeadingLink(heading: Heading): HtmlElement = {
    val indentClass = heading.level match {
      case 2 => tw.ml_0.css
      case 3 => tw.ml_2.css
      case 4 => tw.ml_4.css
      case 5 => tw.ml_6.css
      case _ => tw.ml_8.css
    }

    a(
      tw.block.py_1.text_sm.cursor_pointer.transition_colors,
      cls  := indentClass,
      cls  := (tw.font_medium.css -> heading.isVisible, tw.font_normal.opacity_50.css -> !heading.isVisible),
      href := s"#${heading.id}",
      heading.text,
      onClick.preventDefault --> { _ =>
        // Update URL with hash
        // [DisableSyntax.null
        dom.window.history.pushState(
          null,
          "",
          s"#${heading.id}"
        )

        Option(dom.document.getElementById(heading.id)).foreach { el =>
          scrollIntoViewIfNeeded(
            el,
            ScrollOptions(
              behavior = ScrollOptions.AUTO,
              block = ScrollOptions.START,
              inline = ScrollOptions.CENTER,
              scrollMode = ScrollOptions.IF_NEEDED
            )
          )
        }
      }
    )
  }

  def apply(): HtmlElement = {
    div(
      tw.h_full.no_scrollbar.overflow_y_auto.bg_sap_background.text_sap_text,
      div(
        tw.space_y_2,
        div(
          tw.text_sm.font_semibold.mb_4,
          "On this page"
        ),
        div(
          tw.space_y_2,
          children <-- headingsSignal.map(_.map(renderHeadingLink))
        )
      ),
      currentPageSignal --> { _ =>
        dom.window.requestAnimationFrame(_ => findHeadings())
      },
      onUnmountCallback { _ =>
        intersectionObserver.disconnect()
      }
    )
  }

}
