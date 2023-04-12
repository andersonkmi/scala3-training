package org.codecraftlabs.chapter8

import scala.collection.mutable.ArrayBuffer

class Bundle:
  private val items: ArrayBuffer[Item] = ArrayBuffer()

  def add(item: Item): Unit =
    items.addOne(item)

  def price: Double =
    items.foldLeft(0.0)(_ + _.price)

  def description: String =
    items.map(_.description).mkString(", ")