package albgorski.playground.adventofcode

import albgorski.playground.adventofcode.Day4.findLowest
import org.scalatest.{FlatSpec, Matchers}

class Day4Test extends FlatSpec with Matchers {
  "for secret key abcdef the lower number" should "be 609043" in {
    findLowest("abcdef") should ===(609043)
  }
  "for secret key pqrstuv the lower number" should "be 1048970" in {
    findLowest("pqrstuv") should ===(1048970)
  }
}