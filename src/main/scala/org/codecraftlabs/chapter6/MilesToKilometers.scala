package org.codecraftlabs.chapter6

object MilesToKilometers extends UnitConversion:
  override def convert(value: Double): Double = value * 1.609344
