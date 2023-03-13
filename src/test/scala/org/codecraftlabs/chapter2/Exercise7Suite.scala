package org.codecraftlabs.chapter2

class Exercise7Suite extends munit.FunSuite {
  test("Calculate product for Hello string") {
    val expectedValue: Long = 9415087488L
    assertEquals(Exercise7.product("Hello"), expectedValue)
  }

  test("Calculate product for Anderson string") {
    val expectedValue: Long = 11559678916500000L
    assertEquals(Exercise7.product("Anderson"), expectedValue)
  }
}
