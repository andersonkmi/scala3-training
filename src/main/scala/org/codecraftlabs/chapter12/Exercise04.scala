package org.codecraftlabs.chapter12

object Exercise04 {
  def factorial(value: Int): Int = (1 to value).foldLeft(1)(_ * _)
}
