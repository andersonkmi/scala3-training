package org.codecraftlabs.chapter10

class LineElement (val s: String) extends Element {
  val contents: Vector[String] = Vector(s)
  override def width: Int = s.length
  override def height: Int = 1
}
