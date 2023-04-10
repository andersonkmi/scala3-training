package org.codecraftlabs.chapter8

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance):
  private val fee: Double = 1.00
  private var transactionCounter: Int = 0
  private val freeTransactionQuantity: Int = 3

  override def deposit(amount: Double): Double = {
    val amountAfterFee = applyFeeForDeposits(amount)
    super.deposit(amountAfterFee)
    incrementTransactionCounter()
    currentBalance
  }

  override def withdraw(amount: Double): Double = {
    val amountAfterFee = applyFeeForWithdraws(amount)
    super.withdraw(amountAfterFee)
    incrementTransactionCounter()
    currentBalance
  }

  def earnMonthlyInterest(): Double = {
    val interestValue = currentBalance * 0.1
    transactionCounter = 0
    super.deposit(interestValue)
  }

  private def applyFeeForDeposits(amount: Double): Double =
    if (transactionCounter >= freeTransactionQuantity){
      amount - fee
    }  else {
      amount
    }

  private def applyFeeForWithdraws(amount: Double): Double =
    if (transactionCounter >= freeTransactionQuantity) amount + fee else amount

  private def incrementTransactionCounter(): Unit = transactionCounter += 1