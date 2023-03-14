package org.codecraftlabs.chapter2

object Exercise8 {
  def product(s: String): Long =
    s.map(_.toLong).product
}
