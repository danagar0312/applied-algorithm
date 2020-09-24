package Sorting;

public class SortElementsTwoTypes {
	
	// naive approach
	void sort(int[] arr, int n) {
		int[] temp = new int[arr.length];
		int i;
		
		for(i = 0 ; i < arr.length ; i++) {
			if (arr[i] < 0) {
				temp[i] = arr[i];
			}
		}
		
		for (int j = 0; j < n; j++) {
			if (arr[j] > 0) {
				temp[i] = arr[j];
				i++;
			}
		}
	}
	
	// hoare approach 
	
static int partition(int[] arr, int low,int high) {
		
		
		int i = low - 1;
		int j = high + 1;
		while(true) 
		{
			do{
				i++;
			} while(arr[i] < 0);
			
			do {
				j--;
			} while(arr[j] > 0);
			
			if (i ==j) {
				return j;
			}
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
	}
}
