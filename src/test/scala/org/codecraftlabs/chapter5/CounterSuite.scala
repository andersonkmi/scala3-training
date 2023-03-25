package org.codecraftlabs.chapter5

class CounterSuite extends munit.FunSuite {
  test("Create simple Counter") {
    val counter = Counter()
    assertEquals(counter.current, 0)
  }
}
