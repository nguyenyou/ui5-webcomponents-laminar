package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.litHtml.mod.ResultType
import io.github.nguyenyou.ui5.webcomponents.litHtml.mod.TemplateResult
import io.github.nguyenyou.ui5.webcomponents.std.TemplateStringsArray
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesOpenUI5EnablementMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Enablement", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OpenUI5Enablement
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Enablement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def enrichBusyIndicatorMetadata(
      klass: (Instantiable0[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
        ]) & TypeofUI5Element
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enrichBusyIndicatorMetadata")(klass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def enrichBusyIndicatorMethods(
      UI5ElementPrototype: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenUI5Element.prototype */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enrichBusyIndicatorMethods")(UI5ElementPrototype.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def enrichBusyIndicatorSettings(
      klass: (Instantiable0[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
        ]) & TypeofUI5Element
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enrichBusyIndicatorSettings")(klass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def getBusyIndicatorStyles(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBusyIndicatorStyles")().asInstanceOf[String]
    
    /* static member */
    inline def wrapTemplateResultInBusyMarkup(
      html: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[ResultType]],
      host: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesOpenUI5ElementMod.default,
      templateResult: TemplateResult[ResultType]
    ): TemplateResult[ResultType] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTemplateResultInBusyMarkup")(html.asInstanceOf[js.Any], host.asInstanceOf[js.Any], templateResult.asInstanceOf[js.Any])).asInstanceOf[TemplateResult[ResultType]]
  }
  
  trait OpenUI5Enablement extends StObject
}
