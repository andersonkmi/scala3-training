package org.codecraftlabs.chapter5

class Counter:
  private var value: Int = 0
  def increment(): Unit =
    if value < Int.MaxValue then
      value += 1

  def current: Int = value
