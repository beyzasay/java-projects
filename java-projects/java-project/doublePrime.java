package javaProjects;

import java.util.Scanner;

public class doublePrime {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		 int n;

	        System.out.print("Bir sayı giriniz: ");
	        n = k.nextInt();

	        System.out.println("4'ün kuvvetleri:");
	        int powerOfFour = 1;
	        while (powerOfFour <= n) {
	            System.out.println(powerOfFour);
	            powerOfFour *= 4;
	        }

	        System.out.println("5'in kuvvetleri:");
	        int powerOfFive = 1;
	        while (powerOfFive <= n) {
	            System.out.println(powerOfFive);
	            powerOfFive *= 5;
	        }

	        k.close();
	    }
	}