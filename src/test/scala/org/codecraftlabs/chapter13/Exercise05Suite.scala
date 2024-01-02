package org.codecraftlabs.chapter13

class Exercise05Suite extends munit.FunSuite {
  test("Test case 001") {
    val input: Array[String] = Array[String]("string01", ",", "string02")
    val result: String = Exercise05.mkString(input)
    assertEquals(result, "string01,string02")
  }
}
