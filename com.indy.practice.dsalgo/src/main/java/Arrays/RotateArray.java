package Arrays;

public class RotateArray {
	
	
	static void leftRotate(int[] arr, int d) {
		if(d == 0) {
			return;
		}
		int n = arr.length;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
		
	}
	
	public static void reverseArray(int[] arr, int l, int r) {
		while(r > l) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
	
	
	 static void printArray(int arr[]) 
	    { 
	        for (int i = 0; i < arr.length; i++) 
	            System.out.print(arr[i] + " "); 
	    } 
	  
	    /* Driver program to test above functions */
	    public static void main(String[] args) 
	    { 
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
	        int n = arr.length; 
	        int d = 2; 
	  
	        // in case the rotating factor is 
	        // greater than array length 
	        d = d % n; 
	        leftRotate(arr, d); // Rotate array by d 
	        printArray(arr); 
	    } 
}
;