package javaProjects;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 double a, b, c, u, alan;
	      
		
	        System.out.println("Enter the length of side a: ");
	        a = scanner.nextDouble();
	        
	        System.out.println("Enter the length of side b: ");
	        b = scanner.nextDouble();
	        
	        System.out.println("Enter the length of side c: ");
	        c = scanner.nextDouble();

	        // Calculate the semi-perimeter
	        u = (a + b + c) / 2;
	        
	        // Calculate the area using Heron's formula
	        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

	        System.out.println("The area of the triangle is: " + alan);
	    
	}

	}


