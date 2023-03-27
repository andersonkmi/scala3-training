package org.codecraftlabs.chapter5

class PersonSuite extends munit.FunSuite {
  test("Create new person - test 1") {
    val person = Person("Bob Silva")

    assertEquals(person.firstName, "Bob")
    assertEquals(person.lastName, "Silva")
  }

  test("Create new person - test 2") {
    val person = Person("Bob Silva 12")

    assertEquals(person.firstName, "Bob")
    assertEquals(person.lastName, "Silva")
  }

  test("Create new person - test 3") {
    val person = Person("Anderson")

    assertEquals(person.firstName, "")
    assertEquals(person.lastName, "")
  }

  test("Create new person - test 4") {
    val person = Person("")

    assertEquals(person.firstName, "")
    assertEquals(person.lastName, "")
  }
}
