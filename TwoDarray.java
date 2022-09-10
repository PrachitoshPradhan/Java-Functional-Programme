package com.functionalProgramme;
import java.util.Scanner;

public class TwoDarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the 2D Array programme.");
		
		System.out.println("Enter the no. of Rows , R = ");
		int R = sc.nextInt();
		System.out.println("Enter the no. of Coulumns , C = ");
		int C = sc.nextInt();
		
		System.out.println("You have entered a "+R+"*"+C+" matrix.");
		
		int[][] array = new int[R][C];
		for (int r=0;r<R;r++)
		{
			for (int c=0;c<C;c++)
			{
				System.out.println("Enter the values for ("+r+","+c+")");
				array [r][c] = sc.nextInt();
			}
		}
		
		for (int r=0;r<R;r++)
		{
			for (int c=0;c<C;c++)
			{
				System.out.print(array[r][c]);
			}
			System.out.println("");
		}
		sc.close();
		
		
	}

}
