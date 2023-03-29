package org.codecraftlabs.chapter6

class InchesToCentimetersSuite extends munit.FunSuite:
  test("Conversion test") {
    val converted = InchesToCentimeters.convert(1.00)
    assertEquals(converted, 2.54)
  }
