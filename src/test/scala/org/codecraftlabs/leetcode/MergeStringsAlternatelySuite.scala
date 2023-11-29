package org.codecraftlabs.leetcode

class MergeStringsAlternatelySuite extends munit.FunSuite {
  test("Merge 2 strings with the same length") {
    val expectedResult: String = "acbd"
    val word1: String = "ab"
    val word2: String = "cd"
    val result: String = MergeStringsAlternately.run(word1, word2)
    assertEquals(result, expectedResult, "Result is not what is expected")
  }

  test("Merge 2 strings both single character") {
    val expectedResult: String = "ab"
    val word1: String = "a"
    val word2: String = "b"
    val result: String = MergeStringsAlternately.run(word1, word2)
    assertEquals(result, expectedResult)
  }
}
