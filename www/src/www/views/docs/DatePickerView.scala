package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.CalendarWeekNumbering
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object DatePickerView extends ExampleView("Date Picker") {
  @SuppressWarnings(
    Array(
      "scalafix:DisableSyntax.asInstanceOf"
    )
  )
  override def component: HtmlElement = {
    div(
      compactSize(true),
      Demo(
        title = "Basic Date Picker",
        content = Source.annotate {
          DatePicker()()
        }
      ),
      Demo(
        title = "States",
        content = Source.annotate {
          div(
            tw.flex.flex_wrap.gap_2,
            DatePicker(
              _.value             := "2024-02-29",
              _.valueState        := "Information",
              _.valueStateMessage := div("This date exists only once every four years!")
            )(
            ),
            DatePicker(
              _.value      := "2024-02-29",
              _.valueState := "Positive"
            )(),
            DatePicker(
              _.value      := "2024-02-29",
              _.valueState := "Negative"
            )(),
            DatePicker(
              _.value      := "2024-02-29",
              _.valueState := "Critical"
            )()
          )
        }
      ),
      Demo(
        title = "Date Picker with Min/Max Dates",
        content = Source.annotate {
          DatePicker(
            _.formatPattern := "dd/MM/yyyy",
            _.minDate       := "1/1/2020",
            _.maxDate       := "4/5/2020"
          )()
        }
      ),
      Demo(
        title = "Timezones",
        content = Source.annotate {
          DatePicker(
            _.value := "now"
          )()
        }
      ),
      Demo(
        title = "CalendarWeekNumbering",
        content = Source.annotate {
          val calendarWeekNumberingVar = Var[CalendarWeekNumbering]("Default")

          div(
            Select(
              _.id := "sel",
              _.onChange.map { event =>
                val selected = event.detail.selectedOption.getAttribute("data-calendar-week-numbering")
                selected.asInstanceOf[CalendarWeekNumbering]
              } --> calendarWeekNumberingVar.writer
            )(
              width.px(300),
              UOption()(
                dataAttr("calendar-week-numbering") := "ISO_8601",
                "ISO 8601"
              ),
              UOption()(
                dataAttr("calendar-week-numbering") := "MiddleEastern",
                "MiddleEastern"
              ),
              UOption()(
                dataAttr("calendar-week-numbering") := "WesternTraditional",
                "WesternTraditional"
              )
            ),
            DatePicker(
              _.id := "dp",
              _.calendarWeekNumbering <-- calendarWeekNumberingVar.signal
            )()
          )
        }
      )
    )
  }
}
