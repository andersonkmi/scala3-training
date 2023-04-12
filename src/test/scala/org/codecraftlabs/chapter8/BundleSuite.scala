package org.codecraftlabs.chapter8

class BundleSuite extends munit.FunSuite:
  test("Create empty bundle") {
    val bundle = Bundle()
    assertEquals(bundle.description, "")
    assertEquals(bundle.price, 0.00)
  }

  test("Create single item bundle") {
    val bundle = Bundle()
    val item1 = SimpleItem(description = "Product 1", price = 1.12)
    bundle.add(item1)

    assertEquals(bundle.description, "Product 1")
    assertEquals(bundle.price, 1.12)
  }

  test("Create multiple item bundle") {
    val bundle = Bundle()
    bundle.add(SimpleItem(description = "Product 1", price = 1.12))
    bundle.add(SimpleItem(description = "Product 2", price = 2.34))

    assertEquals(bundle.description, "Product 1, Product 2")
    assertEquals(bundle.price, 3.46)
  }
