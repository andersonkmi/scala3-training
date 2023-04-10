package org.codecraftlabs.chapter8

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance):
  private val fee: Double = 1.00
  override def deposit(amount: Double): Double = {
    val calculatedAmount = applyFeeForDeposits(amount)
    super.deposit(calculatedAmount)
  }
  
  override def withdraw(amount: Double): Double = {
    val calculatedAmount = applyFeeForWithdraws(amount)
    super.withdraw(calculatedAmount)
  }
  
  private def applyFeeForDeposits(originalAmount: Double): Double = {
    originalAmount - fee
  }

  private def applyFeeForWithdraws(originalAmount: Double): Double = {
    originalAmount + fee
  }
    
