package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAnimationsAnimationQueueMod {
  
  @JSImport("@ui5/webcomponents-base/dist/animations/AnimationQueue.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AnimationQueue
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/animations/AnimationQueue.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def enqueue(element: HTMLElement, task: TaskType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enqueue")(element.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def push(element: HTMLElement, task: TaskType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(element.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def run(element: HTMLElement, task: TaskType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(element.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  trait AnimationQueue extends StObject
  
  type TaskType = js.Function0[js.Promise[Unit]]
}
