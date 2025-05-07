package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.scalawind.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distAvatarGroupMod.IAvatarGroupItem
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
        title = "Individual",
        content = Source.annotate {

          val popAvatar = Avatar(_.id := "popAvatar")()

          val personPopover = Popover(
            _.headerText          := "Person Card",
            _.placement           := "Bottom",
            _.preventFocusRestore := true
          )(
            width.px(300),
            cls("personPopover"),
            div(
              tw.flex.items_center.gap_2,
              div(
                cls("avatar-slot"),
                tw.inline_block,
                popAvatar
              ),
              div(
                cls("title-slot"),
                tw.inline_block,
                Title(_.level := "H5")("John Doe"),
                Title(_.level := "H5")("Software Developer")
              )
            )
          )

          val peoplePopover = Popover(
            _.headerText          := "My people",
            _.placement           := "Bottom",
            _.preventFocusRestore := true
          )(
            width.px(400),
            cls("peoplePopover"),
            div(
              cls("placeholder"),
              tw.flex.flex_wrap
            )
          )

          val avatarGroup = AvatarGroup(
            _.tpe := "Individual"
          )(
            Avatar(_.icon := IconName.employee, _.size := "M")(),
            Avatar(_.icon := IconName.employee, _.size := "M")(),
            Avatar(_.size := "M", _.initials := "JD")(),
            Avatar(_.size := "M")(
              img(src := Images.womanAvatar5, alt := "Woman Avatar 5")
            ),
            Avatar(_.size := "M")(
              img(src := Images.manAvatar3, alt := "Man Avatar 3")
            ),
            Avatar(_.icon := IconName.employee, _.size := "M")(),
            Avatar(_.icon := IconName.employee, _.size := "M")(),
            Avatar(_.size := "M", _.initials := "JD")(),
            Avatar(_.size := "M")(
              img(src := Images.womanAvatar5, alt := "Woman Avatar 5")
            ),
            Avatar(_.size := "M")(
              img(src := Images.manAvatar3, alt := "Man Avatar 3")
            ),
            Avatar(_.icon := IconName.employee, _.size := "M")(),
            Avatar(_.icon := IconName.employee, _.size := "M")(),
            Avatar(_.size := "M", _.initials := "JD")(),
            Avatar(_.size := "M")(
              img(src := Images.womanAvatar5, alt := "Woman Avatar 5")
            ),
            Avatar(_.size := "M")(
              img(src := Images.manAvatar3, alt := "Man Avatar 3")
            )
          )

          def onButtonClicked(targetRef: IAvatarGroupItem) = {
            println(targetRef)
          }

          def onAvatarClicked(avatarRef: IAvatarGroupItem) = {
            // scalafix:off
            val avatarIndex = avatarGroup.ref.items.indexOf(avatarRef)
            avatarGroup.ref.colorScheme.lift(avatarIndex).foreach { colorScheme =>
              popAvatar.ref.colorScheme = colorScheme.asInstanceOf[String]
              popAvatar.ref.initials = avatarRef.asInstanceOf[Avatar.Ref].initials

              while (Option(popAvatar.ref.firstChild).isDefined) {
                popAvatar.ref.removeChild(popAvatar.ref.firstChild)
              }
              avatarRef.asInstanceOf[Avatar.Ref].image.foreach { image =>
                popAvatar.ref.appendChild(image.cloneNode())
              }
              popAvatar.ref.icon = avatarRef.asInstanceOf[Avatar.Ref].icon
              personPopover.ref.open = false
              personPopover.ref.opener = avatarRef.asInstanceOf[org.scalajs.dom.HTMLElement]
              personPopover.ref.open = true
            }
            // scalafix:on

          }

          avatarGroup.amend(
            AvatarGroup.onClick.map { event =>
              val target = event.detail.targetRef.asInstanceOf[IAvatarGroupItem] // scalafix:ok
              if (event.detail.overflowButtonClicked) {
                onButtonClicked(target)
              } else {
                onAvatarClicked(target)
              }
            } --> Observer.empty
          )

          val slider = Slider(
            _.id    := "sliderIndividual",
            _.value := 60,
            _.min   := 1,
            _.max   := 100,
            _.onInput.map { event =>
              avatarGroup.ref.style.width = s"${event.target.value}%"
            } --> Observer.empty
          )()

          avatarGroup.ref.style.width = s"${slider.ref.value}%"

          div(
            personPopover,
            peoplePopover,
            slider,
            avatarGroup
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
