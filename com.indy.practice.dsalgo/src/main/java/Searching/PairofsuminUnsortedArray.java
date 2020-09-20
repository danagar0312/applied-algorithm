package Searching;

import java.util.HashSet;

public class PairofsuminUnsortedArray {
	
	static void printpairs(int[]A, int sum) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			int temp = sum - A[i];
			if(hs.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + A[i] + ", " + temp + ")"); 
			}
			hs.add(i);
		}
	}

	public static void main(String[] args) 
	{ 
		int A[] = { 1, 4, 45, 6, 10, 8 }; 
		int n = 16; 
		printpairs(A, n); 
	} 
	
}
