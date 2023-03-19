import scala.collection.mutable.ArrayBuffer

// Exercise 5 - calculate average of Array[Double]
val salaries = Array(2.12, 3.22, 4.12)
val size = salaries.length
val salarySum = salaries.sum
salarySum / size

// Exercise 6 - reverse Array[Int]
val ex06 = Array(1, 2, 3, 4, 5)
ex06.reverse

val ex06Buffer = ArrayBuffer(1, 2, 3)
ex06Buffer.reverse