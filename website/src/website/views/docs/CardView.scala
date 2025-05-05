package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.scalawind.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object CardView extends ExampleView("Card") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Card(
            _.header := CardHeader(
              _.titleText      := "This header is interactive",
              _.subtitleText   := "Click, press Enter or Space",
              _.additionalText := "3 of 6",
              _.interactive    := true,
              _.avatar := Icon(
                _.name := IconName.group
              )()
            )()
          )(
            List(
              _.separators := "None"
            )(
              ListItemStandard(
                _.description := "Software Architect",
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := Images.manAvatar2
                  )
                )
              )(
                "Richard Wilson"
              ),
              ListItemStandard(
                _.description := "Visual Designer",
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/woman_avatar_3.png",
                    alt := "Woman image"
                  )
                )
              )(
                "Elena Petrova"
              ),
              ListItemStandard(
                _.description := "Quality Specialist",
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/man_avatar_3.png",
                    alt := "Man image"
                  )
                )
              )(
                "John Miller"
              )
            )
          )
        }
      )
    )
  }

}
