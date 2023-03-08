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

