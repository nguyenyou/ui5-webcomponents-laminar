package website.examples

object ExampleRegistry {

  val examples = List(
    PopoverExampleBasic
  )

  def run(): Unit = {
    examples.foreach(_.apply())
  }

}
