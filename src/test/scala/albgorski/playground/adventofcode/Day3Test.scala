package albgorski.playground.adventofcode

import albgorski.playground.adventofcode.Day3.countHouses
import org.scalatest.{FlatSpec, Matchers}

import scala.io.Source

class Day3Test extends FlatSpec with Matchers {
  ">" should "deliver to 2 houses" in {
    countHouses(">") should ===(2)
  }
  "^>v<" should "deliver to 4 houses" in {
    countHouses("^>v<") should ===(4)
  }
  "^v^v^v^v^v" should "deliver to 2 houses" in {
    countHouses("^v^v^v^v^v") should ===(2)
  }
  "PUZZLE" should "deliver to 2592 houses" in {
    countHouses(Source.fromURL(getClass.getResource("day3.txt")).mkString) should ===(2592)
  }
}
