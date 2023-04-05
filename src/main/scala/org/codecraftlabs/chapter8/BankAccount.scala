package org.codecraftlabs.chapter8

class BankAccount(initialBalance: Double) :
  private var balance: Double = initialBalance
  def currentBalance: Double = balance
  def deposit(amount: Double): Double = {
    balance += amount
    balance
  }

  def withdraw(amount: Double): Double = {
    balance -= amount
    balance
  }
