package org.codecraftlabs.chapter13

class Exercise04Suite extends munit.FunSuite {
  test ("Test case 001") {
    val names: Array[String] = Array[String]("Tom", "Fred", "Harry")
    val lengths: Map[String, Int] = Map[String, Int]("Tom" -> 3, "Harry" -> 5)

    val expectedResult: Array[Int] = Array(3, 5)
    val result = Exercise04.indexes(names, lengths)

    assert(expectedResult.diff(result).isEmpty)
  }
}
