package org.codecraftlabs.chapter2

class Exercise9Suite extends munit.FunSuite {
  test("Calculate product for Hello string") {
    val expectedValue: Long = 9415087488L
    assertEquals(Exercise9.product("Hello"), expectedValue)
  }

  test("Calculate product for Anderson string") {
    val expectedValue: Long = 11559678916500000L
    assertEquals(Exercise9.product("Anderson"), expectedValue)
  }
}
