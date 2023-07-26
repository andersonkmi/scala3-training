package org.codecraftlabs.chapter12

import org.codecraftlabs.chapter12.Exercise06.largestAt

class Exercise06Suite extends munit.FunSuite {
  test("Test case 01") {
    val expected = 5
    val result = largestAt(x => 10 * x - x * x, 1 to 10)
    assertEquals(result, expected)
  }

  test("Test case 02") {
    val expected = 10
    val result = largestAt(x => x / 2, 1 to 10)
    assertEquals(result, expected)
  }
}
