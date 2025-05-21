package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/InputType.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InputType & String] = js.native
    
    /* "Email" */ val Email: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType.Email & String = js.native
    
    /* "Number" */ val Number: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType.Number & String = js.native
    
    /* "Password" */ val Password: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType.Password & String = js.native
    
    /* "Search" */ val Search: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType.Search & String = js.native
    
    /* "Tel" */ val Tel: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType.Tel & String = js.native
    
    /* "Text" */ val Text: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType.Text & String = js.native
    
    /* "URL" */ val URL: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType.URL & String = js.native
  }
  
  @js.native
  sealed trait InputType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/InputType.js", "InputType")
  @js.native
  object InputType extends StObject {
    
    /**
      * Used for input fields that must contain an e-mail address.
      * @public
      */
    @js.native
    sealed trait Email
      extends StObject
         with InputType
    
    /**
      * Defines a numeric input field.
      * @public
      */
    @js.native
    sealed trait Number
      extends StObject
         with InputType
    
    /**
      * Defines a password field.
      * @public
      */
    @js.native
    sealed trait Password
      extends StObject
         with InputType
    
    /**
      * Used for input fields that should contain a search term.
      * @since 2.0.0
      * @public
      */
    @js.native
    sealed trait Search
      extends StObject
         with InputType
    
    /**
      * Used for input fields that should contain a telephone number.
      * @public
      */
    @js.native
    sealed trait Tel
      extends StObject
         with InputType
    
    /**
      * Defines a one-line text input field:
      * @public
      */
    @js.native
    sealed trait Text
      extends StObject
         with InputType
    
    /**
      * Used for input fields that should contain a URL address.
      * @public
      */
    @js.native
    sealed trait URL
      extends StObject
         with InputType
  }
}
