package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGridWalkerMod {
  
  @JSImport("@ui5/webcomponents/dist/GridWalker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GridWalker {
    def this(grid: js.Array[js.Array[Any]]) = this()
    
    /* CompleteClass */
    var colPos: Double = js.native
    
    /* CompleteClass */
    override def down(): Unit = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    var firstRowPos: Double = js.native
    
    /* CompleteClass */
    override def getColPos(): Double = js.native
    
    /* CompleteClass */
    override def getCurrent(): Any = js.native
    
    /* CompleteClass */
    override def getFirstRowPos(): Double = js.native
    
    /* CompleteClass */
    override def getLastRowPos(): Double = js.native
    
    /* CompleteClass */
    override def getRowPos(): Double = js.native
    
    /* CompleteClass */
    var grid: js.Array[js.Array[Any]] = js.native
    
    /* CompleteClass */
    override def home(): Unit = js.native
    
    /* CompleteClass */
    var lastRowPos: Double = js.native
    
    /* CompleteClass */
    override def left(): Unit = js.native
    
    /* CompleteClass */
    var pageSize: Double = js.native
    
    /* CompleteClass */
    override def pagedown(): Unit = js.native
    
    /* CompleteClass */
    override def pageup(): Unit = js.native
    
    /* CompleteClass */
    override def right(): Unit = js.native
    
    /* CompleteClass */
    var rowPos: Double = js.native
    
    /* CompleteClass */
    override def setColPos(colPos: Double): Unit = js.native
    
    /* CompleteClass */
    override def setCurrent(current: Any): Unit = js.native
    
    /* CompleteClass */
    override def setFirstRowPos(firstRowPos: Double): Unit = js.native
    
    /* CompleteClass */
    override def setGrid(grid: js.Array[js.Array[Any]]): Unit = js.native
    
    /* CompleteClass */
    override def setLastRowPos(lastRowPos: Double): Unit = js.native
    
    /* CompleteClass */
    override def setRowPos(rowPos: Double): Unit = js.native
    
    /* CompleteClass */
    override def up(): Unit = js.native
  }
  
  trait GridWalker extends StObject {
    
    var colPos: Double
    
    def down(): Unit
    
    def end(): Unit
    
    var firstRowPos: Double
    
    def getColPos(): Double
    
    def getCurrent(): Any
    
    def getFirstRowPos(): Double
    
    def getLastRowPos(): Double
    
    def getRowPos(): Double
    
    var grid: js.Array[js.Array[Any]]
    
    def home(): Unit
    
    var lastRowPos: Double
    
    def left(): Unit
    
    var pageSize: Double
    
    def pagedown(): Unit
    
    def pageup(): Unit
    
    def right(): Unit
    
    var rowPos: Double
    
    def setColPos(colPos: Double): Unit
    
    def setCurrent(current: Any): Unit
    
    def setFirstRowPos(firstRowPos: Double): Unit
    
    def setGrid(grid: js.Array[js.Array[Any]]): Unit
    
    def setLastRowPos(lastRowPos: Double): Unit
    
    def setRowPos(rowPos: Double): Unit
    
    def up(): Unit
  }
  object GridWalker {
    
    inline def apply(
      colPos: Double,
      down: () => Unit,
      end: () => Unit,
      firstRowPos: Double,
      getColPos: () => Double,
      getCurrent: () => Any,
      getFirstRowPos: () => Double,
      getLastRowPos: () => Double,
      getRowPos: () => Double,
      grid: js.Array[js.Array[Any]],
      home: () => Unit,
      lastRowPos: Double,
      left: () => Unit,
      pageSize: Double,
      pagedown: () => Unit,
      pageup: () => Unit,
      right: () => Unit,
      rowPos: Double,
      setColPos: Double => Unit,
      setCurrent: Any => Unit,
      setFirstRowPos: Double => Unit,
      setGrid: js.Array[js.Array[Any]] => Unit,
      setLastRowPos: Double => Unit,
      setRowPos: Double => Unit,
      up: () => Unit
    ): GridWalker = {
      val __obj = js.Dynamic.literal(colPos = colPos.asInstanceOf[js.Any], down = js.Any.fromFunction0(down), end = js.Any.fromFunction0(end), firstRowPos = firstRowPos.asInstanceOf[js.Any], getColPos = js.Any.fromFunction0(getColPos), getCurrent = js.Any.fromFunction0(getCurrent), getFirstRowPos = js.Any.fromFunction0(getFirstRowPos), getLastRowPos = js.Any.fromFunction0(getLastRowPos), getRowPos = js.Any.fromFunction0(getRowPos), grid = grid.asInstanceOf[js.Any], home = js.Any.fromFunction0(home), lastRowPos = lastRowPos.asInstanceOf[js.Any], left = js.Any.fromFunction0(left), pageSize = pageSize.asInstanceOf[js.Any], pagedown = js.Any.fromFunction0(pagedown), pageup = js.Any.fromFunction0(pageup), right = js.Any.fromFunction0(right), rowPos = rowPos.asInstanceOf[js.Any], setColPos = js.Any.fromFunction1(setColPos), setCurrent = js.Any.fromFunction1(setCurrent), setFirstRowPos = js.Any.fromFunction1(setFirstRowPos), setGrid = js.Any.fromFunction1(setGrid), setLastRowPos = js.Any.fromFunction1(setLastRowPos), setRowPos = js.Any.fromFunction1(setRowPos), up = js.Any.fromFunction0(up))
      __obj.asInstanceOf[GridWalker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridWalker] (val x: Self) extends AnyVal {
      
      inline def setColPos(value: Double): Self = StObject.set(x, "colPos", value.asInstanceOf[js.Any])
      
      inline def setDown(value: () => Unit): Self = StObject.set(x, "down", js.Any.fromFunction0(value))
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setFirstRowPos(value: Double): Self = StObject.set(x, "firstRowPos", value.asInstanceOf[js.Any])
      
      inline def setGetColPos(value: () => Double): Self = StObject.set(x, "getColPos", js.Any.fromFunction0(value))
      
      inline def setGetCurrent(value: () => Any): Self = StObject.set(x, "getCurrent", js.Any.fromFunction0(value))
      
      inline def setGetFirstRowPos(value: () => Double): Self = StObject.set(x, "getFirstRowPos", js.Any.fromFunction0(value))
      
      inline def setGetLastRowPos(value: () => Double): Self = StObject.set(x, "getLastRowPos", js.Any.fromFunction0(value))
      
      inline def setGetRowPos(value: () => Double): Self = StObject.set(x, "getRowPos", js.Any.fromFunction0(value))
      
      inline def setGrid(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridVarargs(value: js.Array[Any]*): Self = StObject.set(x, "grid", js.Array(value*))
      
      inline def setHome(value: () => Unit): Self = StObject.set(x, "home", js.Any.fromFunction0(value))
      
      inline def setLastRowPos(value: Double): Self = StObject.set(x, "lastRowPos", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: () => Unit): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPagedown(value: () => Unit): Self = StObject.set(x, "pagedown", js.Any.fromFunction0(value))
      
      inline def setPageup(value: () => Unit): Self = StObject.set(x, "pageup", js.Any.fromFunction0(value))
      
      inline def setRight(value: () => Unit): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
      
      inline def setRowPos(value: Double): Self = StObject.set(x, "rowPos", value.asInstanceOf[js.Any])
      
      inline def setSetColPos(value: Double => Unit): Self = StObject.set(x, "setColPos", js.Any.fromFunction1(value))
      
      inline def setSetCurrent(value: Any => Unit): Self = StObject.set(x, "setCurrent", js.Any.fromFunction1(value))
      
      inline def setSetFirstRowPos(value: Double => Unit): Self = StObject.set(x, "setFirstRowPos", js.Any.fromFunction1(value))
      
      inline def setSetGrid(value: js.Array[js.Array[Any]] => Unit): Self = StObject.set(x, "setGrid", js.Any.fromFunction1(value))
      
      inline def setSetLastRowPos(value: Double => Unit): Self = StObject.set(x, "setLastRowPos", js.Any.fromFunction1(value))
      
      inline def setSetRowPos(value: Double => Unit): Self = StObject.set(x, "setRowPos", js.Any.fromFunction1(value))
      
      inline def setUp(value: () => Unit): Self = StObject.set(x, "up", js.Any.fromFunction0(value))
    }
  }
}
