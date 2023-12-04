package org.codecraftlabs.chapter13

object Exercise04 {
  def indexes(names: Array[String], lengths: Map[String, Int]): Array[Int] = {
    names.flatMap(lengths.get)
  }
}
