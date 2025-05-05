package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod

import io.github.nguyenyou.ui5.webcomponents.std.Exclude
import io.github.nguyenyou.ui5.webcomponents.std.Extract
import io.github.nguyenyou.ui5.webcomponents.std.Partial
import io.github.nguyenyou.ui5.webcomponents.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Booleanish = Boolean

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // Distribute over unions
Props extends any ? std.Partial<std.Pick<Props, std.Extract<keyof Props, keyof Defaults>>> & // Include the remaining properties from Props
std.Pick<Props, std.Exclude<keyof Props, keyof Defaults>> : never
  }}}
  */
type Defaultize[Props, Defaults] = (Partial[Pick[Props, Extract[/* keyof Props */ String, /* keyof Defaults */ String]]]) & (// Include the remaining properties from Props
Pick[Props, Exclude[/* keyof Props */ String, /* keyof Defaults */ String]])
