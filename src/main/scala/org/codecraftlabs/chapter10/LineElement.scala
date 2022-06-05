package org.codecraftlabs.chapter10

class LineElement (val s: String) extends VectorElement (Vector(s)) {
  override def width: Int = s.length
  override def height: Int = 1
}
