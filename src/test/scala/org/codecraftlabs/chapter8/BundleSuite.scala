package org.codecraftlabs.chapter8

class BundleSuite extends munit.FunSuite:
  test("Create empty bundle") {
    val bundle = Bundle()
    assertEquals(bundle.description, "")
    assertEquals(bundle.price, 0.00)
  }
