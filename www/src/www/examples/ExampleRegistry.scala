package www.examples

object ExampleRegistry {

  val examples = List(
    DialogExampleBasic,
    DialogExampleStates,
    PopoverExampleBasic,
    ToastExampleBasic,
    ToastExampleDuration,
    ToastExamplePlacement
  )

  def run(): Unit = {
    examples.foreach(_.apply())
  }

}
