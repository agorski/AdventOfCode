package albgorski.playground.adventofcode.day3

object Day3 {

  case class HouseCords(x: Int, y: Int)

  object HouseCords {
    def left(in: HouseCords): HouseCords = {
      HouseCords(in.x - 1, in.y)
    }

    def right(in: HouseCords): HouseCords = {
      HouseCords(in.x + 1, in.y)
    }

    def up(in: HouseCords): HouseCords = {
      HouseCords(in.x, in.y + 1)
    }

    def down(in: HouseCords): HouseCords = {
      HouseCords(in.x, in.y - 1)
    }
  }

  val countHouses = (input: String) => {
    input
      .foldLeft(Seq(HouseCords(0, 0)))((s: Seq[HouseCords], current: Char) => {
        current match {
          case '^' => s :+ HouseCords.up(s.last)
          case 'v' => s :+ HouseCords.down(s.last)
          case '>' => s :+ HouseCords.right(s.last)
          case '<' => s :+ HouseCords.left(s.last)
          case _ => s
        }
      })
      .distinct
      .size
  }
}
