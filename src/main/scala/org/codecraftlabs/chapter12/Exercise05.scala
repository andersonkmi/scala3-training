package org.codecraftlabs.chapter12

object Exercise05 {
  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.map(fun(_)).max
  }
}
