package org.codecraftlabs.chapter13

object Exercise05 {
  def mkString(input: Array[String]): String = {
    input.reduceLeft(_ + _)
  }
}
