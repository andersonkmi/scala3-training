package org.codecraftlabs.chapter12

class Exercise06Suite extends munit.FunSuite {
  test("Test case 01") {
    val expected = 5
    val result = Exercise06.largestAt(x => 10 * x - x * x, 1 to 10)
    assertEquals(result, expected)
  }

}
