package org.codecraftlabs.chapter4

class Exercise8Suite extends munit.FunSuite {
  test("Min max test") {
    val pairs = Exercise8.minmax(Array(2, 4, -1, 7, 2, 19, 6))
    assertEquals(pairs._1, -1)
    assertEquals(pairs._2, 19)
  }
}
