package org.codecraftlabs.chapter3

import scala.util.Random

object Exercise1 {
  def generateArray(n: Int): Array[Int] =
    Array.ofDim[Int](n).map(_ => Random.nextInt(n))
}
