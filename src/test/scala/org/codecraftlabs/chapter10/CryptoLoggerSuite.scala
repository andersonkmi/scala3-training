package org.codecraftlabs.chapter10

class CryptoLoggerSuite extends munit.FunSuite:
  test("Simple test") {
    val person = Person("test")
    assertEquals(person.name, "test")
  }
