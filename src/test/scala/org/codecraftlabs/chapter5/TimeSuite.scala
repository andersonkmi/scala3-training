package org.codecraftlabs.chapter5

class TimeSuite extends munit.FunSuite {
  test("Create simple Time") {
    val time = Time()
    assertEquals(time.hour, 0)
    assertEquals(time.minute, 0)
  }

  test("Compare times - before true") {
    val time1 = Time()
    val time2 = Time(1)
    assertEquals(time1.before(time2), true)
  }

  test("Compare hour and minutes - before true") {
    val time1 = Time(0, 10)
    val time2 = Time(0, 11)
    assertEquals(time1.before(time2), true)
  }

  test("Compare hour and minutes same time - before false") {
    val time1 = Time(0, 11)
    val time2 = Time(0, 11)
    assertEquals(time1.before(time2), false)
  }

  test("Compare times - before false") {
    val time1 = Time(2)
    val time2 = Time(1)
    assertEquals(time1.before(time2), false)
  }
}
