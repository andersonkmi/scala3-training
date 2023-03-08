val path: String = "/home/test"
val filesHere = (new java.io.File(path)).listFiles

def fileLines(file: java.io.File) = {
  scala.io.Source.fromFile(file).getLines().toArray
}

def grepMkI(pattern: String): Unit =
  for
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    if line.trim.matches(pattern)
  do println(s"$file: ${line.trim}")


grepMkI(".*gcd.*")

def grepMkII(pattern: String): Unit =
  for
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  do println(s"$file: $trimmed")


grepMkII(".*gcd.*")

def scalaFiles =
  for
    file <- filesHere
    if file.getName.endsWith(".scala")
  yield file


def makeRowSeq(row: Int) =
  for col <- 1 to 10 yield
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod

def makeRow(row: Int) = makeRowSeq(row).mkString

def multiTable() =
  val tableSeq =
    for row <- 1 to 10
      yield makeRow(row)
  tableSeq.mkString("\n")

println(multiTable())