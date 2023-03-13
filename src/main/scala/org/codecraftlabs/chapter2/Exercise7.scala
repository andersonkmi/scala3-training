package org.codecraftlabs.chapter2

object Exercise7 {
  def product(s: String): Long =
    var result: Long = 1
    for (c <- s) result *= c.toLong
    result
}
