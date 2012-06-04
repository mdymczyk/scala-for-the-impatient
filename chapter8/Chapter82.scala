// Exercise 2
class BankAccount(initialBalance : Double) {
   protected var balance = initialBalance
   def deposit(amount : Double) = { balance += amount; balance}
   def withdraw(amount : Double) = { balance -= amount; balance}
}

class SavingsAccount(initialBalance : Double) extends BankAccount(initialBalance) {
   private var freeTransactions = 3
   def earnMonthlyInterest() { super.deposit(balance * 1.3); freeTransactions = 3; }
   
   override def deposit(amount : Double) = { 
      if(freeTransactions > 0) {
	 freeTransactions -= 1;
	 super.deposit(amount)
      } else {
	 super.deposit(amount-1)
      }
   }
   
   override def withdraw(amount : Double) = { 
      if(freeTransactions > 0) {
         freeTransactions -= 1;
	 super.withdraw(amount) 
      } else {
	 super.withdraw(amount+1)
      }
   }
}

