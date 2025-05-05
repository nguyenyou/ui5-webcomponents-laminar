package website.examples

object ExampleRegistry {

  val examples = List(
    DialogExampleBasic,
    PopoverExampleBasic,
    ToastExampleBasic,
    ToastExampleDuration,
    ToastExamplePlacement
  )

  def run(): Unit = {
    examples.foreach(_.apply())
  }

}
