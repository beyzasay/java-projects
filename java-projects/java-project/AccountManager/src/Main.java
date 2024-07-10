
public class Main {

	public static void main(String[] args) {
AccountManager manager = new AccountManager ();
manager.deposit(0);

System.out.println("Hesap = " + manager.getBalance());
manager.deposit(100);
System.out.println("Hesap = " + manager.getBalance());
try {
	manager.withdraw(90);
} catch (BalanceInsuffficentException expection) {
	
	System.out.println(expection.getMessage());
	
}


System.out.println("Hesap = " + manager.getBalance());
try {
	manager.withdraw(20);
} catch (BalanceInsuffficentException  expection) {
	
	System.out.println(expection.getMessage());
	
}


System.out.println("Hesap = " + manager.getBalance());
	}

}
