
public class BalanceInsufficentException extends Exception {
String message;

	public BalanceInsuffficentException(String message) {
		
		this.message = message;
	
	}
@Override
	public String getMessage() {
		return this.message;
	}
}
