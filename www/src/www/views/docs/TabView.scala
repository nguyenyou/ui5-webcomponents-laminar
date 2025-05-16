package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import www.components.*
import www.macros.Source

object TabView extends ExampleView("Tab") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            TabContainer()(
              Tab(
                _.icon := IconName.menu,
                _.text := "Tab 1"
              )(
                Label()(
                  "Quibusdam, veniam! Architecto debitis iusto ad et, asperiores quisquam perferendis reprehenderit ipsa voluptate minus minima, perspiciatis cum. Totam harum necessitatibus numquam voluptatum."
                )
              ),
              Tab(
                _.icon     := IconName.menu,
                _.text     := "Tab 2",
                _.selected := true
              )(
                Label()(
                  "Lorem ipsum dolor sit amet consectetur adipisicing elit. Fuga magni facere error dicta beatae optio repudiandae vero, quidem voluptatibus perferendis eum maiores rem tempore voluptates aperiam eos enim delectus unde."
                )
              ),
              Tab(
                _.icon := IconName.menu,
                _.text := "Tab 3"
              )(
                Label()(
                  "Dignissimos debitis architecto temporibus doloribus reiciendis libero rem nemo, nobis quidem dolor praesentium, beatae voluptatum iste eveniet, nam voluptatem obcaecati ducimus dolore."
                )
              ),
              Tab(
                _.icon := IconName.menu,
                _.text := "Tab 4"
              )(
                Label()(
                  "Possimus ipsa eos impedit aut nisi repellendus recusandae, temporibus ducimus, necessitatibus tenetur facere, minima vero fugit rem reiciendis natus ratione quia numquam?"
                )
              ),
              TabSeparator()(),
              Tab(
                _.icon := IconName.menu,
                _.text := "Tab 5"
              )(
                Label()(
                  "Explicabo laboriosam ab consequuntur, qui dignissimos inventore sapiente ullam quaerat ratione libero vero, beatae laudantium! Aperiam numquam tempore, laudantium perferendis recusandae autem."
                )
              )
            )
          )
        }
      ),
      Demo(
        title = "Tab Layout",
        description = "The tabLayout is 'Standard' by default:",
        content = Source.annotate {
          TabContainer(
            _.tabLayout := "Standard",
            _.collapsed := true
          )(
            Tab(
              _.icon           := IconName.laptop,
              _.text           := "Monitors",
              _.additionalText := "10"
            )(),
            Tab(
              _.icon           := IconName.video,
              _.text           := "Cameras",
              _.selected       := true,
              _.additionalText := "2"
            )(),
            Tab(
              _.icon           := IconName.home,
              _.text           := "Rooms",
              _.additionalText := "16"
            )()
          )
        }
      ),
      Demo(
        description = "The tabLayout is 'Standard' by default:",
        content = Source.annotate {
          TabContainer(
            _.tabLayout := "Inline",
            _.collapsed := true
          )(
            Tab(
              _.icon           := IconName.laptop,
              _.text           := "Monitors",
              _.additionalText := "10"
            )(),
            Tab(
              _.icon           := IconName.video,
              _.text           := "Cameras",
              _.selected       := true,
              _.additionalText := "2"
            )(),
            Tab(
              _.icon           := IconName.home,
              _.text           := "Rooms",
              _.additionalText := "16"
            )()
          )
        }
      ),
      Demo(
        title = "Text-only Tabs",
        content = Source.annotate {
          TabContainer()(
            List.tabulate(23)(i =>
              Tab(
                _.text     := s"Tab ${i + 1}",
                _.selected := i == 12
              )()
            )
          )
        }
      ),
      Demo(
        title = "Nested Tabs",
        content = Source.annotate {
          TabContainer()(
            Tab(
              _.text := "Notes"
            )(),
            Tab(
              _.text := "Products",
              _.items := Tab(
                _.text := "Computers",
                _.items := Tab(
                  _.text := "Laptops"
                )(
                  "Laptops go here ..."
                ),
                _.items := Tab(
                  _.text := "Desktops",
                  _.items := Tab(
                    _.text := "Work Stations"
                  )(
                    "Work Stations go here ..."
                  ),
                  _.items := Tab(
                    _.text := "Game Stations"
                  )(
                    "Game Stations go here ..."
                  )
                )(
                  "Desktops go here ..."
                )
              )(
                "Computers go here ..."
              ),
              _.items := Tab(
                _.text := "Phones",
                _.items := Tab(
                  _.text := "Smartphones"
                )(
                  "Smartphones go here ..."
                ),
                _.items := Tab(
                  _.text := "Tablets"
                )(
                  "Tablets go here ..."
                )
              )(
                "Phones go here ..."
              )
            )(
              "Products go here ..."
            ),
            Tab(
              _.text := "Orders",
              _.items := Tab(
                _.text := "Attachments"
              )(
                "Order attachments go here ..."
              )
            )(
              "Orders go here ..."
            )
          )
        }
      ),
      Demo(
        title = "Tabs Overflow Mode",
        description = "The overflowMode is 'End' by default:",
        content = Source.annotate {
          TabContainer(
            _.overflowMode := "End",
            _.collapsed    := true
          )(
            List.tabulate(23)(i =>
              Tab(
                _.text     := s"Tab ${i + 1}",
                _.selected := i == 12
              )()
            )
          )
        }
      ),
      Demo(
        description = "It can be switched to 'StartAndEnd:",
        content = Source.annotate {
          TabContainer(
            _.overflowMode := "StartAndEnd",
            _.collapsed    := true
          )(
            List.tabulate(23)(i =>
              Tab(
                _.text     := s"Tab ${i + 1}",
                _.selected := i == 12
              )()
            )
          )
        }
      ),
      Demo(
        title = "Transparent design",
        description =
          """The inner TabContainer has headerBackgroundDesign and contentBackgroundDesign set to "Transparent":""",
        content = Source.annotate {
          div(
            TabContainer(
              _.headerBackgroundDesign  := "Solid",
              _.contentBackgroundDesign := "Transparent"
            )(
              Tab(
                _.text     := "Tab 1",
                _.selected := true
              )(
                TabContainer(
                  _.headerBackgroundDesign  := "Transparent",
                  _.contentBackgroundDesign := "Transparent"
                )(
                  Tab(
                    _.text     := "Tab 1",
                    _.selected := true
                  )(
                    Text()(
                      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Expedita voluptates accusamus est quibusdam inventore ipsam?"
                    )
                  ),
                  Tab(
                    _.text := "Tab 2"
                  )(
                    Text()(
                      "Accusamus minus aperiam sunt ipsam eos quos et maxime facilis tempora neque ratione nemo laborum expedita aliquid officiis nisi, necessitatibus quasi distinctio?"
                    )
                  ),
                  Tab(
                    _.text := "Tab 3"
                  )(
                    Text()(
                      "Dolores totam perferendis numquam incidunt obcaecati, id quo at alias rem deserunt praesentium repellat ipsum commodi consequuntur veniam et ducimus animi qui nobis accusantium tenetur eveniet culpa non!"
                    )
                  )
                )
              ),
              Tab(
                _.text := "Tab 2"
              )(
                Text()(
                  "Accusamus minus aperiam sunt ipsam eos quos et maxime facilis tempora neque ratione nemo laborum expedita aliquid officiis nisi, necessitatibus quasi distinctio?"
                )
              )
            )
          )
        }
      )
    )
  }
}
