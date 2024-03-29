package org.codecraftlabs.chapter3

import org.codecraftlabs.chapter3.Exercise2.swapValues

class Exercise2Suite extends munit.FunSuite {
  test("Swap values") {
    val values = Array(1, 2)
    swapValues(values)

    val expected = Array(2, 1)
    assertEquals(values.mkString, expected.mkString)
  }

  test("Swap values one item") {
    val values = Array(1)
    swapValues(values)

    val expected = Array(1)
    assertEquals(values.mkString, expected.mkString)
  }

  test("Swap values array with 3 values") {
    val values = Array(1, 2, 3)
    swapValues(values)

    val expected = Array(2, 1, 3)
    assertEquals(values.mkString, expected.mkString)
  }

  test("Swap values array with 4 values") {
    val values = Array(1, 2, 3, 4)
    swapValues(values)

    val expected = Array(2, 1, 4, 3)
    assertEquals(values.mkString, expected.mkString)
  }
}
