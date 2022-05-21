package org.codecraftlabs

class RationalSuite extends munit.FunSuite {
  test ("Add two rationals") {
    val r1 = Rational(1, 3)
    val r2 = Rational(1, 3)

    val result = r1 + r2
    assertEquals(result.numer, 2)
    assertEquals(result.denom, 3)
  }
}
