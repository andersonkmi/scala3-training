package org.codecraftlabs.chapter2

import org.codecraftlabs.chapter4.Person

class Exercise05Suite extends munit.FunSuite {
  test("Verify if a number is positive") {
    assertEquals(Exercise5.signum(1), 1)
  }

  test("Verify if a number is zero") {
    assertEquals(Exercise5.signum(0), 0)
  }

  test("Verify if a number is negative") {
    assertEquals(Exercise5.signum(-2), -1)
  }
}
