package org.codecraftlabs.chapter6

class GallonsToLitersSuite extends munit.FunSuite:
  test ("Conversion test 1") {
    val converted = GallonsToLiters.convert(1.00)
    assertEquals(converted, 3.78541178)
  }
