package albgorski.playground.adventofcode.day2

import albgorski.playground.adventofcode.day2.Day2.countTheSquareFeets
import org.scalatest.{FlatSpec, Matchers}

import scala.io.Source

class Day2Test extends FlatSpec with Matchers {
  "2x3x4" should "be 58" in {
    countTheSquareFeets("2x3x4") should ===(58)
  }
  "1x1x10" should "43" in {
    countTheSquareFeets("1x1x10") should ===(43)
  }
  "all from PUZZLE" should "1598415" in {
    countTheSquareFeets(Source.fromURL(getClass.getResource("day2.txt")).mkString) should ===(1598415)
  }
}
