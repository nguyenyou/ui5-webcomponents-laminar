package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.Demo
import www.macros.Source

object TreeView extends ExampleView("Tree") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            Tree()(
              TreeItem(
                _.expanded := true,
                _.text     := "Tree 1",
                _.icon     := IconName.paste,
                _.selected := true
              )(
                TreeItem(
                  _.expanded := true,
                  _.text     := "Tree 1.1",
                  _.selected := true
                )(
                  TreeItem(
                    _.text := "Tree 1.1.1"
                  )(),
                  TreeItem(
                    _.text := "Tree 1.1.2"
                  )()
                )
              ),
              TreeItem(
                _.text := "Tree 2",
                _.icon := IconName.copy
              )(
                TreeItem(
                  _.text := "Tree 2.1"
                )(
                  TreeItem(
                    _.text := "Tree 2.1.1"
                  )(),
                  TreeItem(
                    _.text := "Tree 2.1.2"
                  )(
                    TreeItem(
                      _.text := "Tree 2.1.2.1"
                    )(),
                    TreeItem(
                      _.text := "Tree 2.1.2.2"
                    )(),
                    TreeItem(
                      _.text := "Tree 2.1.2.3"
                    )(),
                    TreeItem(
                      _.text := "Tree 2.1.2.5"
                    )()
                  )
                ),
                TreeItem(
                  _.text := "Tree 2.2"
                )()
              ),
              TreeItem(
                _.expanded := true,
                _.text     := "Tree 3 (no icon)"
              )()
            )
          )
        }
      ),
      Demo(
        title = "Custom Tree Items",
        content = Source.annotate {
          div(
            Tree()(
              div(
                slot := "header",
                Title(
                  _.level := "H5"
                )(
                  "Tree with custom items"
                )
              ),
              TreeItemCustom(
                _.expanded             := true,
                _.hideSelectionElement := true,
                _.tpe                  := "Active",
                _.content := Button(
                )(
                  "Level 1"
                )
              )(
                TreeItemCustom(
                  _.tpe      := "Active",
                  _.expanded := true,
                  _.content := Select(
                  )(
                    UOption()(
                      "Level 2"
                    ),
                    UOption()(
                      "Option 2.1"
                    ),
                    UOption()(
                      "Option 2.3"
                    )
                  )
                )(
                  TreeItemCustom(
                    _.hideSelectionElement := true,
                    _.tpe                  := "Active",
                    _.content := Button(
                    )(
                      "Level 3"
                    )
                  )(
                  )
                )
              )
            )
          )
        }
      )
    )
  }

}
