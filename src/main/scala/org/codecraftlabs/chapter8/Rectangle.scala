package org.codecraftlabs.chapter8

class Rectangle(val upperLeft: (Double, Double), val width: Double, val height: Double) extends Shape:
  def centerPoint: (Double, Double) = (upperLeft._1 + width/2, upperLeft._2 + height / 2)
