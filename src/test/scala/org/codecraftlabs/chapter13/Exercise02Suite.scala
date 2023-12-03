package org.codecraftlabs.chapter13

import scala.collection.immutable.SortedSet

class Exercise02Suite extends munit.FunSuite {
  test("Testing with Mississippi string") {
    val expectedResult: Map[Char, SortedSet[Int]] =
      Map[Char, SortedSet[Int]](
        'M' -> SortedSet[Int](0),
        's' -> SortedSet[Int](2, 3, 5, 6),
        'p' -> SortedSet[Int](8, 9),
        'i' -> SortedSet[Int](1, 4, 7, 10))

    val result: Map[Char, Set[Int]] = Exercise02.indexes("Mississippi")
    assertEquals(result, expectedResult)
  }
}
