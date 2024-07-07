package javaProjects;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		  System.out.print("n1 sayısını giriniz : ");
          int n1 = k.nextInt();
	
          System.out.print("n2 sayısını giriniz : ");
          int n2 = k.nextInt();
	int ebob;
	
	for(int i=1; i<= n1; i++) {
		if(n1 % i == 0 && n2 % i == 0) {
			System.out.println(i);
			ebob = i ;
		}
	}

	for(int j=n1; j>= 1 ; j--) {
		if(n1 % j == 0 && n2 % j == 0) {
		
			ebob =  j ;
	break;
	
	}

}}}
