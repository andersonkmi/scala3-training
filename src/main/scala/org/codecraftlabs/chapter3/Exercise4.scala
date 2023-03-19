package org.codecraftlabs.chapter3

object Exercise4 {
  def splitNumbers(values: Array[Int]): Array[Int] = {
    val positives: Array[Int] = for value <- values if value > 0 yield value
    val others: Array[Int] = for value <- values if value <= 0 yield value
    positives ++ others
  }
}
