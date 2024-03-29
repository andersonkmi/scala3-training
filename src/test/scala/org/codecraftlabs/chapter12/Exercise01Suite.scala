package org.codecraftlabs.chapter12

import org.codecraftlabs.chapter12.Exercise01.values

class Exercise01Suite extends munit.FunSuite {
  test ("Test case 1") {
    val expectedResult: Seq[(Int, Int)] = Seq((1, 1), (2, 4))
    val result = values(x => x * x, 1, 2)
    assertEquals(result, expectedResult)
  }

  test ("Test case 2") {
    val expectedResult: Seq[(Int, Int)] = Seq((1, 1), (2, 8), (3, 27))
    val result = values(x => x * x * x, 1, 3)
    assertEquals(result, expectedResult)
  }
}
