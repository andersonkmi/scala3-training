package org.codecraftlabs.chapter5

class BankAccount(private var balance: Double):
  def deposit(amount: Double): Double =
    balance += amount
    balance

  def withdraw(amount: Double): Double =
    balance -= amount
    balance
