package org.codecraftlabs.chapter10

trait RectangleLike:
  this: java.awt.geom.Ellipse2D =>
    def translate(dx: Int, dy: Int): Unit = 
      setFrame(getX + dx, getY + dy, getWidth, getHeight)
      
    def grow(dw: Int, dh: Int): Unit =
      setFrame(getX, getY, getWidth + dw, getHeight + dh)