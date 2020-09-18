package Searching;

public class findFirstAndLast {
	public static void findFirstAndLast(int arr[], int x) 
    { 
        int n = arr.length; 
        int first = -1, last = -1; 
        for (int i = 0; i < n; i++) { 
            if (x != arr[i]) 
                continue; 
            if (first == -1) 
                first = i; 
            	System.out.println(first);
            last = i; 
            System.out.println(first);
        } 
        if (first != -1) { 
            System.out.println("First Occurrence = " + first); 
            System.out.println("Last Occurrence = " + last); 
        } 
        else
            System.out.println("Not Found"); 
    } 
	
	
	public static int first(int arr[], int low, int high, int x, int n) {
		if (high > low) {
			int mid = low + (high - low)/2;
			if (mid == 0 || x > arr[mid-1] && arr[mid] == x) {
				return mid;
			}
			else if (x < arr[mid]) 
                return last(arr, low, (mid - 1), x, n); 
            else
                return last(arr, (mid + 1), high, x, n);
			
		}
		return -1;
	}
	
	public static int last(int arr[], int low, int high, int x, int n) 
    { 
        if (high >= low) { 
            int mid = low + (high - low) / 2; 
            if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x) 
                return mid; 
            else if (x < arr[mid]) 
                return last(arr, low, (mid - 1), x, n); 
            else
                return last(arr, (mid + 1), high, x, n); 
        } 
        return -1; 
    } 
  
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 }; 
        int x = 8; 
        findFirstAndLast(arr, x); 
    } 
}
