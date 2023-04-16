package org.codecraftlabs.chapter8

class LabeledPointSuite extends munit.FunSuite:
  test("Create simple labeled point") {
    val labeledPoint = LabeledPoint("Start point", 1, 1)
    assertEquals(labeledPoint.label, "Start point")
    assertEquals(labeledPoint.x, 1.00)
    assertEquals(labeledPoint.y, 1.00)
  }
