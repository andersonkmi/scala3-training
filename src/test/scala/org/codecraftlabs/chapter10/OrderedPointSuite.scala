package org.codecraftlabs.chapter10

class OrderedPointSuite extends munit.FunSuite:
  test ("Create ordered point") {
    val op1 = OrderedPoint(10, 5)
    val op2 = OrderedPoint(10, 6)
    assert(op1 < op2)
  }
