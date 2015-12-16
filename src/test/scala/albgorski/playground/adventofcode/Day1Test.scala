package albgorski.playground.adventofcode

import albgorski.playground.adventofcode.Day1.countTheFloor
import org.scalatest.{FlatSpec, Matchers}

class Day1Test extends FlatSpec with Matchers {
  "floor number" should "be 0 for (())" in {
    countTheFloor("(())") should ===(0)
  }
  it should "be 3 for (((" in {
    countTheFloor("(((") should ===(3)
  }
  it should "be 3 for (()(()(" in {
    countTheFloor("(()(()(") should ===(3)
  }
  it should "be -1 for ())" in {
    countTheFloor("())") should ===(-1)
  }
  it should "be -1 for ))(" in {
    countTheFloor("))(") should ===(-1)
  }
  it should "be -3 for )))" in {
    countTheFloor(")))") should ===(-3)
  }
  it should "be -3 for )())())" in {
    countTheFloor(")())())") should ===(-3)
  }
}
