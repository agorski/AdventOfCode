package albgorski.playground.adventofcode

import albgorski.playground.adventofcode.Day5.niceOrNaughty
import org.scalatest.{FlatSpec, Matchers}

import scala.io.Source

class Day5Test extends FlatSpec with Matchers {

  "ugknbfddgicrmopn" should "be nice because it has at least three vowels (u...i...o...), a double letter (...dd...), and none of the disallowed substrings" in {
    niceOrNaughty("ugknbfddgicrmopn") should be(Nice)
  }
  "aaa" should "is nice because it has at least three vowels and a double letter, even though the letters used by different rules overlap" in {
    niceOrNaughty("aaa") should be(Nice)
  }
  "jchzalrnumimnmhp" should "be naughty because it has no double letter." in {
    niceOrNaughty("jchzalrnumimnmhp") should be(Naughty)
  }
  "haegwjzuvuyypxyu" should "be naughty because it contains the string xy" in {
    niceOrNaughty("haegwjzuvuyypxyu") should be(Naughty)
  }
  "haegwjzuvuyypaxy" should "be naughty because it contains the string xy" in {
    niceOrNaughty("haegwjzuvuyypaxy") should be(Naughty)
  }
  "xyhaegwjzuvuyypa" should "be naughty because it contains the string xy" in {
    niceOrNaughty("xyhaegwjzuvuyypa") should be(Naughty)
  }
  "dvszwmarrgswjxmb" should "be naughty because it contains only one vowel." in {
    niceOrNaughty("dvszwmarrgswjxmb") should be(Naughty)
  }
  "count of nice elements in PUZZLE" should "be 238" in {
    Day5.niceOrNaughtyLines(Source.fromURL(getClass.getResource("day5.txt"))) should be(238)
  }
}
