package org.codecraftlabs.chapter5

class BankAccountSuite extends munit.FunSuite {
  test("Deposit BankAccount") {
    val bankAccount = BankAccount()
    assertEquals(bankAccount.deposit(2.00), 2.00)
  }

  test("Withdraw BankAccount") {
    val bankAccount = BankAccount(2)
    assertEquals(bankAccount.withdraw(1.00), 1.00)
  }
}
