package javaProjects;

import java.util.Scanner;

public class kdvCalculation {

	public static void main(String[] args) {

		double tutar, kdvOran, kdvTutar, kdvliTutar;
		Scanner input = new Scanner(System.in);

		System.out.print("Ücret Tutarını Giriniz : ");
		tutar = input.nextDouble();

		if (tutar > 0 && tutar <= 1000) {
			kdvOran = 0.18;
			} else if (tutar > 1000) {
			kdvOran = 0.08;
		} else {
			System.out.println("Geçersiz tutar girdiniz.");
			return;

		}

		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;

		System.out.println("KDV'siz Tutar : " + tutar);
		System.out.println("KDV Tutarı : " + kdvTutar);
		System.out.println("kdvliTutar : " + kdvliTutar);
	}

}
//kdv oran  ½18 al