val path: String = "/home/test"
val filesHere = (new java.io.File(path)).listFiles

def fileLines(file: java.io.File) = {
  scala.io.Source.fromFile(file).getLines().toArray
}

def grep(pattern: String): Unit =
  for
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    if line.trim.matches(pattern)
  do println(s"$file: ${line.trim}")


grep(".*gcd.*")