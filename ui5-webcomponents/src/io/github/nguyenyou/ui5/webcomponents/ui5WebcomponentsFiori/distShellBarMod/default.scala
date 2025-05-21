package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  * ### Overview
  *
  * The `ui5-shellbar` is meant to serve as an application header
  * and includes numerous built-in features, such as: logo, profile image/icon, title, search field, notifications and so on.
  *
  * ### Stable DOM Refs
  *
  * You can use the following stable DOM refs for the `ui5-shellbar`:
  *
  * - logo
  * - notifications
  * - overflow
  * - profile
  * - product-switch
  *
  * ### Keyboard Handling
  *
  * #### Fast Navigation
  * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
  * In order to use this functionality, you need to import the following module:
  * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
  *
  * ### ES6 Module Import
  * `import "@ui5/webcomponents-fiori/dist/ShellBar.js";`
  * @csspart root - Used to style the outermost wrapper of the `ui5-shellbar`
  * @constructor
  * @extends UI5Element
  * @public
  * @since 0.8.0
  */
@JSImport("@ui5/webcomponents-fiori/dist/ShellBar.js", JSImport.Default)
@js.native
open class default () extends ShellBar
object default {
  
  @JSImport("@ui5/webcomponents-fiori/dist/ShellBar.js", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@ui5/webcomponents-fiori/dist/ShellBar.js", "default.i18nBundle")
  @js.native
  def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
  inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
}
