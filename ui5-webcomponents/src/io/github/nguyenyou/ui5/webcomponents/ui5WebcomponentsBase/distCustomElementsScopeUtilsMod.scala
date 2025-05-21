package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCustomElementsScopeUtilsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/CustomElementsScopeUtils.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the rules, governing which custom element tags to scope and which not. By default, all elements
    * starting with "ui5-" are scoped. The default rules are: {include: [/^ui5-/]}.
    *
    * @public
    * @returns {Object}
    */
  inline def getCustomElementsScopingRules(): Rules = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomElementsScopingRules")().asInstanceOf[Rules]
  
  /**
    * Returns the currently set scoping suffix, or undefined if not set.
    *
    * @public
    * @returns {String|undefined}
    */
  inline def getCustomElementsScopingSuffix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomElementsScopingSuffix")().asInstanceOf[String]
  
  /**
    * Returns the currently set scoping suffix, if any and if the tag should be scoped, or undefined otherwise.
    *
    * @public
    * @param tag
    * @returns {String}
    */
  inline def getEffectiveScopingSuffixForTag(tag: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveScopingSuffixForTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * @public
    * Used for getting a scoped name for a CSS variable using the same transformation used in the build
    * @name the name of the css variable as written in the code
    * @returns a variable name with the current version inserted as available at runtime
    */
  inline def getScopedVarName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScopedVarName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Sets the rules, governing which custom element tags to scope and which not, f.e.
    * setCustomElementsScopingRules({include: [/^ui5-/]}, exclude: [/^ui5-mylib-/, /^ui5-carousel$/]);
    * will scope all elements starting with "ui5-" but not the ones starting with "ui5-mylib-" and not "ui5-carousel".
    *
    * @public
    * @param rules Object with "include" and "exclude" properties, both arrays of regular expressions. Note that "include"
    * rules are applied first and "exclude" rules second.
    */
  inline def setCustomElementsScopingRules(rules: Rules): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomElementsScopingRules")(rules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the suffix to be used for custom elements scoping, f.e. pass "demo" to get tags such as "ui5-button-demo".
    *
    * **Note:** By default all tags starting with "ui5-" will be scoped, unless you change this by calling "setCustomElementsScopingRules"
    * **Note:** Setting the scoping suffix must be done before importing any components.
    *
    * @public
    * @param suffix The scoping suffix
    */
  inline def setCustomElementsScopingSuffix(suffix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomElementsScopingSuffix")(suffix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Determines whether custom elements with the given tag should be scoped or not.
    * The tag is first matched against the "include" rules and then against the "exclude" rules and the
    * result is cached until new rules are set.
    *
    * @public
    * @param tag
    */
  inline def shouldScopeCustomElement(tag: String): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldScopeCustomElement")(tag.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  trait Rules extends StObject {
    
    var exclude: js.Array[js.RegExp]
    
    var include: js.Array[js.RegExp]
  }
  object Rules {
    
    inline def apply(exclude: js.Array[js.RegExp], include: js.Array[js.RegExp]): Rules = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: js.Array[js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: js.RegExp*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[js.RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: js.RegExp*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
}
