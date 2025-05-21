package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRadioButtonGroupMod {
  
  @JSImport("@ui5/webcomponents/dist/RadioButtonGroup.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RadioButtonGroup
  object default {
    
    @JSImport("@ui5/webcomponents/dist/RadioButtonGroup.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addToGroup(
      radioBtn: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default,
      groupName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToGroup")(radioBtn.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/RadioButtonGroup.js", "default._checkedRadios")
    @js.native
    def checkedRadios: Map[
        String, 
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default | Null
      ] = js.native
    
    inline def checkedRadios_=(
      x: Map[
          String, 
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default | Null
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_checkedRadios")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def createGroup(
      radioBtn: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default,
      groupName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroup")(radioBtn.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def deselectRadio(radioBtn: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_deselectRadio")(radioBtn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def enforceSingleSelection(
      radioBtn: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default,
      groupName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforceSingleSelection")(radioBtn.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def getCheckedRadioFromGroup(groupName: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default | Null
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckedRadioFromGroup")(groupName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default | Null
      ]]
    
    /* static member */
    inline def getGroup(groupName: String): js.UndefOr[
        js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(groupName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
        js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default
        ]
      ]]
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/RadioButtonGroup.js", "default._groups")
    @js.native
    def groups: Map[
        String, 
        js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default
        ]
      ] = js.native
    
    inline def groups_=(
      x: Map[
          String, 
          js.Array[
            io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_groups")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def hasGroup(groupName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasGroup")(groupName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def nextFocusable(
      pos: Double,
      group: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default
        ]
    ): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_nextFocusable")(pos.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default | Null]
    
    /* static member */
    inline def previousFocusable(
      pos: Double,
      group: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default
        ]
    ): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_previousFocusable")(pos.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default | Null]
    
    /* static member */
    inline def removeFromGroup(
      radioBtn: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default,
      groupName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromGroup")(radioBtn.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeGroup(groupName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeGroup")(groupName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def selectItem(
      item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default,
      groupName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectItem")(item.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def selectNextItem(
      item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default,
      groupName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNextItem")(item.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def selectPreviousItem(
      item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default,
      groupName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectPreviousItem")(item.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def selectRadio(radioBtn: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_selectRadio")(radioBtn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def updateFormValidity(groupName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateFormValidity")(groupName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def updateSelectionInGroup(
      radioBtnToSelect: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.default,
      groupName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSelectionInGroup")(radioBtnToSelect.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def updateTabOrder(groupName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateTabOrder")(groupName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait RadioButtonGroup extends StObject
}
