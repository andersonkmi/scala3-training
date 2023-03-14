package org.codecraftlabs.chapter2

class Exercise8Suite extends munit.FunSuite {
  test("Calculate product for Hello string") {
    val expectedValue: Long = 9415087488L
    assertEquals(Exercise8.product("Hello"), expectedValue)
  }

  test("Calculate product for Anderson string") {
    val expectedValue: Long = 11559678916500000L
    assertEquals(Exercise8.product("Anderson"), expectedValue)
  }
}
