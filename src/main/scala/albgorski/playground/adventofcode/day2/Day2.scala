package albgorski.playground.adventofcode.day2

import scala.io.Source

object Day2 {

  private[this] case class Box(length: Int, width: Int, height: Int) {
    private[this] val surface1: Int = length * width
    private[this] val surface2: Int = length * height
    private[this] val surface3: Int = width * height

    val surface = {
      2 * surface1 + 2 * surface2 + 2 * surface3
    }
    val slack = {
      (surface1 :: surface2 :: surface3 :: Nil).min
    }
  }

  private[this] val inputToBoxes = (input: String) => Source.fromString(input).getLines().map(
    _.split("x") match {
      case Array(a, b, c) => Box(a.toInt, b.toInt, c.toInt)
      case _ => Box(0, 0, 0)
    }
  ).toSeq

  val countTheSquareFeets = (input: String) => {
    val boxes: Seq[Box] = inputToBoxes(input)
    boxes.foldLeft(0)((total: Int, box: Box) => total + box.surface + box.slack)
  }
}
