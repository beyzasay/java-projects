package javaProjects;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n1, n2, select;

		System.out.println("İlk sayıyı giriniz :");
		n1 = k.nextInt();

		System.out.println("İkinci sayıyı giriniz :");
		n2 = k.nextInt();

		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiminiz: ");
		select = k.nextInt();

		if (select == 1) {
			System.out.println("Toplam : " + (n1 + n2));
		} else if (select == 2) {

			System.out.println("Çıkarma : " + (n1 - n2));

		} else if (select == 3) {

			System.out.println("Çarpma : " + (n1 * n2));

		} else if (select == 4) {
			if (n2 != 0) {
				System.out.println("Bölme : " + (n1 / n2));
			} else {
				System.out.println("Bu sayı 0 'a bölünemez");
			}

			System.out.println("Bölme : " + (n1 / n2));
		} else {
			System.out.println("Yanlış seçim yapınız. Tekrar deneyiniz.");
		}

	}

}
