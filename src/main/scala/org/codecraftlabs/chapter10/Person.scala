package org.codecraftlabs.chapter10


class Person(private val _name: String) extends PrinterLogger with CryptoLogger {
  def name = {log(_name); _name}
}
