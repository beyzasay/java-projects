package javaProjects;

import java.util.Scanner;

public class SumOfDigit {
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

  

        int sum = 0;

        // Sayının her basamağını topla
        for (; number != 0; number /= 10) {
            int digit = number % 10; // Son basamağı al
            sum += digit;            // Toplama ekle
        }

        System.out.println("Girilen sayının basamakları toplamı: " + sum);
	}}