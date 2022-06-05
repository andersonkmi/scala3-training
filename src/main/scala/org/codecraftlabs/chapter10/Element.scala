package org.codecraftlabs.chapter10

abstract class Element {
  def contents: Vector[String]
  def height: Int = contents.length
  def width: Int = if height == 0 then 0 else contents(0).length
}
