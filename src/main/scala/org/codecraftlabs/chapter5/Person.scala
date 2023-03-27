package org.codecraftlabs.chapter5

class Person(fullName: String):
  val (firstName, lastName) = fullName.split(" ") match
    case Array(f: String, l: String, _*) => (f, l)
    case _ => ("", "")