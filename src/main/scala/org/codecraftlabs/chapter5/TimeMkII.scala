package org.codecraftlabs.chapter5

class TimeMkII (private val hour: Int = 0, private val minute: Int = 0):
  private val elapsedMinutes: Int = (hour * 60) + minute
  
  def before(other: TimeMkII): Boolean =
    if (this.elapsedMinutes < other.elapsedMinutes) true
    else false
