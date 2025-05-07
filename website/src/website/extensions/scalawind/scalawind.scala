package website.extensions.scalawind

import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLHeadingElement

import scala.annotation.unused
import scala.language.implicitConversions
import scala.quoted.*

// Create a priority hierarchy for implicit conversions
trait LowPriorityImplicits {
  implicit inline def laminarTailwind(inline tailwind: Tailwind): L.HtmlMod = {
    ${ laminarTailwindImpl('tailwind) }
  }

  implicit inline def laminarSvgTailwind(inline tailwind: Tailwind): L.SvgMod = {
    ${ laminarSvgTailwindImpl('tailwind) }
  }
}

trait HighPriorityImplicits extends LowPriorityImplicits {
  implicit inline def laminarHtmlHeading(
      inline tailwind: Tailwind
  ): L.Modifier[ReactiveHtmlElement[HTMLHeadingElement]] = {
    ${ toHtmlHeadingModImpl('tailwind) }
  }
}

// Make the companion object extend the priority hierarchy
object Tailwind extends HighPriorityImplicits {
  def apply(): Tailwind = new Tailwind()

  implicit inline def sw(inline tailwind: Tailwind): String =
    ${ swImpl('tailwind) }
}

extension (inline tailwind: Tailwind) {
  inline def toHtmlMod: L.HtmlMod =
    ${ laminarTailwindImpl('tailwind) }
  inline def toSvgMod: L.SvgMod =
    ${ laminarSvgTailwindImpl('tailwind) }
  inline def <--(inline boolSignal: L.Signal[Boolean]): L.HtmlMod =
    ${ boolSignalClsImpl('tailwind, 'boolSignal) }
  inline def :=(inline bool: Boolean): L.HtmlMod =
    ${ boolClsImpl('tailwind, 'bool) }
}

def boolSignalClsImpl(tailwindExpr: Expr[Tailwind], boolSignal: Expr[L.Signal[Boolean]])(using
    Quotes
): Expr[L.HtmlMod] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls(${ Expr(value) }) <-- ${ boolSignal } }
}

def boolClsImpl(tailwindExpr: Expr[Tailwind], bool: Expr[Boolean])(using Quotes): Expr[L.HtmlMod] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls(${ Expr(value) }) := ${ bool } }
}

def laminarTailwindImpl(
    tailwindExpr: Expr[Tailwind]
)(using
    Quotes
): Expr[L.HtmlMod] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls := ${ Expr(value) } }
}

def laminarSvgTailwindImpl(
    tailwindExpr: Expr[Tailwind]
)(using
    Quotes
): Expr[L.SvgMod] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.svg.className := ${ Expr(value) } }
}

def toHtmlHeadingModImpl(
    tailwindExpr: Expr[Tailwind]
)(using Quotes): Expr[L.Modifier[ReactiveHtmlElement[HTMLHeadingElement]]] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls := ${ Expr(value) } }
}

extension (inline tailwind: Tailwind) {
  inline def css: String =
    ${ swImpl('tailwind) }
}

def methodNameToTailwindClass(rawName: String) = {
  val name = if (rawName.startsWith("_") && rawName.charAt(1).isDigit) rawName.stripPrefix("_") else rawName
  name.replace("_", "-")
}

def swImpl(tailwindExpr: Expr[Tailwind])(using Quotes): Expr[String] = {
  import quotes.reflect.*
  @SuppressWarnings(
    Array(
      "scalafix:DisableSyntax.var"
    )
  )
  def extractClassNames(term: Term, prefix: String = "", important: Boolean = false): List[String] = {
    var stack      = List((term, prefix, important))
    var classNames = List.empty[String]

    while (stack.nonEmpty) {
      stack.headOption.foreach { (currentTerm, currentPrefix, currentImportant) =>
        stack = stack.drop(1)

        currentTerm match {
          case Apply(Select(inner, "important"), List(styles)) =>
            stack = (styles, currentPrefix, true) :: stack
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Inlined(_, _, inner) =>
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Select(inner, name) =>
            val methodName = methodNameToTailwindClass(name)
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Ident("tw") =>
          // No action needed, just continue processing the remaining stack
          case Apply(Ident(name), List(arg)) =>
            val methodName = methodNameToTailwindClass(name)
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}"
            classNames = classNames :+ className
            stack = (arg, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(value)))) if name == "raw" =>
            val className = s"$currentPrefix${if (currentImportant) "!" else ""}$value"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(opacity)))) if name.endsWith("$") =>
            val methodName = methodNameToTailwindClass(name.stripSuffix("$"))
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}/${opacity}"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(value)))) =>
            val methodName = methodNameToTailwindClass(name)
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}[$value]"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Apply(Ident(name), args), List(Literal(StringConstant(value)))) =>
            val methodName = methodNameToTailwindClass(name)
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}[$value]"
            classNames = classNames :+ className
            stack = args.map(arg => (arg, currentPrefix, currentImportant)) ++ stack
          case Apply(Select(Ident("tw"), name), List(inner)) =>
            val methodName = methodNameToTailwindClass(name)
            stack = (inner, s"$currentPrefix${methodName}:", currentImportant) :: stack
          case Apply(Select(inner, "variant"), List(Literal(StringConstant(selector)), styles)) =>
            val variantPrefix = s"$currentPrefix[$selector]:" // Use the selector as provided
            val styleClasses =
              extractClassNames(styles, variantPrefix, currentImportant) // Extract classes with the variant prefix
            classNames = classNames ++ styleClasses
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), args) =>
            val methodName   = methodNameToTailwindClass(name)
            val innerClasses = args.flatMap(arg => extractClassNames(arg, s"$currentPrefix${methodName}:"))
            classNames = classNames ++ innerClasses
            stack = (inner, currentPrefix, currentImportant) :: stack
          case unexpectedTerm =>
            report.errorAndAbort(s"Unexpected term: $unexpectedTerm")
        }
      }
    }

    classNames
  }

  val term            = tailwindExpr.asTerm
  val classList       = extractClassNames(term).reverse
  val combinedClasses = classList.mkString(" ")
  Expr(combinedClasses)
}

val tw = Tailwind()

case class Tailwind() {
  def hover(@unused styles: Tailwind): Tailwind     = this
  def focus(@unused styles: Tailwind): Tailwind     = this
  def active(@unused styles: Tailwind): Tailwind    = this
  def group: Tailwind                               = this
  def sm(@unused styles: Tailwind): Tailwind        = this
  def md(@unused styles: Tailwind): Tailwind        = this
  def lg(@unused styles: Tailwind): Tailwind        = this
  def xl(@unused styles: Tailwind): Tailwind        = this
  def _2xl(@unused styles: Tailwind): Tailwind      = this
  def important(@unused styles: Tailwind): Tailwind = this
  def raw(@unused classString: String): Tailwind    = this
  def flex: Tailwind                                = tw
  def flex_1: Tailwind                              = tw
  def flex_col: Tailwind                            = tw
  def min_h_svh: Tailwind                           = tw
  def justify_center: Tailwind                      = tw
  def relative: Tailwind                            = tw
  def bg_sap_brand: Tailwind                        = tw
  def bg_sap_background: Tailwind                   = tw
  def bg_sap_neutral: Tailwind                      = tw
  def text_sap_text: Tailwind                       = tw
  def text_sap_brand: Tailwind                      = tw
  def border_sap_neutral: Tailwind                  = tw
  def border_grid: Tailwind                         = tw
  def border_border: Tailwind                       = tw
  def container_wrapper: Tailwind                   = tw
  def no_scrollbar: Tailwind                        = tw
  def sidebar_item_hover: Tailwind                  = tw
  def bg_black: Tailwind                            = tw
  def sticky: Tailwind                              = tw
  def border_b: Tailwind                            = tw
  def border_l: Tailwind                            = tw
  def border_r: Tailwind                            = tw
  def border_t: Tailwind                            = tw
  def container: Tailwind                           = tw
  def mr_4: Tailwind                                = tw
  def mr_6: Tailwind                                = tw
  def h_6: Tailwind                                 = tw
  def h_14: Tailwind                                = tw
  def w_6: Tailwind                                 = tw
  def object_contain: Tailwind                      = tw
  def inline_block: Tailwind                        = tw
  def font_bold: Tailwind                           = tw
  def ml_auto: Tailwind                             = tw
  def items_center: Tailwind                        = tw
  def gap_2: Tailwind                               = tw
  def gap_4: Tailwind                               = tw
  def gap_6: Tailwind                               = tw
  def gap_10: Tailwind                              = tw
  def items_start: Tailwind                         = tw
  def grid: Tailwind                                = tw
  def py_0: Tailwind                                = tw
  def py_4: Tailwind                                = tw
  def py_6: Tailwind                                = tw
  def py_8: Tailwind                                = tw
  def mx_auto: Tailwind                             = tw
  def w_full: Tailwind                              = tw
  def min_w_0: Tailwind                             = tw
  def max_w_2xl: Tailwind                           = tw
  def hidden: Tailwind                              = tw
  def text_sm: Tailwind                             = tw
  def block: Tailwind                               = tw
  def top_0: Tailwind                               = tw
  def top_20: Tailwind                              = tw
  def _mt_6: Tailwind                               = tw
  def pt_4: Tailwind                                = tw
  def text_balance: Tailwind                        = tw
  def text_center: Tailwind                         = tw
  def text_left: Tailwind                           = tw
  def leading_loose: Tailwind                       = tw
  def justify_end: Tailwind                         = tw
  def z_50: Tailwind                                = tw
  def bg_opacity_95: Tailwind                       = tw
  def backdrop_blur: Tailwind                       = tw
  def absolute: Tailwind                            = tw
  def opacity_0: Tailwind                           = tw
  def opacity_10: Tailwind                          = tw
  def opacity_50: Tailwind                          = tw
  def opacity_80: Tailwind                          = tw
  def opacity_100: Tailwind                         = tw
  def border_0: Tailwind                            = tw
  def rounded: Tailwind                             = tw
  def transition_all: Tailwind                      = tw
  def duration_300: Tailwind                        = tw
  def `gap_0.5`: Tailwind                           = tw
  def ease_out: Tailwind                            = tw
  def text_white: Tailwind                          = tw
  def `h_0.5`: Tailwind                             = tw
  def `_bottom_1.5`: Tailwind                       = tw
  def space_y_2: Tailwind                           = tw
  def h_9: Tailwind                                 = tw
  def transition_colors: Tailwind                   = tw
  def m_0: Tailwind                                 = tw
  def whitespace_pre_wrap: Tailwind                 = tw
  def rounded_md: Tailwind                          = tw
  def overflow_hidden: Tailwind                     = tw
  def inline_flex: Tailwind                         = tw
  def cursor_pointer: Tailwind                      = tw
  def w_9: Tailwind                                 = tw
  def border_none: Tailwind                         = tw
  def outline_none: Tailwind                        = tw
  def right_6: Tailwind                             = tw
  def top_4: Tailwind                               = tw
  def bg_neutral_800: Tailwind                      = tw
  def px_3: Tailwind                                = tw
  def py_1: Tailwind                                = tw
  def mb_4: Tailwind                                = tw
  def font_semibold: Tailwind                       = tw
  def text_lg: Tailwind                             = tw
  def px_8: Tailwind                                = tw
  def gap_1: Tailwind                               = tw
  def mb_5: Tailwind                                = tw
  def z_10: Tailwind                                = tw
  def p_10: Tailwind                                = tw
  def min_h_(value: String): Tailwind               = tw
  def border: Tailwind                              = tw
  def h_full: Tailwind                              = tw
  def overflow_y_auto: Tailwind                     = tw
  def font_medium: Tailwind                         = tw
  def h_8: Tailwind                                 = tw
  def rounded_lg: Tailwind                          = tw
  def font_normal: Tailwind                         = tw
  def px_2: Tailwind                                = tw
  def grid_flow_row: Tailwind                       = tw
  def ml_2: Tailwind                                = tw
  def shrink_0: Tailwind                            = tw
  def auto_rows_max: Tailwind                       = tw
  def overflow_auto: Tailwind                       = tw
  def pr_4: Tailwind                                = tw
  def fixed: Tailwind                               = tw
  def top_14: Tailwind                              = tw
  def z_30: Tailwind                                = tw
  def ml_0: Tailwind                                = tw
  def ml_4: Tailwind                                = tw
  def ml_6: Tailwind                                = tw
  def ml_8: Tailwind                                = tw
  def p_4: Tailwind                                 = tw
  def space_y_4: Tailwind                           = tw
  def flex_wrap: Tailwind                           = tw
  def w_(value: String): Tailwind                   = tw
  def h_(value: String): Tailwind                   = tw
  def space_x_2: Tailwind                           = tw
  def space_x_4: Tailwind                           = tw
  def text_green_500: Tailwind                      = tw
  def text_red_500: Tailwind                        = tw
  def text_orange_500: Tailwind                     = tw
  def p_6: Tailwind                                 = tw
  def text_2xl: Tailwind                            = tw
  def mt_0: Tailwind                                = tw
  def grid_cols_(value: String): Tailwind           = tw
}
