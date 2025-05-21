package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocaleLocaleMod {
  
  @JSImport("@ui5/webcomponents-base/dist/locale/Locale.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Locale {
    def this(sLocaleId: String) = this()
    
    /* CompleteClass */
    override def getExtension(): String | Null = js.native
    
    /* CompleteClass */
    override def getExtensionSubtags(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getLanguage(): String = js.native
    
    /* CompleteClass */
    override def getPrivateUse(): String | Null = js.native
    
    /* CompleteClass */
    override def getPrivateUseSubtags(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getRegion(): String = js.native
    
    /* CompleteClass */
    override def getScript(): String = js.native
    
    /* CompleteClass */
    override def getVariant(): String | Null = js.native
    
    /* CompleteClass */
    override def getVariantSubtags(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def hasPrivateUseSubtag(sSubtag: String): Boolean = js.native
    
    /* CompleteClass */
    var sExtension: String | Null = js.native
    
    /* CompleteClass */
    var sLanguage: String = js.native
    
    /* CompleteClass */
    var sLocaleId: String = js.native
    
    /* CompleteClass */
    var sPrivateUse: String | Null = js.native
    
    /* CompleteClass */
    var sRegion: String = js.native
    
    /* CompleteClass */
    var sScript: String = js.native
    
    /* CompleteClass */
    var sVariant: String | Null = js.native
  }
  
  trait Locale extends StObject {
    
    def getExtension(): String | Null
    
    def getExtensionSubtags(): js.Array[String]
    
    def getLanguage(): String
    
    def getPrivateUse(): String | Null
    
    def getPrivateUseSubtags(): js.Array[String]
    
    def getRegion(): String
    
    def getScript(): String
    
    def getVariant(): String | Null
    
    def getVariantSubtags(): js.Array[String]
    
    def hasPrivateUseSubtag(sSubtag: String): Boolean
    
    var sExtension: String | Null
    
    var sLanguage: String
    
    var sLocaleId: String
    
    var sPrivateUse: String | Null
    
    var sRegion: String
    
    var sScript: String
    
    var sVariant: String | Null
  }
  object Locale {
    
    inline def apply(
      getExtension: () => String | Null,
      getExtensionSubtags: () => js.Array[String],
      getLanguage: () => String,
      getPrivateUse: () => String | Null,
      getPrivateUseSubtags: () => js.Array[String],
      getRegion: () => String,
      getScript: () => String,
      getVariant: () => String | Null,
      getVariantSubtags: () => js.Array[String],
      hasPrivateUseSubtag: String => Boolean,
      sLanguage: String,
      sLocaleId: String,
      sRegion: String,
      sScript: String
    ): Locale = {
      val __obj = js.Dynamic.literal(getExtension = js.Any.fromFunction0(getExtension), getExtensionSubtags = js.Any.fromFunction0(getExtensionSubtags), getLanguage = js.Any.fromFunction0(getLanguage), getPrivateUse = js.Any.fromFunction0(getPrivateUse), getPrivateUseSubtags = js.Any.fromFunction0(getPrivateUseSubtags), getRegion = js.Any.fromFunction0(getRegion), getScript = js.Any.fromFunction0(getScript), getVariant = js.Any.fromFunction0(getVariant), getVariantSubtags = js.Any.fromFunction0(getVariantSubtags), hasPrivateUseSubtag = js.Any.fromFunction1(hasPrivateUseSubtag), sLanguage = sLanguage.asInstanceOf[js.Any], sLocaleId = sLocaleId.asInstanceOf[js.Any], sRegion = sRegion.asInstanceOf[js.Any], sScript = sScript.asInstanceOf[js.Any], sExtension = null, sPrivateUse = null, sVariant = null)
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      inline def setGetExtension(value: () => String | Null): Self = StObject.set(x, "getExtension", js.Any.fromFunction0(value))
      
      inline def setGetExtensionSubtags(value: () => js.Array[String]): Self = StObject.set(x, "getExtensionSubtags", js.Any.fromFunction0(value))
      
      inline def setGetLanguage(value: () => String): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
      
      inline def setGetPrivateUse(value: () => String | Null): Self = StObject.set(x, "getPrivateUse", js.Any.fromFunction0(value))
      
      inline def setGetPrivateUseSubtags(value: () => js.Array[String]): Self = StObject.set(x, "getPrivateUseSubtags", js.Any.fromFunction0(value))
      
      inline def setGetRegion(value: () => String): Self = StObject.set(x, "getRegion", js.Any.fromFunction0(value))
      
      inline def setGetScript(value: () => String): Self = StObject.set(x, "getScript", js.Any.fromFunction0(value))
      
      inline def setGetVariant(value: () => String | Null): Self = StObject.set(x, "getVariant", js.Any.fromFunction0(value))
      
      inline def setGetVariantSubtags(value: () => js.Array[String]): Self = StObject.set(x, "getVariantSubtags", js.Any.fromFunction0(value))
      
      inline def setHasPrivateUseSubtag(value: String => Boolean): Self = StObject.set(x, "hasPrivateUseSubtag", js.Any.fromFunction1(value))
      
      inline def setSExtension(value: String): Self = StObject.set(x, "sExtension", value.asInstanceOf[js.Any])
      
      inline def setSExtensionNull: Self = StObject.set(x, "sExtension", null)
      
      inline def setSLanguage(value: String): Self = StObject.set(x, "sLanguage", value.asInstanceOf[js.Any])
      
      inline def setSLocaleId(value: String): Self = StObject.set(x, "sLocaleId", value.asInstanceOf[js.Any])
      
      inline def setSPrivateUse(value: String): Self = StObject.set(x, "sPrivateUse", value.asInstanceOf[js.Any])
      
      inline def setSPrivateUseNull: Self = StObject.set(x, "sPrivateUse", null)
      
      inline def setSRegion(value: String): Self = StObject.set(x, "sRegion", value.asInstanceOf[js.Any])
      
      inline def setSScript(value: String): Self = StObject.set(x, "sScript", value.asInstanceOf[js.Any])
      
      inline def setSVariant(value: String): Self = StObject.set(x, "sVariant", value.asInstanceOf[js.Any])
      
      inline def setSVariantNull: Self = StObject.set(x, "sVariant", null)
    }
  }
}
