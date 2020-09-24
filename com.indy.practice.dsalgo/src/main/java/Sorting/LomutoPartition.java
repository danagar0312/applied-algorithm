package Sorting;

public class LomutoPartition {
	
	static void Swap(int[] array,  
            int position1,  
            int position2) 
			{ 
			int temp = array[position1];  
			array[position1] = array[position2];  
			array[position2] = temp;  
			} 

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] <= pivot) {
				i++;
				Swap(arr, i , j);
			}
		}
		Swap(arr, i + 1, high);
		return (i+1);
	}
}
