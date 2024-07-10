package inheritance;

public class CustomerManager {
 public void add(Customer customer) {
	 System.out.println(customer.customerNumber + " kaydedildi.");
 }
 
//bulk insert
 public void addMultiple(Customer [] customers) {// customer array oluşturduk
	 
	 for(Customer customer : customers) {// gönderdiğin her müşteriyitek tek dolaşacak
		 add(customer);    // ve her müşteri için yukarıdaki add i çalıştır.
		 
	 }
	 
	 
 }
 
 
 
}
