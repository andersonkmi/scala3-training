package org.codecraftlabs.chapter12

object Exercise06 {
  def largestAt(fun: Int => Int, inputs: Seq[Int]): Int = {
    inputs.map(value => (fun(value), value)).max._2
  }
}
