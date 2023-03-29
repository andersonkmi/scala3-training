package org.codecraftlabs.chapter6

object GallonsToLiters extends UnitConversion:
  override def convert(value: Double): Double = value * 3.78541178
