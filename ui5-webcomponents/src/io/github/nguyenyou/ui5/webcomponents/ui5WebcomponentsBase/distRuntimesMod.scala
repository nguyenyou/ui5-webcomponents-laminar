package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distGlobalMod.global.VersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRuntimesMod {
  
  @JSImport("@ui5/webcomponents-base/dist/Runtimes.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compares two runtimes and returns 1 if the first is of a bigger version, -1 if the second is of a bigger version, and 0 if equal
    * @param index1 The index of the first runtime to compare
    * @param index2 The index of the second runtime to compare
    * @returns {number}
    */
  inline def compareRuntimes(index1: Double, index2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRuntimes")(index1.asInstanceOf[js.Any], index2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getAllRuntimes(): js.Array[RuntimeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllRuntimes")().asInstanceOf[js.Array[RuntimeData]]
  
  /**
    * Returns the index of the current runtime's object in the shared runtimes resource registry
    * @returns {*}
    */
  inline def getCurrentRuntimeIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRuntimeIndex")().asInstanceOf[Double]
  
  /**
    * Registers the current runtime in the shared runtimes resource registry
    */
  inline def registerCurrentRuntime(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerCurrentRuntime")().asInstanceOf[Unit]
  
  /**
    * Set an alias for the the current app/library/microfrontend which will appear in debug messages and console warnings
    * @param alias
    */
  inline def setRuntimeAlias(alias: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRuntimeAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait RuntimeData
    extends StObject
       with VersionInfo {
    
    var alias: String
    
    var description: String
  }
  object RuntimeData {
    
    inline def apply(
      alias: String,
      buildTime: Double,
      description: String,
      isNext: Boolean,
      major: Double,
      minor: Double,
      patch: Double,
      suffix: String,
      version: String
    ): RuntimeData = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], buildTime = buildTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isNext = isNext.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeData] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
}
