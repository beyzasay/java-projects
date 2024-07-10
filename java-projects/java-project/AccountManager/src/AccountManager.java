
public class AccountManager {
private double balance;

public void deposit(double amount) {
	balance = getBalance() + amount;
	
}
public void withdraw(double amount) throws BalanceInsufficentExpection {
	
	
	if(balance>=amount) {
		balance = getBalance() - amount;
	} else {
		throw new BalanceInsufficentExpection("Bakiye  yetersiz");
		
		
		
	}
			
			
}
public double getBalance() {
	return balance;
}

}
