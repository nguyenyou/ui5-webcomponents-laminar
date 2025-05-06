package website.macros

import com.raquo.laminar.api.L

import scala.quoted.*

object Source {

  // @TODO: find out how to convert this to case class
  type AnnotationType = (String, L.HtmlElement)

  // source: https://github.com/japgolly/scalajs-react/blob/master/
  //         gh-pages-macros/src/main/scala/ghpages/GhPagesMacros.scala
  @annotation.tailrec
  private def trimLeftAll(listStr: Array[String]): Array[String] =
    if (
      listStr.nonEmpty && listStr.forall(
        _.headOption forall Character.isWhitespace
      )
    ) {
      trimLeftAll(listStr.map(str => if (str.isEmpty) str else str.tail))
    } else {
      listStr
    }

  private def indexWhereNotWhitespace(string: Option[String]) =
    string.fold(-1)(_.indexWhere(c => !c.isWhitespace))

  @SuppressWarnings(
    Array(
      "scalafix:DisableSyntax.var"
    )
  )
  def annotateImpl(
      element: Expr[L.HtmlElement]
  )(using
      Quotes
  ): Expr[AnnotationType] = {

    import quotes.reflect.*
    // get original source
    val sourceFile = Position.ofMacroExpansion.sourceFile.content.get
    val startLine  = Position.ofMacroExpansion.startLine + 1
    val endLine    = Position.ofMacroExpansion.endLine
    var lines      = sourceFile.split("\n").slice(startLine, endLine)

    // remove wrapping `{}` if exist
    if (
      lines.headOption.contains("{") &&
      lines.lastOption.exists(_.matches(" +}"))
    ) {
      lines = lines.drop(1).dropRight(1)
    }

    // add whitespace to first line to align it with last line
    val headFirstNonWS = indexWhereNotWhitespace(lines.headOption)
    val lastFirstNonWS = indexWhereNotWhitespace(lines.lastOption)
    if (headFirstNonWS == 0 && lastFirstNonWS > 0) {
      lines.headOption.foreach { orgHead =>
        val newHead = (" " * (lastFirstNonWS - headFirstNonWS)) + orgHead
        lines.update(0, newHead)
      }
    }

    // format and export
    val output = trimLeftAll(lines).mkString("\n")
    Expr.ofTuple(Expr[String](output), element)
  }

  inline def annotate(inline element: L.HtmlElement): AnnotationType = ${
    annotateImpl('element)
  }

}
