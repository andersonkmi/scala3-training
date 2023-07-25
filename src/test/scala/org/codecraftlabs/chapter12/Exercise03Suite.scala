package org.codecraftlabs.chapter12

class Exercise03Suite extends munit.FunSuite {
  test("Test case 01") {
    val expectedResult: Int = 1
    val result = Exercise03.factorial(0)
    assertEquals(result, expectedResult)
  }

  test("Test case 02") {
    val expectedResult: Int = 1
    val result = Exercise03.factorial(1)
    assertEquals(result, expectedResult)
  }

  test("Test case 03") {
    val expectedResult: Int = 2
    val result = Exercise03.factorial(2)
    assertEquals(result, expectedResult)
  }

  test("Test case 04") {
    val expectedResult: Int = 120
    val result = Exercise03.factorial(5)
    assertEquals(result, expectedResult)
  }
}
