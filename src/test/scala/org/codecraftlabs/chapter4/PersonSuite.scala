package org.codecraftlabs.chapter4

import org.codecraftlabs.Rational

class PersonSuite extends munit.FunSuite {
  test("Create simple person") {
    val person1 = Person("Anderson", 32)
    assertEquals(person1.name, "Anderson")
    assertEquals(person1.age, 32)
  }
}
