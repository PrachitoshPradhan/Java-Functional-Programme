package com.functionalProgramme;
import java.util.Scanner;
import java.lang.*;

public class Distance {
	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to distance calculator.");
		
		System.out.println("Enter the X coordinate of the point.");
		double x = sc.nextDouble();
		System.out.println("Enter the Y coordinate of the point.");
		double y = sc.nextDouble();
		
		System.out.println("the corrdinate entered is ("+x+","+y+")");
		double distance = Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2)); 
		
		System.out.println("the distance of the point from the origin is = "+ distance);
		sc.close();
	}

}
