package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.scalawind.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object AvatarGroupView extends ExampleView("Avatar Group") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          AvatarGroup()(
            Avatar(
              _.size := "S"
            )(
              img(
                src := Images.manAvatar1,
                alt := "Man Avatar 1"
              )
            ),
            Avatar(
              _.size     := "S",
              _.initials := "JD"
            )(),
            Avatar(
              _.size := "S"
            )(
              img(
                src := Images.womanAvatar5,
                alt := "Woman Avatar 5"
              )
            ),
            Avatar(
              _.size := "S"
            )(
              img(
                src := Images.manAvatar3,
                alt := "Man Avatar 3"
              )
            )
          )
        }
      ),
      Demo(
        title = "Types And Sizes",
        content = Source.annotate {
          div(
            tw.space_y_4,
            AvatarGroup(
              _.tpe := "Individual"
            )(
              Avatar(
                _.size := "S"
              )(
                img(
                  src := Images.manAvatar1,
                  alt := "Man Avatar 1"
                )
              ),
              Avatar(
                _.size     := "S",
                _.initials := "JD"
              )(),
              Avatar(
                _.size := "S"
              )(
                img(
                  src := Images.womanAvatar5,
                  alt := "Woman Avatar 5"
                )
              ),
              Avatar(
                _.size := "S"
              )(
                img(
                  src := Images.manAvatar3,
                  alt := "Man Avatar 3"
                )
              )
            ),
            AvatarGroup(
              _.tpe := "Individual"
            )(
              Avatar(
                _.size := "M"
              )(
                img(
                  src := Images.manAvatar1,
                  alt := "Man Avatar 1"
                )
              ),
              Avatar(
                _.size     := "M",
                _.initials := "JD"
              )(),
              Avatar(
                _.size := "M"
              )(
                img(
                  src := Images.womanAvatar5,
                  alt := "Woman Avatar 5"
                )
              ),
              Avatar(
                _.size := "M"
              )(
                img(
                  src := Images.manAvatar3,
                  alt := "Man Avatar 3"
                )
              )
            ),
            AvatarGroup()(
              Avatar(
                _.size := "L"
              )(
                img(
                  src := Images.manAvatar1,
                  alt := "Man Avatar 1"
                )
              ),
              Avatar(
                _.size     := "L",
                _.initials := "JD"
              )(),
              Avatar(
                _.size := "L"
              )(
                img(
                  src := Images.womanAvatar5,
                  alt := "Woman Avatar 5"
                )
              ),
              Avatar(
                _.size := "L"
              )(
                img(
                  src := Images.manAvatar3,
                  alt := "Man Avatar 3"
                )
              )
            ),
            AvatarGroup()(
              Avatar(
                _.size := "XL"
              )(
                img(
                  src := Images.manAvatar1,
                  alt := "Man Avatar 1"
                )
              ),
              Avatar(
                _.size     := "XL",
                _.initials := "JD"
              )(),
              Avatar(
                _.size := "XL"
              )(
                img(
                  src := Images.womanAvatar5,
                  alt := "Woman Avatar 5"
                )
              ),
              Avatar(
                _.size := "XL"
              )(
                img(
                  src := Images.manAvatar3,
                  alt := "Man Avatar 3"
                )
              )
            )
          )
        }
      ),
      Demo(
        title = "Group",
        content = Source.annotate {
          AvatarGroup(
            _.tpe := "Group"
          )(
            Avatar(
              _.icon := IconName.clearAll,
              _.size := "M"
            )(),
            Avatar(
              _.icon := IconName.accidentalLeave,
              _.size := "M"
            )(),
            Avatar(
              _.icon := IconName.activityItems,
              _.size := "M"
            )(),
            Avatar(
              _.icon := IconName.arrowBottom,
              _.size := "M"
            )(),
            Avatar(
              _.icon := IconName.step,
              _.size := "M"
            )()
          )
        }
      )
    )
  }
}
