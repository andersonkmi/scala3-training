package org.codecraftlabs.chapter5

class BankAccount(private var accountBalance: Double):
  def deposit(amount: Double): Double =
    accountBalance += amount
    accountBalance

  def withdraw(amount: Double): Double =
    accountBalance -= amount
    accountBalance

  def balance: Double = accountBalance
