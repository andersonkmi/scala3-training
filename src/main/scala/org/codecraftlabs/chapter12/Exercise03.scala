package org.codecraftlabs.chapter12

object Exercise03 {
  def factorial(value: Int): Int = {
    if (value <= 1) 1 else (1 to value).reduceLeft(_ * _)
  }
}
