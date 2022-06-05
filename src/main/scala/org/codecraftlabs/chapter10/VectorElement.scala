package org.codecraftlabs.chapter10

class VectorElement(conts: Vector[String]) extends Element {
  private val elementContents: Vector[String] = conts
  def contents: Vector[String] = elementContents
}
