package javaProjects;

import java.util.Scanner;

public class oddnumbers {
public static void main(String [] args) {

	Scanner k = new Scanner(System.in);

int a;
int total= 0;

while(true) {
	
	System.out.print("Sayı giriniz :");
	a = k.nextInt();
	
	if( a % 2 == 1) {	
		break; 
		
	}
if (a % 2 == 0 && a % 4== 0) {
	total += a;
}
   }

 
   System.out.println("Toplam : " + total);

}
}

