package org.codecraftlabs.chapter8

class SavingsAccountSuite extends munit.FunSuite:
  test("Create simple savings account") {
    val account = SavingsAccount(0.00)
    assertEquals(account.currentBalance, 0.00)
  }

  test ("Make free deposits") {
    val account = SavingsAccount(10.00)
    assertEquals(account.currentBalance, 10.00)

    val balanceAfterDeposit = account.deposit(1.00)
    assertEquals(balanceAfterDeposit, 11.00)
  }

  test("Make charged deposit") {
    val account = SavingsAccount(10.00)
    assertEquals(account.currentBalance, 10.00)

    val balanceAfterDeposit1 = account.deposit(1.00)
    assertEquals(balanceAfterDeposit1, 11.00)

    val balanceAfterDeposit2 = account.deposit(1.00)
    assertEquals(balanceAfterDeposit2, 12.00)

    val balanceAfterDeposit3 = account.deposit(1.00)
    assertEquals(balanceAfterDeposit3, 13.00)

    val balanceAfterDeposit4 = account.deposit(2.00)
    assertEquals(balanceAfterDeposit4, 14.00)
  }

  test("Apply monthly interest") {
    val account = SavingsAccount(10.00)
    assertEquals(account.currentBalance, 10.00)

    val balanceAfterDeposit1 = account.deposit(1.00)
    assertEquals(balanceAfterDeposit1, 11.00)

    val balanceAfterDeposit2 = account.deposit(1.00)
    assertEquals(balanceAfterDeposit2, 12.00)

    val balanceAfterDeposit3 = account.deposit(1.00)
    assertEquals(balanceAfterDeposit3, 13.00)

    val balanceAfterDeposit4 = account.deposit(1.00)
    assertEquals(balanceAfterDeposit4, 13.00)

    val updatedBalance = account.earnMonthlyInterest()
    assertEquals(updatedBalance, 14.30)

    val balanceAfterDeposit5 = account.deposit(1.00)
    assertEquals(balanceAfterDeposit5, 15.30)
  }
