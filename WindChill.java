package com.functionalProgramme;
import java.util.Scanner;

public class WindChill {public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
	System.out.println("Welcome to Wind Chill Programme.");
	
	System.out.println("Enter the temperature in Fahrenheit, t= ");
	double t = sc.nextDouble();
	System.out.println("Enter the Wind Speed in Miles per Hour, v= ");
	double v = sc.nextDouble();
	
	if (t<50 && v<120 && v>3)
	{
		double w = 35.74 + (0.6215*t) + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		System.out.println("The WindChill , w = "+w);
	}
	else
	{
		System.out.println("Temprature t should be less than 50 and wind speed v should be in between 3 and 120");
	}
	sc.close();
}

}
