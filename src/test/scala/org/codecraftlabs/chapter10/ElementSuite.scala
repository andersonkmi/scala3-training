package org.codecraftlabs.chapter10

class ElementSuite extends munit.FunSuite {
  test ("Simple test 1") {
    val element: Element = VectorElement(Vector("hello", "other"))
    assertEquals(element.width, 5)
  }
}
