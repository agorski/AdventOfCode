package albgorski.playground.adventofcode.day5

import scala.io.Source


object Day5Part1 {

  private val wrongStrings: Seq[String] = Seq("ab", "cd", "pq", "xy")

  /*
  It contains at least three vowels (aeiou only).
  It contains at least one letter that appears twice in a row, like xx
  It does not contain the strings ab, cd, pq, or xy.
   */
  val niceOrNaughty = (input: String) => {
    val finalStatus: Status = input.foldLeft(Status(naughty = false, vowelCount = 0, letterTwice = false, char = ' '))((acc: Status, c: Char) => {
      acc match {
        case r@Status(true, _, _, _) => r
        case _ =>
          val newVowelCount: Int = acc.vowelCount + oneForVowelOrZero(c)
          val isLetterTwice: Boolean = acc.letterTwice || (acc.char == c)
          val isNaughty: Boolean = wrongStrings.contains(Array(acc.char, c).mkString(""))
          Status(isNaughty, newVowelCount, isLetterTwice, c)
      }
    })

    finalStatus match {
      case Status(false, vowel, true, _) if vowel > 2 => Nice
      case _ => Naughty
    }
  }

  val niceOrNaughtyLines = (input: Source) => {
    val lines: Iterator[String] = input.getLines()
    lines.map(niceOrNaughty).count {
      case Nice => true
      case _ => false
    }
  }


  private[this] def oneForVowelOrZero(c: Char): Int = {
    c match {
      case 'a' | 'e' | 'i' | 'o' | 'u' => 1
      case _ => 0
    }
  }

  sealed case class Status(naughty: Boolean, vowelCount: Int, letterTwice: Boolean, char: Char)

  sealed trait Answer

  sealed case class Nice() extends Answer

  sealed case class Naughty() extends Answer

}

