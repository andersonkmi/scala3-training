package org.codecraftlabs.chapter3

import org.codecraftlabs.chapter3.Exercise3.swapValues

class Exercise3Suite extends munit.FunSuite{
  test("Swap values") {
    val values = Array(1, 2)
    val result = swapValues(values)

    val expected = Array(2, 1)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Swap values one item") {
    val values = Array(1)
    val result = swapValues(values)

    val expected = Array(1)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Swap values array with 3 values") {
    val values = Array(1, 2, 3)
    val result = swapValues(values)

    val expected = Array(2, 1, 3)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Swap values array with 4 values") {
    val values = Array(1, 2, 3, 4)
    val result = swapValues(values)

    val expected = Array(2, 1, 4, 3)
    assertEquals(result.mkString, expected.mkString)
  }
}
