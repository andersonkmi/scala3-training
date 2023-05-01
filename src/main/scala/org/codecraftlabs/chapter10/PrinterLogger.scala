package org.codecraftlabs.chapter10

trait PrinterLogger extends Logger:
  override def log(message: String): Unit =
    println(message)
