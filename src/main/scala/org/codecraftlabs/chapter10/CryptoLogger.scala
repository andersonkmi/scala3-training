package org.codecraftlabs.chapter10

trait CryptoLogger extends Logger:
  val key = 3
  override def log(message: String): Unit = {
    val ceasarMessage = for (c <- message.toUpperCase) yield c match {
      case a if 'A' <= a && a <= 'Z' => applyKey(a, 'A', 26)
      case a if '0' <= a && a <= '9' => applyKey(a, '0', 10)
      case _ => c
    }
    super.log(ceasarMessage)
  }
    
  private def applyKey(c: Char, r: Char, l: Int): Char = ((c - r + key) % l + r).toChar
  