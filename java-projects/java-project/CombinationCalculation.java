package javaProjects;

import java.util.Scanner;

public class CombinationCalculation {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("n sayısını giriniz: ");
		        int n = scanner.nextInt();

		        System.out.print("r sayısını giriniz: ");
		        int r = scanner.nextInt();

		        scanner.close();

		        // n'in r'li kombinasyonunu hesapla: C(n, r) = n! / (r! * (n - r)!)
		        int nFactorial = factorial(n);
		        int rFactorial = factorial(r);
		        int nMinusRFactorial = factorial(n - r);

		        int combination = nFactorial / (rFactorial * nMinusRFactorial);

		        System.out.println("C(" + n + ", " + r + ") = " + combination);
		    }

		    // Faktöriyel hesaplama metodu
		    public static int factorial(int number) {
		        if (number == 0 || number == 1) {
		            return 1;
		        }
		        int fact = 1;
		        for (int i = 2; i <= number; i++) {
		            fact *= i;
		        }
		        return fact;
		    
		
	}

}
