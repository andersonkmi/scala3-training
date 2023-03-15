package org.codecraftlabs.chapter3

object Exercise2 {
  def swapValues(values: Array[Int]): Unit = {
    if values.length > 1 then
      for item <- 1 until values.length by 2 do
        val current = values(item)
        val previous = values(item - 1)
        values(item) = previous
        values(item - 1) = current
      
    values.foreach(println)
  }
}
