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

  test("Testing with Mississippi string") {
    val expectedResult: mutable.Map[Char, mutable.SortedSet[Int]] =
      mutable.Map[Char, mutable.SortedSet[Int]](
        'M' -> mutable.SortedSet[Int](0),
        's' -> mutable.SortedSet[Int](2, 3, 5, 6),
        'p' -> mutable.SortedSet[Int](8, 9),
        'i' -> mutable.SortedSet[Int](1, 4, 7, 10))

    val result: mutable.Map[Char, mutable.SortedSet[Int]] = Exercise01.getIndexes("Mississippi")
    assertEquals(result, expectedResult)
  }
}
