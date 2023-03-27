package org.codecraftlabs.chapter5

class CarSuite extends munit.FunSuite {
  test ("Create simple car") {
    val car = Car("Honda", "Fit")
    assertEquals(car.model, "Fit")
    assertEquals(car.manufacturer, "Honda")
    assertEquals(car.licensePlate, "")
    assertEquals(car.getModelYear, -1)
  }

  test("Create simple car") {
    val car = Car("Honda", "Fit", 2023)
    assertEquals(car.model, "Fit")
    assertEquals(car.manufacturer, "Honda")
    assertEquals(car.licensePlate, "")
    assertEquals(car.getModelYear, 2023)
  }

  test("Create simple car") {
    val car = Car("Honda", "Fit", "EFV1212")
    assertEquals(car.model, "Fit")
    assertEquals(car.manufacturer, "Honda")
    assertEquals(car.licensePlate, "EFV1212")
    assertEquals(car.getModelYear, -1)
  }

  test("Create simple car") {
    val car = Car("Honda", "Fit", 2023, "EFV1212")
    assertEquals(car.model, "Fit")
    assertEquals(car.manufacturer, "Honda")
    assertEquals(car.licensePlate, "EFV1212")
    assertEquals(car.getModelYear, 2023)
  }
}
