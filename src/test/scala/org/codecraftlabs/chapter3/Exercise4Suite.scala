package org.codecraftlabs.chapter3

import org.codecraftlabs.chapter3.Exercise4.splitNumbers

class Exercise4Suite extends munit.FunSuite{
  test("Split single element array") {
    val values = Array(0)
    val result = splitNumbers(values)

    val expected = Array(0)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Split only sorted positive numbers") {
    val values = Array(1, 2)
    val result = splitNumbers(values)

    val expected = Array(1, 2)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Split only non sorted positive numbers") {
    val values = Array(10, 1, 2)
    val result = splitNumbers(values)

    val expected = Array(10, 1, 2)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Split one positive and one negative number") {
    val values = Array(-1, 1)
    val result = splitNumbers(values)

    val expected = Array(1, -1)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Split one positive and one negative (already sorted) number") {
    val values = Array(1, -1)
    val result = splitNumbers(values)

    val expected = Array(1, -1)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Split positive, negative and zero number") {
    val values = Array(-1, 0, 1)
    val result = splitNumbers(values)

    val expected = Array(1, -1, 0)
    assertEquals(result.mkString, expected.mkString)
  }

  test("Split positive, negative and zero number") {
    val values = Array(1, -1, 2, -2, 3, -3, 0)
    val result = splitNumbers(values)

    val expected = Array(1, 2, 3, -1, -2, -3, 0)
    assertEquals(result.mkString, expected.mkString)
  }

}
