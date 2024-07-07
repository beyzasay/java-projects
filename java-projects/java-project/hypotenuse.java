package javaProjects;

import java.util.Scanner;

public class hypotenuse {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		 int a, b  ;
		 double c, cevre, alan;
		 
		 
		System.out.println("1. enter the edge:");
		a = k.nextInt();
		
		System.out.println("2. enter the edge: ");
		b= k.nextInt();
		c=Math.sqrt(a*a + b*b);
		 
	cevre = (a+b+c);
	alan= (a*b) / 2;

	System.out.println("Hypotenuse : " + c);
		 System.out.println("Periphery : " + cevre);
		 System.out.println(alan );

	}

}
