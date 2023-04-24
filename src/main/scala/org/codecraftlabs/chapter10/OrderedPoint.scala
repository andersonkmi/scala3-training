package org.codecraftlabs.chapter10

import java.awt.Point

class OrderedPoint(x: Int, y: Int) extends Point(x, y) with scala.math.Ordered[Point]:
  def compare(that: Point): Int = {
    ((this.x - that.x).sign, (this.y - that.y).sign) match {
      case(-1, _) | (0, -1) => -1
      case (0, 0) => 0
      case _ => 1
    }
  }
