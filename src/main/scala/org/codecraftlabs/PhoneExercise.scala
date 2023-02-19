package org.codecraftlabs

object PhoneExercise {
  private val index: Map[String, Seq[String]] = Map(
    "63" -> Seq("of", "me"),
    "66" -> Seq("on", "no")
  )
  
  def phrases(digits: String): Seq[Seq[String]] =
    if (digits.isEmpty) then Seq(Nil)
    else
      for
        splitPoint <- 1 to digits.length
        (firstDigits, remainingDigits) = digits.splitAt(splitPoint)
        word <- index.getOrElse(firstDigits, Nil)
        words <- phrases(remainingDigits)
      yield word +: words
}
