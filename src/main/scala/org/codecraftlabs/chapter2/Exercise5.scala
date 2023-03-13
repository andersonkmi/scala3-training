package org.codecraftlabs.chapter2

object Exercise5 {
  def signum(number: Int): Int = {
    if number == 0 then 0
    else if number > 0 then 1
    else -1
  }
}
