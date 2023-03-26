package org.codecraftlabs.chapter5

class Time (val hour: Int = 0, val minute: Int = 0):
  def before(other: Time): Boolean =
    if (this.hour < other.hour) true
    else if (this.hour == other.hour && this.minute < other.minute) true
    else false
