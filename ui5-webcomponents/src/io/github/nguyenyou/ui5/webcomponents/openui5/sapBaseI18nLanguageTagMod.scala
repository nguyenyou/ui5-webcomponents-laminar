package io.github.nguyenyou.ui5.webcomponents.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseI18nLanguageTagMod {
  
  @JSImport("sap/base/i18n/LanguageTag", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LanguageTag {
    def this(/**
      * the language tag identifier, in format en-US or en_US.
      */
    sLanguageTag: String) = this()
    
    /**
      * Get the extension as a single string or `null`.
      *
      * The extension always consists of a singleton character (not 'x'), a dash '-' and one or more extension
      * token, each separated again with a dash.
      */
    /* CompleteClass */
    var `extension`: String | Null = js.native
    
    /**
      * Get the extensions as an array of tokens.
      *
      * The leading singleton and the separating dashes are not part of the result. If there is no extensions
      * section in the language tag, an empty array is returned.
      */
    /* CompleteClass */
    var extensionSubtags: js.Array[String] = js.native
    
    /**
      * Get the language.
      *
      * Note that the case might differ from the original script tag (Lower case is enforced as recommended by
      * BCP47/ISO639).
      */
    /* CompleteClass */
    var language: String = js.native
    
    /**
      * Get the region or `null` if none was specified.
      *
      * Note that the case might differ from the original script tag (Upper case is enforced as recommended by
      * BCP47/ISO3166-1).
      */
    /* CompleteClass */
    var region: String = js.native
    
    /**
      * Get the script or `null` if none was specified.
      *
      * Note that the case might differ from the original language tag (Upper case first letter and lower case
      * reminder enforced as recommended by BCP47/ISO15924)
      */
    /* CompleteClass */
    var script: String | Null = js.native
    
    /**
      * Get the variants as a single string or `null`.
      *
      * Multiple variants are separated by a dash '-'.
      */
    /* CompleteClass */
    var variant: String | Null = js.native
    
    /**
      * Get the variants as an array of individual variants.
      *
      * The separating dashes are not part of the result. If there is no variant section in the language tag,
      * an empty array is returned.
      */
    /* CompleteClass */
    var variantSubtags: js.Array[String] = js.native
  }
  
  trait LanguageTag extends StObject {
    
    /**
      * Get the extension as a single string or `null`.
      *
      * The extension always consists of a singleton character (not 'x'), a dash '-' and one or more extension
      * token, each separated again with a dash.
      */
    var `extension`: String | Null
    
    /**
      * Get the extensions as an array of tokens.
      *
      * The leading singleton and the separating dashes are not part of the result. If there is no extensions
      * section in the language tag, an empty array is returned.
      */
    var extensionSubtags: js.Array[String]
    
    /**
      * Get the language.
      *
      * Note that the case might differ from the original script tag (Lower case is enforced as recommended by
      * BCP47/ISO639).
      */
    var language: String
    
    /**
      * Get the region or `null` if none was specified.
      *
      * Note that the case might differ from the original script tag (Upper case is enforced as recommended by
      * BCP47/ISO3166-1).
      */
    var region: String
    
    /**
      * Get the script or `null` if none was specified.
      *
      * Note that the case might differ from the original language tag (Upper case first letter and lower case
      * reminder enforced as recommended by BCP47/ISO15924)
      */
    var script: String | Null
    
    /**
      * Get the variants as a single string or `null`.
      *
      * Multiple variants are separated by a dash '-'.
      */
    var variant: String | Null
    
    /**
      * Get the variants as an array of individual variants.
      *
      * The separating dashes are not part of the result. If there is no variant section in the language tag,
      * an empty array is returned.
      */
    var variantSubtags: js.Array[String]
  }
  object LanguageTag {
    
    inline def apply(
      extensionSubtags: js.Array[String],
      language: String,
      region: String,
      variantSubtags: js.Array[String]
    ): LanguageTag = {
      val __obj = js.Dynamic.literal(extensionSubtags = extensionSubtags.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], variantSubtags = variantSubtags.asInstanceOf[js.Any], script = null, variant = null)
      __obj.updateDynamic("extension")(null)
      __obj.asInstanceOf[LanguageTag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageTag] (val x: Self) extends AnyVal {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionNull: Self = StObject.set(x, "extension", null)
      
      inline def setExtensionSubtags(value: js.Array[String]): Self = StObject.set(x, "extensionSubtags", value.asInstanceOf[js.Any])
      
      inline def setExtensionSubtagsVarargs(value: String*): Self = StObject.set(x, "extensionSubtags", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptNull: Self = StObject.set(x, "script", null)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantSubtags(value: js.Array[String]): Self = StObject.set(x, "variantSubtags", value.asInstanceOf[js.Any])
      
      inline def setVariantSubtagsVarargs(value: String*): Self = StObject.set(x, "variantSubtags", js.Array(value*))
    }
  }
}
