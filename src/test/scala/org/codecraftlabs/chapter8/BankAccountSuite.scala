package org.codecraftlabs.chapter8

class BankAccountSuite extends munit.FunSuite:
  test("Create initial account") {
    val bankAccount = BankAccount(0.00)
    assertEquals(bankAccount.currentBalance, 0.00)
  }

  test ("Deposit into account") {
    val account = BankAccount(0.00)
    assertEquals(account.currentBalance, 0.00)

    account.deposit(1.00)
    assertEquals(account.currentBalance, 1.00)
  }

  test("Withdraw from account") {
    val account = BankAccount(10.00)
    assertEquals(account.currentBalance, 10.00)

    account.withdraw(1.00)
    assertEquals(account.currentBalance, 9.00)
  }
