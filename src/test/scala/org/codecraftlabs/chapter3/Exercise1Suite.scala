package org.codecraftlabs.chapter3

import org.codecraftlabs.chapter2.Exercise5
import org.codecraftlabs.chapter3.Exercise1.generateArray

class Exercise1Suite extends munit.FunSuite {
  test("Generate array of size 1") {
    assert(generateArray(1).length == 1)
  }

  test("Generate array of size 30") {
    val result = generateArray(30)
    assert(result.length == 30)
  }
}
