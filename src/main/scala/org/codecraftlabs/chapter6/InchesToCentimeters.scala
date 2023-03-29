package org.codecraftlabs.chapter6

object InchesToCentimeters extends UnitConversion:
  override def convert(value: Double): Double = value * 2.54
