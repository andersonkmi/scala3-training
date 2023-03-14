package org.codecraftlabs.chapter2

object Exercise9 {
  def product(s: String): Long =
    if s.tail != "" then s.head.toLong * product(s.tail) else s.head.toLong 
}
