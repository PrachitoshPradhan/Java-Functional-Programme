package com.functionalProgramme;
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Quadratic function roots solving programme.");
		
		System.out.println("Enter the value of A in quadratic function: ");
		double A = sc.nextDouble();
		System.out.println("Enter the value of B in quadratic function: ");
		double B = sc.nextDouble();
		System.out.println("Enter the value of C in quadratic function: ");
		double C = sc.nextDouble();
		
		System.out.println("The function is "+A+"x^2 + "+B+"x + "+C);
		
		//Delta value calculation
		double delta = Math.pow(B, 2)-(4*A*C);
	
		//Roots X1 and X2 of the equation calculation
		double X1 = (-B + Math.sqrt(delta))/(2*A);
		double X2 = (-B - Math.sqrt(delta))/(2*A);
        
		System.out.println("Root 1 of the function , X1 = "+X1);
		System.out.println("Root 2 of the function , X2 = "+X2);
		
		sc.close();
	}

}
