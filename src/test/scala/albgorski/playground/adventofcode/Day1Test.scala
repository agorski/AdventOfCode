package albgorski.playground.adventofcode

import albgorski.playground.adventofcode.Day1.{countTheFloor, findFirstPositionForBasement}
import org.scalatest.{FlatSpec, Matchers}

import scala.io.Source

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

  "basement position" should "be 1 if the input is )" in {
    findFirstPositionForBasement(")") should ===(1)
  }
  it should "be 5 if the input is ()())" in {
    findFirstPositionForBasement("()())") should ===(5)
  }
  it should "be 1783 if the input my puzzle input" in {
    findFirstPositionForBasement(Source.fromURL(getClass.getResource("day1.txt")).mkString) should ===(1783)
  }
}
