package albgorski.playground.adventofcode

import org.scalatest.{FlatSpec, Matchers}

class Day1Test extends FlatSpec with Matchers {
  "countTheFloors" should "be 0 for (())" in {
    Day1.countTheFloor("(())") should ===(0)
  }
  it should "be 3 for (((" in {
    Day1.countTheFloor("(((") should ===(3)
  }
  it should "be 3 for (()(()(" in {
    Day1.countTheFloor("(()(()(") should ===(3)
  }
  it should "be -1 for ())" in {
    Day1.countTheFloor("())") should ===(-1)
  }
  it should "be -1 for ))(" in {
    Day1.countTheFloor("))(") should ===(-1)
  }
  it should "be -3 for )))" in {
    Day1.countTheFloor(")))") should ===(-3)
  }
  it should "be -3 for )())())" in {
    Day1.countTheFloor(")())())") should ===(-3)
  }
}
