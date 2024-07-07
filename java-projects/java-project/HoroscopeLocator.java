package javaProjects;

import java.util.Scanner;

public class HoroscopeLocator {

	public static void main(String[] args) {
	
		Scanner k = new Scanner(System.in);
		
		int month, day;
		String horscope ="";
		boolean isError = false; 
		
		System.out.println("Doğduğunuz ay : ");
		month =k.nextInt();
		
		System.out.println("Doğduğunuz gün : ");
		day =k.nextInt();
	

		
		switch(month) {
	case 1: 
		if(day >= 1 && day<=31 ) {
			
			
			
		if(day < 22) {
			horscope = "Oğlak";
		
		
	} else {
		
		horscope = "Kova";
	}
		} else { 
			isError = true;
		}
		break;
		
		
	case 2:
		if(day >= 1 && day<=28 ) {
			
			if(day < 20) {
				horscope = "Kova";
			
		} else {
			horscope = "Balık";
		}
		}else {
			isError = true;
		}
		break;

	case 3:
		
	if(day >= 1 && day<=31) {
		
		if(day < 21) {
			horscope = "Balık";
		
	} else {
		horscope = "Koç";
	}
	
	}else {
		isError = true;
	}
		break;	
		

	
	default:
		isError= true;
		}
		if(isError) {
			
			System.out.println("Hatalı bir ay girdiniz, tekrar deneyiniz.");
		} else {
			System.out.println("Burcunuz : " + horscope);
		
}}}
