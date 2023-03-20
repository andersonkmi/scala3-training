package org.codecraftlabs.chapter4

import org.codecraftlabs.chapter4.Exercise2.countWords

class Exercise2Suite extends munit.FunSuite {
  test("Count words") {
    val result = countWords("./src/test/scala/org/codecraftlabs/chapter4/test.txt")
    assertEquals(result.getOrElse("car", 0), 2)
    assertEquals(result.getOrElse("test", 0), 3)
    assertEquals(result.getOrElse("scala", 0), 1)
    assertEquals(result.getOrElse("mirror", 0), 1)
    assertEquals(result.getOrElse("fail", 0), 0)
    assert(true)
  }
}