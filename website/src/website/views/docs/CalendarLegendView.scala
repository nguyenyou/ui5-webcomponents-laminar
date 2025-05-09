package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.CalendarLegendItemType
import www.components.Demo
import www.macros.Source

import scala.scalajs.js

object CalendarLegendView extends ExampleView("Calendar Legend") {

  val types = Vector(
    "Type05",
    "Type07",
    "Type13"
  )

  val now   = new js.Date()
  val year  = now.getFullYear().toInt
  val month = now.getMonth().toInt

  val specialDates = scala.util.Random.shuffle((1 to 28).toVector).take(10).map { day =>
    new js.Date(
      year,
      month,
      day,
      1,
      0,
      0,
      0
    )
  }

  def formatDate(date: js.Date): String = date.toISOString().take(10)

  @SuppressWarnings(
    Array(
      "scalafix:DisableSyntax.asInstanceOf"
    )
  )
  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Calendar(
            _.formatPattern := "YYYY-MM-dd"
          )(
            specialDates.zip(LazyList.continually(types).flatten).map { (date, tpe) =>
              SpecialCalendarDate(
                _.tpe   := tpe.asInstanceOf[CalendarLegendItemType],
                _.value := formatDate(date)
              )(
                slot := "specialDates"
              )
            },
            CalendarLegend(
              _.hideToday       := true,
              _.hideSelectedDay := true
            )(
              slot := "calendarLegend",
              CalendarLegendItem(
                _.text := "Holiday",
                _.tpe  := "Type05"
              )(),
              CalendarLegendItem(
                _.text := "School Vacation",
                _.tpe  := "Type07"
              )(),
              CalendarLegendItem(
                _.text := "Wedding",
                _.tpe  := "Type12"
              )()
            )
          )
        }
      )
    )
  }
}
