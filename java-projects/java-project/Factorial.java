package javaProjects;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int  n ;	
	int total = 1;
		Scanner k = new Scanner(System.in);
		System.out.println("Faktöriyel sayısını giriniz: ");
	 n= k.nextInt();
		
		for(int j=1 ; j <=n ; j++) {
		
			total = total + 1;
			System.out.println(j + "Faktöriyel" + total);
		
	}
k.close();
}}
