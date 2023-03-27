package org.codecraftlabs.chapter5

class Car(val manufacturer: String, val model: String):
  private var modelYear: Int = -1
  var licensePlate: String = ""

  def this(manufacturer: String, model: String, modelYear: Int) =
    this(manufacturer, model)
    this.modelYear = modelYear

  def this(manufacturer: String, model: String, licensePlate: String) =
    this(manufacturer, model)
    this.licensePlate = licensePlate

  def this(manufacturer: String, model: String, modelYear: Int, licensePlate: String) =
    this(manufacturer, model)
    this.modelYear = modelYear
    this.licensePlate = licensePlate

  def getModelYear: Int = modelYear