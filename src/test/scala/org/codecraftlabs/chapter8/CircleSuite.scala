package org.codecraftlabs.chapter8

class CircleSuite extends munit.FunSuite:
  test("Create simple circle") {
    val circle = Circle((1.2, 2.3), 2.00)
    assertEquals(circle.centerPoint, (1.2, 2.3))
  }
