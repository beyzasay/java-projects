package javaProjects;

import java.util.Scanner;

public class ExponentialNumberCalculation {

	public static void main(String[] args) {
Scanner k = new Scanner(System.in);

int z,n;

System.out.println("Tabanı giriniz :");
z =k.nextInt();

System.out.println("Üs giriniz : ");
n =k.nextInt();

int  result = 1;
for(int i=1; i<= n; i++) {
result *= z ;
	}

/* int i;
while( i<= k) {
	total *=n;
	i++ */

	System.out.println(z + "^" + n + "= " + result);
}
}