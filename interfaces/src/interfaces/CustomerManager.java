package interfaces;

public class CustomerManager {
      
	private Logger [] loggers;
	
	
	
	public CustomerManager(Logger [] loggers) {
		this.loggers = loggers;
	}
	//loosyly- tightly coupled
	
	public void add (Customer customer) {
        	 System.out.println("Müşteri eklendi :" + customer.getFirstName());
  
        	
        	 Utils.RunLoggers(loggers, customer.getFirstName());
	
	}
        public void delete(Customer customer) {
       System.out.println("Müşteri silindi " + customer.getFirstName());
       //this.loggers.log(customer.getFirstName());  // burada databae file sms  hibir şey yok sadece interface bağlıyız
      
       Utils.RunLoggers(loggers, customer.getFirstName());
        }
}