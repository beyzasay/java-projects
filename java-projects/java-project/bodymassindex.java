package javaProjects;

import java.util.Scanner;

public class bodymassindex {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
      
		double weight, height, index ;
           
        
        System.out.println("Lütfen boyunuzu(m) giriniz:" );
        height =k.nextDouble() ;
          
        System.out.println("Lütfen kilonuzu giriniz: " );
        weight = k.nextDouble();
		
		
		index = weight / (height * height) ;
		
	System.out.println("Vücut kitle indeksiniz :" + index);
	
	}

}
