package javaProjects;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);

		int math, physic, chemistry, turkish, history, music;

		System.out.println("Your math grade :" );
		math = k.nextInt();

		System.out.println("Your physics grade " );
		physic = k.nextInt();

		System.out.println("Your chemistry grad :");
		chemistry = k.nextInt();

		System.out.println("Your Turkish note :" );
		turkish = k.nextInt();

		System.out.println("Your history note :"  );
		history = k.nextInt();

		System.out.println("Your music note :" );
		music = k.nextInt();

		int toplam = ( math + chemistry + history + physic + turkish + music );
		double sonuc = toplam / 6.0 ;
		
		System.out.println("Not ortalamanız: " + sonuc);
		
		if (sonuc > 60) {
			System.out.println("Sınıfı geçti");
		} else if
			(sonuc < 60 ) {
			
			System.out.println("Sınıfta kaldı");
			
		}
		
		

	}

}
