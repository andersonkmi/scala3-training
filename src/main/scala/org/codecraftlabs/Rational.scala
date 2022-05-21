package org.codecraftlabs

import scala.annotation.tailrec

class Rational (n: Int, d: Int) {
  require(d != 0)

  private val g = gcd (n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this (n: Int) = this (n, 1)

  def +(that: Rational): Rational = {
    Rational (numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)
  }

  def + (i: Int): Rational = {
    Rational (numerator + i * denominator, denominator)
  }

  def - (that: Rational): Rational = {
    Rational (numerator * that.denominator - that.numerator * denominator, denominator * that.denominator)
  }

  def - (i: Int): Rational = {
    Rational (numerator - i * denominator, denominator)
  }

  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if b == 0 then a else gcd (b, a % b)
  }
}
