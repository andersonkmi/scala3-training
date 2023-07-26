package org.codecraftlabs.chapter12

import org.codecraftlabs.chapter12.Exercise05.largest

class Exercise05Suite extends munit.FunSuite {
  test("Test case 1") {
    val expected: Int = 25
    val result = largest(x => 10 * x - x * x, 1 to 10)
    assertEquals(result, expected)
  }

  test("Test case 2") {
    val expected = 10
    val result = largest(x => x * 1, 1 to 10)
    assertEquals(result, expected)
  }
}
