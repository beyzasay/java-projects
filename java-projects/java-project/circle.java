package javaProjects;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
        int r ;
        double alan, cevre,dilim, a, pi = 3.14 ;
       
        System.out.println("Dairenin yarıçapını giriniz : ");
        r = k.nextInt();
	
        alan = pi * r *r;
        cevre = 2* pi * r;
       
       
	
	System.out.println("Alanı :" + alan);
	System.out.println("Çevre :" + cevre);

	 System.out.println("Açı değeri giriniz: ");
     a =k.nextInt();
     
     dilim = (pi * (r*r) * a) / 360 ;
     
	
	
	System.out.println("Daire dilimimin alanı :" + dilim);
	}

}
