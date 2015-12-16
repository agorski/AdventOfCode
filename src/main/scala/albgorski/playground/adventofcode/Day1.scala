package albgorski.playground.adventofcode

object Day1 {

  val countTheFloor = (input: String) => {
    input.foldLeft(0)((pos: Int, a: Char) => a match {
      case '(' => pos + 1
      case ')' => pos - 1
      case _ => pos
    })
  }
}
