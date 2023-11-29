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

  test ("Merge 2 empty strings should result in an empty string as well") {
    val expectedResult: String = ""
    val result: String = MergeStringsAlternately.run("", "")
    assertEquals(result, expectedResult)
  }

  test ("Merge 2 strings with different lengths") {
    val expectedResult: String = "acb"
    val word1: String = "ab"
    val word2: String = "c"
    val result: String = MergeStringsAlternately.run(word1, word2)
    assertEquals(result, expectedResult)
  }

  test("Merge 2 strings with different lengths again") {
    val expectedResult: String = "abc"
    val word1: String = "a"
    val word2: String = "bc"
    val result: String = MergeStringsAlternately.run(word1, word2)
    assertEquals(result, expectedResult)
  }
}
