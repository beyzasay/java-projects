package javaProjects;

import java.util.Scanner;

public class activitysuggestion {

	public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
		
		int heat ;
		
		System.out.println("Sıcaklık giriniiz:");
		heat =k.nextInt();
				
				if(heat<5) {
					System.out.println("Kayak yapabilirsiniz.");
				}else if ( heat <= 25 ) {
				if(heat<=15 ) {
					System.out.println("Sinemaya gdebilirsiniz");
				
				}
			if(heat >= 10) {
				System.out.println("Pikniğe gidebilirsiniz");
			} 
	} else {
		System.out.println("Yüzmeye gidebilirsiniz.");
	}

}}

