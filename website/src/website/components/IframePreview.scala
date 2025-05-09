package website.components

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.StringAsIsCodec
import com.raquo.laminar.keys.HtmlAttr
import website.components.ThemeProvider.contentDensitySignal
import website.components.ThemeProvider.directionSignal
import website.components.ThemeProvider.websiteThemeSignal
import website.examples.ExampleRenderer
import website.libs.scalawind.*
import website.utils.isDevelopment

val srcDocAttr = HtmlAttr[String]("srcDoc", StringAsIsCodec)

object IframePreview {

  def srcDocDevelopment(
      id: String,
      theme: String,
      contentDensity: String,
      direction: String
  ) = {
    s"""
       |<!DOCTYPE html>
       |<html>
       |<head>
       |  <meta charset="UTF-8">
       |  <meta name="viewport" content="width=device-width, initial-scale=1.0">
       |  <script>
       |    var initialTheme = "${theme}";
       |    var initialContentDensity = "${contentDensity}";
       |    var initialDirection = "${direction}";
       |  </script>
       |</head>
       |<body class="font-sans antialiased">
       |  <div id="${id}"></div>
       |  <script type="module" src="/main.js"></script>
       |</body>
       |</html>
      """.stripMargin
  }

  def srcDocProduction(
      id: String,
      theme: String,
      contentDensity: String,
      direction: String
  ) = {
    s"""
       |<!DOCTYPE html>
       |<html>
       |<head>
       |  <meta charset="UTF-8">
       |  <meta name="viewport" content="width=device-width, initial-scale=1.0">
       |  <link rel="stylesheet" crossorigin href="/assets/index-[REPLACE_THIS_WITH_INDEX_CSS_HASH].css">
       |  <script type="module" crossorigin src="/assets/index-[REPLACE_THIS_WITH_INDEX_JS_HASH].js"></script>
       |  <script>
       |    var initialTheme = "${theme}";
       |    var initialContentDensity = "${contentDensity}";
       |    var initialDirection = "${direction}";
       |  </script>
       |</head>
       |<body class="font-sans antialiased">
       |  <div id="${id}"></div>
       |  <script type="module" src="/main.js"></script>
       |</body>
       |</html>
      """.stripMargin
  }

  def apply(example: ExampleRenderer, title: String, iframeHeight: Int = 250)(
      sourceCode: String = ""
  ): HtmlElement = {
    val exampleId = example.id

    Preview(title) {
      div(
        child <-- websiteThemeSignal
          .combineWith(contentDensitySignal, directionSignal)
          .map { case (theme, contentDensity, direction) =>
            iframe(
              tw.border_0,
              width.percent(100),
              height.px(iframeHeight),
              srcDocAttr := {
                if (isDevelopment)
                  srcDocDevelopment(exampleId, theme, contentDensity, direction)
                else srcDocProduction(exampleId, theme, contentDensity, direction)
              }
            )
          }
      )
    } {
      if (sourceCode.isEmpty) {
        example.source
      } else {
        sourceCode
      }
    }
  }

}
