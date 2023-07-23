package org.codecraftlabs.chapter12

object Exercise02 {
  def findLargestElement(numbers: Array[Int]): Int = {
    numbers.reduceLeft((a, b) => if (a > b) a else b)
  }
}
