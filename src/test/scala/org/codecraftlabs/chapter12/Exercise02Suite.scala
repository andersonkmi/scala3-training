package org.codecraftlabs.chapter12

import org.codecraftlabs.chapter12.Exercise02.findLargestElement

class Exercise02Suite extends munit.FunSuite {
  test("Test 01") {
    val expectedResult: Int = 4
    val result: Int = findLargestElement(Array(3, 4, -1, 2))
    assertEquals(result, expectedResult)
  }
}
