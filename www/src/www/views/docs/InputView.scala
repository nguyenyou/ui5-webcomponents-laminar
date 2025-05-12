package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object InputView extends ExampleView("Input") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Input(
            _.value := "Input"
          )()
        }
      ),
      Demo(
        title = "Clear Icon",
        content = Source.annotate {
          Input(
            _.value         := "Input",
            _.showClearIcon := true
          )()
        }
      ),
      Demo(
        title = "Input with Suggestions",
        content = Source.annotate {
          val valueVar    = Var("")
          val valueSignal = valueVar.signal.distinct
          val databaseEntries = Seq(
            "Argentina",
            "Albania",
            "Algeria",
            "Angola",
            "Austria",
            "Australia",
            "Bulgaria",
            "Canada",
            "Columbia",
            "Croatia",
            "Denmark",
            "England",
            "Finland",
            "France",
            "Germany",
            "Hungary",
            "Ireland",
            "Italy",
            "Kuwait",
            "Luxembourg",
            "Mexico",
            "Morocco",
            "Norway",
            "Paraguay",
            "Philippines",
            "Portugal",
            "Spain",
            "Sweden",
            "Sri Lanka",
            "Senegal",
            "Thailand",
            "The United Kingdom of Great Britain and Northern Ireland",
            "USA"
          )
          val suggestionsSignal = valueSignal.map { value =>
            if (value.nonEmpty) {
              databaseEntries.filter(entry => entry.toLowerCase.contains(value.toLowerCase))
            } else {
              Seq.empty[String]
            }
          }

          Input(
            _.placeholder     := "Type 'a'",
            _.showSuggestions := true,
            _.value <-- valueVar.signal.distinct,
            _.onInput.map(_.target.value) --> valueVar.writer
          )(
            children <-- suggestionsSignal.map {
              _.map { suggestion =>
                SuggestionItem(_.text := suggestion)()
              }
            }
          )
        }
      )
    )
  }

}
