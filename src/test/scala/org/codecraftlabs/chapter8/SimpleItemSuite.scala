package org.codecraftlabs.chapter8

class SimpleItemSuite extends munit.FunSuite:
  test ("Create simple item") {
    val item = SimpleItem("Product 1", 1.00)
    assertEquals(item.description, "Product 1")
    assertEquals(item.price, 1.00)
  }
