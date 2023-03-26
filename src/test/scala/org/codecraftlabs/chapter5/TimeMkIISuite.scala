package org.codecraftlabs.chapter5

class TimeMkIISuite extends munit.FunSuite {
  test("Compare times - before true") {
    val time1 = TimeMkII()
    val time2 = TimeMkII(1)
    assertEquals(time1.before(time2), true)
  }

  test("Compare hour and minutes - before true") {
    val time1 = TimeMkII(0, 10)
    val time2 = TimeMkII(0, 11)
    assertEquals(time1.before(time2), true)
  }

  test("Compare hour and minutes same time - before false") {
    val time1 = TimeMkII(0, 11)
    val time2 = TimeMkII(0, 11)
    assertEquals(time1.before(time2), false)
  }

  test("Compare times - before false") {
    val time1 = TimeMkII(2)
    val time2 = TimeMkII(1)
    assertEquals(time1.before(time2), false)
  }
}