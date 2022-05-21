package org.codecraftlabs

import scala.annotation.tailrec

class Rational (n: Int, d: Int) {
  require(d != 0)

  private val g = gcd (n.abs, d.abs)
  val  numer = n / g
  val denom = d / g
  
  def this (n: Int) = this (n, 1)
  
  def +(that: Rational): Rational = {
    Rational (numer * that.denom + that.numer * denom, denom * that.denom)
  }

  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if b == 0 then a else gcd (b, a % b)
  }
}
