package org.codecraftlabs

import scala.annotation.{tailrec, targetName}

class Rational (n: Int, d: Int) {
  require(d != 0)

  private val g = gcd (n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this (n: Int) = this (n, 1)

  @targetName("Add rational number")
  def +(that: Rational): Rational = {
    Rational (numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)
  }

  @targetName("Add integer")
  def +(i: Int): Rational = {
    Rational (numerator + i * denominator, denominator)
  }

  @targetName("Subtract rational number")
  def -(that: Rational): Rational = {
    Rational (numerator * that.denominator - that.numerator * denominator, denominator * that.denominator)
  }

  @targetName("Subtract integer")
  def -(i: Int): Rational = {
    Rational (numerator - i * denominator, denominator)
  }

  @targetName("Multiply rational number")
  def *(that: Rational): Rational = {
    Rational(numerator * that.numerator, denominator * that.denominator)
  }

  @targetName("Multiply integer number")
  def *(i: Int): Rational = {
    Rational(numerator * i, denominator)
  }

  @targetName("Divide rational number")
  def /(that: Rational): Rational = {
    Rational(numerator * that.denominator, denominator * that.numerator)
  }

  @targetName("Divide integer number")
  def /(i: Int): Rational = {
    Rational(numerator, denominator * i)
  }

  override def toString: String = s"$numerator/$denominator"

  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if b == 0 then a else gcd (b, a % b)
  }
}

object Rational {
  def apply(numerator: Int, denominator: Int = 1): Rational = {
    new Rational(numerator, denominator)
  }
}
