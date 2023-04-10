package org.codecraftlabs.chapter8

class CheckingAccountSuite extends munit.FunSuite:
  test ("Create initial checking account") {
    val account = CheckingAccount(0.00)
    assertEquals(account.currentBalance, 0.00)
  }

  test ("Make a deposit") {
    val account = CheckingAccount(10.00)
    assertEquals(account.currentBalance, 10.00)

    val balanceAfterDeposit = account.deposit(10.00)
    assertEquals(balanceAfterDeposit, 19.00)
  }

  test ("Make a withdraw") {
    val account = CheckingAccount(10.00)
    assertEquals(account.currentBalance, 10.00)

    val balanceAfterWithdraw = account.withdraw(8.00)
    assertEquals(balanceAfterWithdraw, 1.00)
  }