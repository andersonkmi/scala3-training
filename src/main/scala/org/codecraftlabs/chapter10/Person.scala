package org.codecraftlabs.chapter10


class Person(private val _name: String) extends PrinterLogger with CryptoLogger {
  override val key: Int = 9
  def name = {log(_name); _name}
}
