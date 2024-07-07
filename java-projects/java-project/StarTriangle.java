package javaProjects;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int n = k.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int a =1; a <= (n-i); a++) {
				System.out.println(" ");
			}
		for(int j=1; j<= (2*i)- 1 ; j++) {
			System.out.println("*");
		}
		System.out.println();
		}

	}

}
