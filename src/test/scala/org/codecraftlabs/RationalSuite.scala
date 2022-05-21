package org.codecraftlabs

class RationalSuite extends munit.FunSuite {
  test ("Add two rationals") {
    val r1 = Rational(1, 3)
    val r2 = Rational(1, 3)

    val result = r1 + r2
    assertEquals(result.numerator, 2)
    assertEquals(result.denominator, 3)
  }

  test ("Add rational number to an integer value") {
    val r1 = Rational(1, 5)

    val result = r1 + 1
    assertEquals(result.numerator, 6)
    assertEquals(result.denominator, 5)
  }

  test ("Subtract two rationals") {
    val r1 = Rational(3, 4)
    val r2 = Rational(1, 4)

    val result = r1 - r2
    assertEquals(result.numerator, 1)
    assertEquals(result.denominator, 2)
  }

  test ("Subtract rational number from an integer value") {
    val r1 = Rational(2, 5)

    val result = r1 - 1
    assertEquals(result.numerator, -3)
    assertEquals(result.denominator, 5)
  }

  test ("Multiply two rationals") {
    val r1 = Rational(1, 2)
    val r2 = Rational(1, 2)

    val result = r1 * r2
    assertEquals(result.numerator, 1)
    assertEquals(result.denominator, 4)
  }
}
