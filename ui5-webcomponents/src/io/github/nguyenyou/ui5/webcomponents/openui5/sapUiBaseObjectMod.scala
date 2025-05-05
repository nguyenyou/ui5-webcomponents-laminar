package io.github.nguyenyou.ui5.webcomponents.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseObjectMod {
  
  /* note: abstract class */ @JSImport("sap/ui/base/Object", JSImport.Default)
  @js.native
  /**
    * Constructor for an `sap.ui.base.Object`.
    *
    * Subclasses of this class should always call the constructor of their base class.
    */
  open class default ()
    extends StObject
       with BaseObject
  /* static members */
  object default
  
  @js.native
  trait BaseObject extends StObject {
    
    /**
      * Destructor method for objects.
      */
    def destroy(): Unit = js.native
    
    /**
      * Returns the public facade of this object.
      *
      * By default, the public facade is implemented as an instance of {@link sap.ui.base.Interface}, exposing
      * the `publicMethods` as defined in the metadata of the class of this object.
      *
      * See the documentation of the {@link #.extend extend} method for an explanation of `publicMethods`.
      *
      * The facade is created on the first call of `getInterface` and reused for all later calls.
      *
      *
      * @returns A facade for this object, with at least the public methods of the class of this.
      */
    def getInterface(): BaseObject = js.native
    
    /**
      * Returns the metadata for the class that this object belongs to.
      *
      * This method is only defined when metadata has been declared by using {@link sap.ui.base.Object.defineClass }
      * or {@link sap.ui.base.Object.extend}.
      *
      *
      * @returns metadata for the class of the object
      */
    def getMetadata(): io.github.nguyenyou.ui5.webcomponents.openui5.sapUiBaseMetadataMod.default = js.native
    
    /**
      * Checks whether this object is an instance of the named type.
      *
      * This check is solely based on the type names as declared in the class metadata. It compares the given
      * `vTypeName` with the name of the class of this object, with the names of any base class of that class
      * and with the names of all interfaces implemented by any of the aforementioned classes.
      *
      * Instead of a single type name, an array of type names can be given and the method will check if this
      * object is an instance of any of the listed types (logical or).
      *
      * Should the UI5 class system in future implement additional means of associating classes with type names
      * (e.g. by introducing mixins), then this method might detect matches for those names as well.
      *
      * @since 1.56
      *
      * @returns Whether this object is an instance of the given type or of any of the given types
      */
    def isA[T /* <: BaseObject */](/**
      * Type or types to check for
      */
    vTypeName: String): /* is T */ Boolean = js.native
    def isA[T /* <: BaseObject */](/**
      * Type or types to check for
      */
    vTypeName: js.Array[String]): /* is T */ Boolean = js.native
  }
  
  trait MetadataOptions extends StObject {
    
    /**
      * flag that marks the class as abstract (purely informational, defaults to false)
      */
    var `abstract`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * flag that marks the class as deprecated (defaults to false). May lead to an additional warning log message
      * at runtime when the object is still used. For the documentation, also add a `@deprecated` tag in the
      * JSDoc, describing since when it is deprecated and what any alternatives are.
      */
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * flag that marks the class as final (defaults to false)
      */
    var `final`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * set of names of implemented interfaces (defaults to no interfaces)
      */
    var interfaces: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MetadataOptions {
    
    inline def apply(): MetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
      
      inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
      
      inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setFinal(value: Boolean): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      inline def setInterfaces(value: js.Array[String]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
      
      inline def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
      
      inline def setInterfacesVarargs(value: String*): Self = StObject.set(x, "interfaces", js.Array(value*))
    }
  }
}
