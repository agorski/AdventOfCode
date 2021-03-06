package albgorski.playground.adventofcode.day1

object Day1 {

  val countTheFloor = (input: String) => {
    input.foldLeft(0)((pos: Int, a: Char) => a match {
      case '(' => pos + 1
      case ')' => pos - 1
      case _ => pos
    })
  }

  val findFirstPositionForBasement = (input: String) => {
    var firstBasement: Int = 0
    input.foldLeft(0)((pos: Int, a: Char) => a match {
      case '(' if pos != -1 => firstBasement += 1; pos + 1
      case ')' if pos != -1 => firstBasement += 1; pos - 1
      case _ => pos
    })
    firstBasement
  }
}
