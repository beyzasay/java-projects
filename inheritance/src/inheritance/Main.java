package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber ="12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
	hepsiBurada.customerNumber ="78910";
	
	
	SendikaCustomer abc = new SendikaCustomer();
	abc.customerNumber ="9999";
	
	
	CustomerManager customerManager = new CustomerManager();
	//customerManager.add(hepsiBurada);
	//customerManager.add(engin);
	//customerManager.add(abc);
	
	Customer[] customers = {engin, abc, hepsiBurada };
	
	customerManager.addMultiple(customers); // polimorfizm
	
	}

}
 //classlar supersınıflar onu extend eden sınıfların referansını tutabilir.
// bu da sürdürebilirliği sağlar
// SOLID  O -  Open Clossed Principle
// bu özellik sisteme yeni özellik eklendiğinde mevcuttaki
//hicbir kodu değiştireemesin sadece yeni kod eklersin