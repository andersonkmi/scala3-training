package org.codecraftlabs.leetcode

object MergeStringsAlternately {
  def run(word1: String, word2: String): String = {
    val result: StringBuilder = new StringBuilder()
    val largestLength: Int = if word1.length > word2.length then word1.length else word2.length
    for index <- 0 until largestLength do
      // Verifies if the word1 still has more characters
      if (index <= word1.length - 1) {
        result.append(word1.charAt(index))
      }

      // Verifies if the word2 still has more characters
      if (index <= word2.length - 1) {
        result.append(word2.charAt(index))
      }
    end for
    result.toString()
  }
}
