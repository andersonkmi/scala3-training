package org.codecraftlabs.chapter4

import java.io.File

object Exercise2 {
  def countWords(fileName: String): collection.mutable.Map[String, Int] = {
    val wordMap: collection.mutable.Map[String, Int] = collection.mutable.Map()
    val in = java.util.Scanner(new File(fileName))
    while in.hasNext() do
      val token = in.next()
      if (wordMap.contains(token)) {
        val currentCount = wordMap(token)
        wordMap(token) = currentCount + 1
      } else {
        wordMap(token) = 1
      }
    wordMap.withDefaultValue(0)
  }
}
