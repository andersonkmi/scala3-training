package org.codecraftlabs.chapter8

class RectangleSuite extends munit.FunSuite:
  test ("Create simple rectangle") {
    val shape: Shape = Rectangle((1, 2), 3.00, 4.00)
    assertEquals(shape.centerPoint, (2.50, 4.00))
  }
