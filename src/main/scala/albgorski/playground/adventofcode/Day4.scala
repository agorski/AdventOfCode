package albgorski.playground.adventofcode

object Day4 {

  val findLowest = (input: String) => {
    var counter: Int = 0
    var result: String = ""
    do {
      counter += 1
      result = md5((input + counter).getBytes)
    } while (!result.startsWith("00000"))
    counter
  }

  private[this] def md5(bytes: Array[Byte]): String = {
    import java.security.MessageDigest
    val digest = MessageDigest.getInstance("MD5")
    digest.reset()
    digest.update(bytes)
    digest
      .digest()
      .map(0xFF & _)
      .map {
        "%02x".format(_)
      }
      .foldLeft("") {
        _ + _
      }
  }


}
