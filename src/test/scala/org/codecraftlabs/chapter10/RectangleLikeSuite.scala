package org.codecraftlabs.chapter10

import java.awt.geom.Ellipse2D

class RectangleLikeSuite extends munit.FunSuite:
  test("Create extended Ellipse2D") {
    val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    egg.translate(10, 10)
    assertEquals(egg.getX, 15.00)
    assertEquals(egg.getY, 20.00)

    egg.grow(10, 20)
    assertEquals(egg.getWidth, 30.00)
    assertEquals(egg.getHeight, 50.00)
  }
