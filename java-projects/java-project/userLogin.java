package javaProjects;

import java.util.Scanner;

public class userLogin {

	public static void main(String[] args) {
		Scanner k =  new Scanner ( System.in);
	String username , password, newpassword, cevap ;
	
	System.out.println("Kullanıcı Adı : " );
	username = k.nextLine();
	
	System.out.println("Şifre : " );
	
	System.out.println("Doğrulamak için tekrar şifre giriniz: " );
	password = k.nextLine();
	
	if (username.equals("patika") && password.equals("123")) {
		System.out.println("Giriş yapıldı ");
	}else {
		
		System.out.println("Yanlış şifre. Sıfırlamak ister misiniz ? Evet / Hayır : ");
			cevap= k.nextLine(); 
	
			
			if(cevap.equalsIgnoreCase("Evet")) {
				System.out.println("Yeni şifrenizi giriniz: ");
				newpassword = k.nextLine();
				
				if(newpassword.equals(password)) {
					System.out.println("Şifre oluşturulmadı, Lütfen başka şifre giriniz : ");
				}else {
					System.out.println("Şifre oluşturuldu.");
				}
			}else 	{
		System.out.println("Şifre sıfırlama iptal edildi.");
		
		}
		
	}}
}
