package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGlobalMod {
  
  object global {
    
    /* augmented module */
    object generatedAssetParametersJsAugmentingMod {
      
      @JSImport("*generated/AssetParameters.js", "DEFAULT_LANGUAGE")
      @js.native
      val DEFAULT_LANGUAGE: String = js.native
      
      @JSImport("*generated/AssetParameters.js", "DEFAULT_LOCALE")
      @js.native
      val DEFAULT_LOCALE: String = js.native
      
      @JSImport("*generated/AssetParameters.js", "DEFAULT_THEME")
      @js.native
      val DEFAULT_THEME: String = js.native
      
      @JSImport("*generated/AssetParameters.js", "SUPPORTED_LOCALES")
      @js.native
      val SUPPORTED_LOCALES: js.Array[String] = js.native
      
      @JSImport("*generated/AssetParameters.js", "SUPPORTED_THEMES")
      @js.native
      val SUPPORTED_THEMES: js.Array[String] = js.native
    }
    
    /* augmented module */
    object generatedVersionInfoJsAugmentingMod extends Shortcut {
      
      @JSImport("*generated/VersionInfo.js", JSImport.Default)
      @js.native
      val default: VersionInfo = js.native
      
      type _To = VersionInfo
      
      /* This means you don't have to write `default`, but can instead just say `generatedVersionInfoJsAugmentingMod.foo` */
      override def _to: VersionInfo = default
    }
    
    trait VersionInfo extends StObject {
      
      var buildTime: Double
      
      var isNext: Boolean
      
      var major: Double
      
      var minor: Double
      
      var patch: Double
      
      var suffix: String
      
      var version: String
    }
    object VersionInfo {
      
      inline def apply(
        buildTime: Double,
        isNext: Boolean,
        major: Double,
        minor: Double,
        patch: Double,
        suffix: String,
        version: String
      ): VersionInfo = {
        val __obj = js.Dynamic.literal(buildTime = buildTime.asInstanceOf[js.Any], isNext = isNext.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[VersionInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: VersionInfo] (val x: Self) extends AnyVal {
        
        inline def setBuildTime(value: Double): Self = StObject.set(x, "buildTime", value.asInstanceOf[js.Any])
        
        inline def setIsNext(value: Boolean): Self = StObject.set(x, "isNext", value.asInstanceOf[js.Any])
        
        inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
        
        inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
        
        inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
        
        inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait Window extends StObject {
      
      var chrome: Any
      
      var sap: Any
      
      var v8: Any
    }
    object Window {
      
      inline def apply(chrome: Any, sap: Any, v8: Any): Window = {
        val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], sap = sap.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setChrome(value: Any): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
        
        inline def setSap(value: Any): Self = StObject.set(x, "sap", value.asInstanceOf[js.Any])
        
        inline def setV8(value: Any): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
      }
    }
  }
}
