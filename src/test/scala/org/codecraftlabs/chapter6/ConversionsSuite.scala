package org.codecraftlabs.chapter6

class ConversionsSuite extends munit.FunSuite {
  test ("Convert inches to centimeters") {
    val converted = Conversions.inchesToCentimeters(1.00)
    assertEquals(converted, 2.54)
  }

  test ("Convert gallons to liters") {
    val converted = Conversions.gallonsToLiters(1.00)
    assertEquals(converted, 3.78541178)
  }

  test ("Convert miles to kilometers") {
    val converted = Conversions.milesToKilometers(1.00)
    assertEquals(converted, 1.609344)
  }
}
