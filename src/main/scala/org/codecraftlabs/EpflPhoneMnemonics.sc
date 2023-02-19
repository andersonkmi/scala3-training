def split(digits: String): Seq[Seq[String]] =
  if (digits.isEmpty) then Seq(Nil)
  else
    for
      splitPoint <- 1 to digits.length
      (firstDigits, remainingDigits) = digits.splitAt(splitPoint)
      digitsSequence <- split(remainingDigits)
    yield firstDigits +: digitsSequence

split("8379")