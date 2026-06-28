
public class Account {
	private double balance;
	private double overdraft;

	public Account() {
		
	}
	
	public Account(double balance) {
		this.balance = balance;
		overdraft = 10000;
	}
	
	public void deposit(double amount) {
		overdraft += amount;
		if(overdraft > 10000) {
			balance += overdraft - 10000;
			overdraft = 10000;
		}
	}
	
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance +overdraft)) {
			
			balance -= amount;
			if(balance <0) {
				overdraft += balance;
				balance=0;
			}
		}else {
			throw new BalanceException("Not have sufficient balance");
		}
	}
	
	 @Override
	 public String toString() {
	      return "Account [balance=" + balance + ", overdraft=" + overdraft + "]";
	 }

}
