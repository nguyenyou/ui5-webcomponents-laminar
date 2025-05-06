```scala
package io.github.nguyenyou.ui5.webcomponents.laminar.shared

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Assets {
  @JSImport("@ui5/webcomponents/dist/Assets.js", JSImport.Namespace)
  @js.native
  object WebComponents extends js.Object

  @JSImport("@ui5/webcomponents-fiori/dist/Assets.js", JSImport.Namespace)
  @js.native
  object WebComponentsFiori extends js.Object

  @JSImport("@ui5/webcomponents-compat/dist/Assets.js", JSImport.Namespace)
  @js.native
  object WebComponentsCompat extends js.Object

  @JSImport("@ui5/webcomponents-ai/dist/Assets.js", JSImport.Namespace)
  @js.native
  object WebComponentsAi extends js.Object
}
```