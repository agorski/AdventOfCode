package albgorski.playground.adventofcode

import albgorski.playground.adventofcode.Day2.countTheSquareFeets
import org.scalatest.{FlatSpec, Matchers}

class Day2Test extends FlatSpec with Matchers {
  "2x3x4" should "be 58" in {
    countTheSquareFeets("2x3x4") should ===(58)
  }
  "1x1x10" should "43" in {
    countTheSquareFeets("1x1x10") should ===(43)
  }
  "all from test" should "1598415" in {
    val input: String =
      """
        |2x3x4
        |1x1x10
      """.stripMargin
    countTheSquareFeets(input) should ===(101)
  }
}
