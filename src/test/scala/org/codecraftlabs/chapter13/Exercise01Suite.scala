package org.codecraftlabs.chapter13

import scala.collection.mutable

class Exercise01Suite extends munit.FunSuite {
  test("Test case 1") {
    val expectedResult: mutable.Map[Char, mutable.Set[Int]] = mutable.Map[Char, mutable.Set[Int]]('a' -> mutable.Set[Int](0), 't' -> mutable.Set[Int](1))
    val result: mutable.Map[Char, mutable.Set[Int]] = Exercise01.indexes("at")
    assertEquals(result, expectedResult)
  }

  test("Test case 2") {
    val expectedResult: mutable.Map[Char, mutable.Set[Int]] = mutable.Map[Char, mutable.Set[Int]]('o' -> mutable.Set[Int](0, 2), 'v' -> mutable.Set[Int](1))
    val result: mutable.Map[Char, mutable.Set[Int]] = Exercise01.indexes("ovo")
    assertEquals(result, expectedResult)
  }
}
