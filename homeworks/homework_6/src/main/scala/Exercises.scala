object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    seq.reverse
}

  def fibonacci4Index(idx: Int): Int = {
    if (idx == 0) {
      0
    } else if (idx == 1 || idx == 2)
      1
    else {
      fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
    }
  }
/*
  def fibonacci4Index(idx: Int): Int = {
    if (idx == 0) {
       0
    }
    else if (idx == 1) {
       1
    }
    else {
      var a = 0
      var b = 1
      for (i <- 2 to idx) {
        b = b + a
        a = b - a
      }
       b
    }
  }*/

  def fibonacci(idx: Int): Seq[Int] =
    for (i <- 0 to idx)
      yield fibonacci4Index(i)

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    var a = new StringBuilder;
    for (i <- 0 until text.length) {
      val symbol = text.charAt(i).toUpper
      if (symbol.isLetter) {
        a ++= MORSE(symbol.toString)
      }
      else {
        if (symbol == ' ') {
          a += ' '
        }
        else {
          a += symbol
        }
      }
      a ++= " "
      if ((i + 1 < text.length) && (!(text.charAt(i + 1).isLetter || text.charAt(i + 1) == ' '))) {
          a = a.dropRight(1)
        }
      }
    a.dropRight(1).toString()
  }

  def wordReverse(text: String): String = text
    .split("(?=[^a-zA-Zа-яёА-ЯЁ])|(?<=[ ])")
    .map(word =>
      if (word.head.isUpper) {
        word.toLowerCase.reverse.capitalize
      } else word.reverse)
    .mkString("")

}
