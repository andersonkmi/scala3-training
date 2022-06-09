package org.codecraftlabs.chapter10

abstract class Element {
  def contents: Vector[String]
  def height: Int = contents.length
  def width: Int = if height == 0 then 0 else contents(0).length

  def above(that: Element): Element = {
    VectorElement(this.contents ++ that.contents)
  }

  def beside(that: Element): Element = {
    VectorElement(
      for (line1, line2) <- this.contents.zip(that.contents)
      yield line1 + line2
    )
  }

  override def toString: String = contents.mkString("\n")
}
