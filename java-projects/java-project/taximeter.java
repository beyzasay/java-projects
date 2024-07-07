package javaProjects;

import java.util.Scanner;

public class taximeter {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
	
		int km;
		double perkm = 2.20,total,  startPrice = 10 ;
		System.out.println("Km olarak giriniz :" );
        km = k.nextInt();
        
        total =  (km * perkm) ;
        total = startPrice ; 
        
        total = (total< 20) ? 20 : total;
      
        System.out.println("Toplam ücret : " + total);
        
	}

}
