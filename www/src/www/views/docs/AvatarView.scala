package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object AvatarView extends ExampleView("Avatar") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Initials",
        content = Source.annotate {
          Avatar(
            _.initials := "FJ"
          )()
        }
      ),
      Demo(
        title = "Shapes",
        content = Source.annotate {
          div(
            tw.flex.flex_wrap.gap_2,
            Avatar(
              _.shape    := "Circle", // [!code highlight]
              _.size     := "M", 
              _.initials := "CI"
            )(),
            Avatar(
              _.shape    := "Square", // [!code highlight]
              _.size     := "M",
              _.initials := "Sq"
            )(),
          )
        }
      ),
      Demo(
        title = "Sizes",
        content = Source.annotate {
          div(
            tw.flex.flex_wrap.gap_2,
            Avatar(
              _.size     := "XS",
              _.initials := "XS"
            )(),
            Avatar(
              _.size     := "S",
              _.initials := "S"
            )(),
            Avatar(
              _.size     := "M",
              _.initials := "M"
            )(),
            Avatar(
              _.size     := "L",
              _.initials := "L"
            )(),
            Avatar(
              _.size     := "XL",
              _.initials := "XL"
            )()
          )
        }
      ),
      Demo(
        title = "Interactive",
        content = Source.annotate {
          Avatar(
            _.interactive := true,
            _.initials    := "XS"
          )()
        }
      ),
      Demo(
        title = "Color Schemes",
        content = Source.annotate {
          div(
            tw.flex.flex_wrap.gap_2,
            Avatar(
              _.colorScheme := "Accent1"
            )(),
            Avatar(
              _.colorScheme := "Accent2"
            )(),
            Avatar(
              _.colorScheme := "Accent3"
            )(),
            Avatar(
              _.colorScheme := "Accent4"
            )(),
            Avatar(
              _.colorScheme := "Accent5"
            )(),
            Avatar(
              _.colorScheme := "Accent6"
            )(),
            Avatar(
              _.colorScheme := "Accent7"
            )(),
            Avatar(
              _.colorScheme := "Accent8"
            )(),
            Avatar(
              _.colorScheme := "Accent9"
            )(),
            Avatar(
              _.colorScheme := "Accent10"
            )(),
            Avatar(
              _.colorScheme := "Placeholder"
            )()
          )
        }
      ),
      Demo(
        title = "With Icon",
        content = Source.annotate {
          div(
            tw.flex.flex_wrap.gap_2,
            Avatar(
              _.icon := IconName.filter,
              _.size := "XS"
            )(),
            Avatar(
              _.icon := IconName.employee,
              _.size := "S"
            )(),
            Avatar(
              _.icon := IconName.product,
              _.size := "M"
            )(),
            Avatar(
              _.icon := IconName.supplier,
              _.size := "L"
            )(),
            Avatar(
              _.icon := IconName.shippingStatus,
              _.size := "XL"
            )()
          )
        }
      ),
      Demo(
        title = "With Image",
        content = Source.annotate {
          div(
            tw.flex.flex_wrap.gap_2,
            Avatar(
              _.size := "XS"
            )(
              img(
                src := Images.womanAvatar1,
                alt := "Woman Avatar 1"
              )
            ),
            Avatar(
              _.size := "S"
            )(
              img(
                src := Images.womanAvatar1,
                alt := "Woman Avatar 1"
              )
            ),
            Avatar(
              _.size := "M"
            )(
              img(
                src := Images.womanAvatar1,
                alt := "Woman Avatar 1"
              )
            ),
            Avatar(
              _.size := "L"
            )(
              img(
                src := Images.womanAvatar1,
                alt := "Woman Avatar 1"
              )
            ),
            Avatar(
              _.size := "XL"
            )(
              img(
                src := Images.womanAvatar1,
                alt := "Woman Avatar 1"
              )
            )
          )
        }
      ),
      Demo(
        title = "With Badge",
        content = Source.annotate {
          Avatar(
            _.initials := "AB",
            _.badge := Tag(
              _.icon := Icon(_.name := IconName.accelerated)()
            )()
          )()
        }
      ),
      Demo(
        title = "Custom Styling",
        content = Source.annotate {
          Avatar(
            _.size        := "M",
            _.shape       := "Square",
            _.colorScheme := "Accent6"
          )(
            tw.w_("250px").h_("250px").border,
            cls("border-[var(--sapField_BorderColor)]"),
            img(
              src := Images.lampAvatar1,
              tw.w_full.h_full.object_contain,
              alt := "Lamp"
            )
          )
        }
      )
    )
  }
}
