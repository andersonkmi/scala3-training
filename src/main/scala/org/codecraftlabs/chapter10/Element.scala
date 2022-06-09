package org.codecraftlabs.chapter10

abstract class Element {
  def contents: Vector[String]
  def height: Int = contents.length
  def width: Int = if height == 0 then 0 else contents(0).length

  def above(that: Element): Element = {
    VectorElement(this.contents ++ that.contents)
  }

  def beside(that: Element): Element = {
    val newContents = new Array[String](this.contents.length)

    for i <- this.contents.indices do
      newContents(i) = this.contents(i) + that.contents(i)

    VectorElement(newContents.toVector)
  }
}
