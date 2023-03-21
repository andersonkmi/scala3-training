package org.codecraftlabs.chapter4

import org.codecraftlabs.chapter4.Exercise3.countWords

class Exercise3Suite extends munit.FunSuite {
  test("Count words") {
    val result = countWords("./src/test/scala/org/codecraftlabs/chapter4/test.txt")
    assertEquals(result("car"), 2)
    assertEquals(result("test"), 3)
    assertEquals(result("scala"), 1)
    assertEquals(result("mirror"), 1)
    assertEquals(result("fail"), 0)
    assert(true)
  }
}