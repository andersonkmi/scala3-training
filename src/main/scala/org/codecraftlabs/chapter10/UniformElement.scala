package org.codecraftlabs.chapter10

class UniformElement (ch: Char, override val width: Int, override val height: Int) extends Element {
  private val line = ch.toString * width
  def contents: Vector[String] = Vector.fill(height)(line)
}
