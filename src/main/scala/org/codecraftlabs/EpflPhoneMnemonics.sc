def split(digits: String): Seq[Seq[String]] =
  if (digits.isEmpty) then Seq(Nil)
  else
    for
      splitPoint <- 1 to digits.length
      (firstDigits, remainingDigits) = digits.splitAt(splitPoint)
      digitsSequence <- split(remainingDigits)
    yield firstDigits +: digitsSequence

split("8379")

/**
 * Maps sequences of digits to the collection of words of the dictionary that
 * they represent
 */
val index: Map[String, Seq[String]] = Map (
  "63" -> Seq("of", "me"),
  "66" -> Seq("on", "no")
)

// Maps every key of the phone to their assigned letters
val keys: Map[Char, String] = Map(
  '2' -> "ABC",
  '3' -> "DEF",
  '4' -> "GHI",
  '5' -> "JKL",
  '6' -> "MNO",
  '7' -> "PQRS",
  '8' -> "TUV",
  '9' -> "WXYZ",
)

// Maps every letter to the digit it is assigned to
val letterToDigit: Map[Char, Char] =
  for
    (digit, letters) <- keys
    letter <- letters
  yield letter -> digit

// Maps a word to the sequence of digits it can represent
def wordToDigits(word: String): String = word.toUpperCase.map(letterToDigit)

// We assume that we are provided with a dictionary
val dictionary: Set[String] = Set(
  "Scala",
  "rocks",
  "is",
  "fun",
  "love",
  "thank",
  "me",
  "you",
  "of"
)

val realIndex: Map[String, Set[String]] = dictionary.groupBy(wordToDigits)

def phrases(digits: String): Seq[Seq[String]] =
  if (digits.isEmpty) then Seq(Nil)
  else
    for
      splitPoint <- 1 to digits.length
      (firstDigits, remainingDigits) = digits.splitAt(splitPoint)
      word <- realIndex.getOrElse(firstDigits, Nil)
      words <- phrases(remainingDigits)
    yield word +: words

//phrases("63")
//phrases("636")
//phrases("6366")
phrases("7225276257")