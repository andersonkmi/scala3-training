package org.codecraftlabs.chapter4

case class Person(name: String, age: Int) :
  def appendToName(suffix: String): Person =
    Person(s"$name $suffix", age)
