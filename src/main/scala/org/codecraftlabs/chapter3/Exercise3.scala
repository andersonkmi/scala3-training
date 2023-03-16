package org.codecraftlabs.chapter3

object Exercise3 {
  def swapValues(values: Array[Int]): Array[Int] =
    val result = (
      for index <- values.indices yield
        if (index % 2 == 0 && (index + 1) == values.length) values(index)
        else if (index % 2 == 0) values(index + 1)
        else values(index - 1)
      ).toArray
    result
}
