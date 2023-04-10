package org.codecraftlabs.chapter8

class BankAccountSuite extends munit.FunSuite:
  test("Withdraw money") {
    val bankAccount = new BankAccount(0.00)
    assertEquals(bankAccount.currentBalance, 0.00)
  }
