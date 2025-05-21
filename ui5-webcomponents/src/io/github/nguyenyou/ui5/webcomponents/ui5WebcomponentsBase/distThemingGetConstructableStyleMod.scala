package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.CSSStyleSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemingGetConstructableStyleMod {
  
  @JSImport("@ui5/webcomponents-base/dist/theming/getConstructableStyle.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns (and caches) a constructable style sheet for a web component class
    * Note: Chrome
    * @param ElementClass
    * @returns {*}
    */
  inline def default(
    ElementClass: (Instantiable0[
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
    ]) & TypeofUI5Element
  ): js.Array[CSSStyleSheet] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ElementClass.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSStyleSheet]]
}
