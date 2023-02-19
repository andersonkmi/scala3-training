import org.codecraftlabs.PhoneExercise

@main def hello(): Unit =
  val result = PhoneExercise.phrases("636")
  println(result)
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"
