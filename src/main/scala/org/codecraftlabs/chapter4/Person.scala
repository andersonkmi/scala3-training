package org.codecraftlabs.chapter4

case class Person(name: String, age: Int) :
  def appendToName(suffix: String): Person =
    Person(s"$name $suffix", age)

object Person:
  def apply(name: String, age: Int): Person =
    val capitalizedName =
      if name != null && name.nonEmpty then
        name.capitalize
      else throw new IllegalArgumentException("Empty name")
    new Person(capitalizedName, age)