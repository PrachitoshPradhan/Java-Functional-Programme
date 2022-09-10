package com.functionalProgramme;
import java.util.Scanner;

public class DistinctTriplets {
	
	public static void main(String[] args) {
		System.out.println("Welcome To Triplets Program");
		Scanner scanner = new Scanner(System.in);
		// INPUT size of array
		int N = 0;
		System.out.print("Enter size of array : ");
		N = scanner.nextInt();
		System.out.println("You have to enter "+N+" numbers. ");
		// Array Creation
		int[] array = new int[N];
		// Read Values for array
		System.out.println("Enter values to array");
		for (int n = 0; n < N; n++) {
			System.out.print("Enter value for "+n+" : ");
			array[n] = scanner.nextInt();
		}
		System.out.print("You enterd array is ");
		// Show Values in Array
		for (int n = 0; n < N; n++) {
			System.out.print(array[n]+"\t");
		}
		System.out.println("");
		// Store Triplets
		int[][] triplets = new int[N*N*N][3];
		int tripletsCounter = 0;
		if (N < 3) {
			System.out.println("number of distinct tripltes is 0");
		} else {
			for (int i = 0; i < (N-2); i++) {
				for (int j = i+1; j < (N-1); j++) {
					for (int k = j+1; k < N; k++) {
						if ((array[i] + array[j] + array[k]) == 0) {
							triplets[tripletsCounter][0] = i;
							triplets[tripletsCounter][1] = j;
							triplets[tripletsCounter][2] = k;
							tripletsCounter++;
						}
					}
				}
			}
		}
		// Show Triplets
		System.out.println("number of distinct tripltes are "+tripletsCounter);
		for ( int i = 0; i < tripletsCounter; i++) {
			System.out.println("triplets indexes are "+triplets[i][0]+", "+triplets[i][1]+", "+triplets[i][2]+" and triplets values are "+array[triplets[i][0]]+", "+array[triplets[i][1]]+", "+array[triplets[i][2]]);
		}
		scanner.close();
	}

}




