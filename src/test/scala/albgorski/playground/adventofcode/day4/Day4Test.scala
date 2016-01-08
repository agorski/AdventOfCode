package albgorski.playground.adventofcode.day4

import albgorski.playground.adventofcode.day4.Day4.findLowest
import org.scalatest.{FlatSpec, Matchers}

import scala.io.Source

class Day4Test extends FlatSpec with Matchers {
  "for secret key abcdef the lower number" should "be 609043" in {
    findLowest("abcdef") should ===(609043)
  }
  "for secret key pqrstuv the lower number" should "be 1048970" in {
    findLowest("pqrstuv") should ===(1048970)
  }
  "for secret key PUZZLE the lower number" should "be 254575" in {
    findLowest(Source.fromURL(getClass.getResource("day4.txt")).mkString) should ===(254575)
  }
}
