package org.codecraftlabs.chapter13

import scala.collection.immutable.SortedSet

object Exercise02 {
  def indexes(input: String): Map[Char, Set[Int]] = {
    input.indices.foldLeft(Map[Char, Set[Int]]()) {
      (m, i) =>
        m + (input(i) -> (m.getOrElse(input(i), SortedSet[Int]()) + i))
    }
  }
}
