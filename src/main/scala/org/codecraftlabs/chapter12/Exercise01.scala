package org.codecraftlabs.chapter12

object Exercise01 {
  def values(fun: Int => Int, low: Int, high: Int): Seq[(Int, Int)] = {
    for (i <- low to high) yield (i, fun(i))
  }
}
