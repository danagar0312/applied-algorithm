package Sorting;

public class sortthreeelementsinarray012 {

	static void sort012(int[] arr, int arr_size) {
		int lo = 0;
		int mid = 0, high = arr.length - 1;
		int temp = 0;
		while(mid <= high) {
			switch(arr[mid]) {
			case 0:{
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = arr[lo];
				mid++;
				lo++;
				break;
			}
			case 1:{
				mid++;
				break;
			}
			case 2:{
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
				break;
			}
		}
		}
	}
	
	
	
	
	static void printArray(int arr[], int arr_size) 
    { 
        int i; 
        for (i = 0; i < arr_size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
  
    /*Driver function to check for above functions*/
    public static void main(String[] args) 
    { 
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        int arr_size = arr.length; 
        sort012(arr, arr_size); 
        System.out.println("Array after seggregation "); 
        printArray(arr, arr_size); 
    } 
}
 