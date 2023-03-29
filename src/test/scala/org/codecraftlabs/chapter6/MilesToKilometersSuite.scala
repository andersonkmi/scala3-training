package org.codecraftlabs.chapter6

class MilesToKilometersSuite extends munit.FunSuite:
  test ("Conversion test") {
    val converted = MilesToKilometers.convert(1.00)
    assertEquals(converted, 1.609344)
  }
