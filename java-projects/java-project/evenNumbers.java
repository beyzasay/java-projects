package javaProjects;

import java.util.Scanner;

public class evenNumbers {

	public static void main(String[] args) {
Scanner k = new Scanner (System.in);

int a;
int sum = 0 ;
int count = 0;

System.out.print("Sayı giriniz :");
a=k.nextInt();

for (int i=0; i<=a; i++) {
if(i % 3 == 0) {
	if(i % 4 == 0){
		  sum += i;
          count++;
          
		System.out.println("Sayı "+ i + " hem 3 hem de 4 bölünür");
}else {
	System.out.println("Sayı " + i + " 3 ve 4 e bölünmez ");

	if (count != 0) {
   
    System.out.println("0'dan " + a + " kadar olan sayılardan 3 ve 4'e tam bölünen sayı yok.");

      }
	
	}
}}}}