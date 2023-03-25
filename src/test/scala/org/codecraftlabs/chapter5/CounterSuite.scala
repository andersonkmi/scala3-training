package org.codecraftlabs.chapter5

class CounterSuite extends munit.FunSuite {
  test("Create simple Counter") {
    val counter = Counter()
    assertEquals(counter.current, 0)
  }

  test ("Perform simple increment") {
    val counter = Counter()
    assertEquals(counter.current, 0)
    counter.increment()
    assertEquals(counter.current, 1)
  }
}
