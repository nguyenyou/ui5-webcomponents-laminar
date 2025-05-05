package website.examples

object ExampleRegistry {

  val examples = List(
    DialogExampleBasic,
    PopoverExampleBasic
  )

  def run(): Unit = {
    examples.foreach(_.apply())
  }

}
