package fourthWeek;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] ar1 = {1, 5, 3, 2, 4}; 
		double[] ar2 = {3.3, 2.2, 5.5, 1.1, 4.4};
		
		for (int n : ar1) { // Non-Ordered Elements
			System.out.print(n + "\t");
		}
		System.out.println();
		
		for (double d : ar2) {
			System.out.print(d + "\t");
		}
		System.out.println();
		System.out.println();
		
		Arrays.sort(ar1); // Sort. 별다른 조건이 없으면 ASC가 Default
		Arrays.sort(ar2);
		
		for (int n : ar1) { // Ordered Elements
			System.out.print(n + "\t");
		}
		System.out.println();
		
		for (double d : ar2) {
			System.out.print(d + "\t");
		}
		System.out.println();

	}

}
