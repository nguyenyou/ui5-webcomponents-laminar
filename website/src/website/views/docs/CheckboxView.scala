package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object CheckboxView extends ExampleView("Checkbox") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Checkbox",
        content = Source.annotate {
          CheckBox(
            _.text := "Basic"
          )()
        }
      ),
      Demo(
        title = "Indeterminate",
        content = Source.annotate {
          CheckBox(
            _.text          := "Indeterminate",
            _.indeterminate := true,
            _.checked       := true
          )()
        }
      ),
      Demo(
        title = "States",
        content = Source.annotate {
          Variants(
            // Value States
            CheckBox(
              _.text       := "Positive",
              _.valueState := "Positive"
            )(),
            CheckBox(
              _.text       := "Negative",
              _.valueState := "Negative"
            )(),
            CheckBox(
              _.text       := "Critical",
              _.valueState := "Critical"
            )(),
            CheckBox(
              _.text       := "Information",
              _.valueState := "Information"
            )(),

            // Disabled States
            CheckBox(
              _.text     := "Disabled",
              _.disabled := true,
              _.checked  := true
            )(),
            CheckBox(
              _.text     := "Readonly",
              _.readonly := true,
              _.checked  := true
            )(),

            // Disabled with Value States
            CheckBox(
              _.text       := "Positive disabled",
              _.disabled   := true,
              _.valueState := "Positive",
              _.checked    := true
            )(),
            CheckBox(
              _.text       := "Negative disabled",
              _.disabled   := true,
              _.valueState := "Negative",
              _.checked    := true
            )(),
            CheckBox(
              _.text       := "Critical disabled",
              _.disabled   := true,
              _.valueState := "Critical",
              _.checked    := true
            )(),
            CheckBox(
              _.text       := "Information disabled",
              _.disabled   := true,
              _.valueState := "Information",
              _.checked    := true
            )(),

            // Readonly with Value States
            CheckBox(
              _.text       := "Positive readonly",
              _.readonly   := true,
              _.valueState := "Positive",
              _.checked    := true
            )(),
            CheckBox(
              _.text       := "Negative readonly",
              _.readonly   := true,
              _.valueState := "Negative",
              _.checked    := true
            )(),
            CheckBox(
              _.text       := "Critical readonly",
              _.readonly   := true,
              _.valueState := "Critical",
              _.checked    := true
            )(),
            CheckBox(
              _.text       := "Information readonly",
              _.readonly   := true,
              _.valueState := "Information",
              _.checked    := true
            )(),

            // Indeterminate with Value States
            CheckBox(
              _.text          := "Positive indeterminate",
              _.valueState    := "Positive",
              _.indeterminate := true,
              _.checked       := true
            )(),
            CheckBox(
              _.text          := "Negative indeterminate",
              _.valueState    := "Negative",
              _.indeterminate := true,
              _.checked       := true
            )(),
            CheckBox(
              _.text          := "Critical indeterminate",
              _.valueState    := "Critical",
              _.indeterminate := true,
              _.checked       := true
            )(),
            CheckBox(
              _.text          := "Information indeterminate",
              _.valueState    := "Information",
              _.indeterminate := true,
              _.checked       := true
            )()
          )
        }
      ),
      Demo(
        title = "Text Truncation and Wrapping",
        content = Source.annotate {
          div(
            CheckBox(
              _.text         := "Truncating text when 'wrapping-type=None' set and some long text.",
              _.wrappingType := "None"
            )(
              width.px(200)
            ),
            br(),
            CheckBox(
              _.text := "Wrapping text when the components is with its default 'wrapping-type=Normal' and some long text.",
              _.checked := true
            )(
              width.px(200)
            )
          )
        }
      )
    )
  }
}
