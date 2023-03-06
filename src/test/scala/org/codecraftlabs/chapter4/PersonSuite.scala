package org.codecraftlabs.chapter4

class PersonSuite extends munit.FunSuite {
  test("Create simple person") {
    val person1 = Person("Anderson", 32)
    assertEquals(person1.name, "Anderson")
    assertEquals(person1.age, 32)
  }

  test("Call appendToName should return a new person") {
    val originalPerson = Person("Anderson", 32)
    val modifiedPerson = originalPerson.appendToName("Silva")

    assertNotEquals(originalPerson, modifiedPerson)
    assertEquals(modifiedPerson.name, "Anderson Silva")
    assertEquals(modifiedPerson.age, 32)
  }
}
