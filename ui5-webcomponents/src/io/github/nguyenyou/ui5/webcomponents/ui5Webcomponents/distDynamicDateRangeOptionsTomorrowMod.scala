package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.DynamicDateRangeValue
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.IDynamicDateRangeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicDateRangeOptionsTomorrowMod {
  
  /**
    * @class
    * @constructor
    * @public
    * @since 2.11.0
    */
  @JSImport("@ui5/webcomponents/dist/dynamic-date-range-options/Tomorrow.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Tomorrow {
    
    /* CompleteClass */
    override def format(value: DynamicDateRangeValue): String = js.native
    
    /* CompleteClass */
    var icon: String = js.native
    
    /* CompleteClass */
    override def isValidString(value: String): Boolean = js.native
    
    /* CompleteClass */
    var operator: String = js.native
    
    /* CompleteClass */
    override def parse(value: String): js.UndefOr[DynamicDateRangeValue] = js.native
    
    /* CompleteClass */
    var text: String = js.native
    
    /* CompleteClass */
    override def toDates(value: DynamicDateRangeValue): js.Array[js.Date] = js.native
  }
  
  /**
    * @class
    * @constructor
    * @public
    * @since 2.11.0
    */
  @js.native
  trait Tomorrow
    extends StObject
       with IDynamicDateRangeOption {
    
    def format(): String = js.native
    
    @JSName("icon")
    def icon_MTomorrow: String = js.native
    
    @JSName("operator")
    def operator_MTomorrow: String = js.native
    
    def parse(): DynamicDateRangeValue = js.native
    
    @JSName("text")
    def text_MTomorrow: String = js.native
    
    def toDates(): js.Array[js.Date] = js.native
  }
}
