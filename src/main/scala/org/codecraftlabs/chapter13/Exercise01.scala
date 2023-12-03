package org.codecraftlabs.chapter13

import scala.collection.mutable

object Exercise01 {
  def indexes(input: String): mutable.Map[Char, mutable.Set[Int]] = {
    val result = mutable.Map[Char, mutable.Set[Int]]()
    val charIndexes = input.zipWithIndex

    charIndexes.foreach(item => {
      val positions = result.getOrElse(item._1, mutable.Set[Int]())
      positions.add(item._2)
      result(item._1) = positions
    })

    result
  }

  def getIndexes(input: String): mutable.Map[Char, mutable.SortedSet[Int]] = {
    input.indices.foldLeft(mutable.Map[Char, mutable.SortedSet[Int]]()) {
      (m, i) =>
        m += (input(i) -> (m.getOrElse(input(i), mutable.SortedSet[Int]()) += i))
    }
  }
}
