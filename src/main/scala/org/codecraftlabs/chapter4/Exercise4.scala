package org.codecraftlabs.chapter4

import java.io.File
import scala.collection.immutable.SortedMap

object Exercise4 {
  def countWords(fileName: String): Map[String, Int] = {
    val words: collection.mutable.ListBuffer[String] = collection.mutable.ListBuffer()

    val in = java.util.Scanner(new File(fileName))
    while in.hasNext do
      val token = in.next
      words.addOne(token)

    val sortedMap: SortedMap[String, Int] = SortedMap[String, Int]() ++ words.groupBy(identity).map(x => (x._1, x._2.size)).withDefaultValue(0)
    sortedMap.withDefaultValue(0)
  }
}
