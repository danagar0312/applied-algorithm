package Searching;

public class posElementininfinitearray {
	
	static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r>=l) 
        { 
            int mid = l + (r - l)/2; 
            if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid-1, x); 
            return binarySearch(arr, mid+1, r, x); 
        } 
        return -1; 
    } 
	
	static int findPos(int[] arr, int key) {
		
		int l=0, r = 1;
		int val = arr[r];
		while (val < key) {
			l = r;
			if (2*r < arr.length -1) {
				r = 2 * r;
			}
			else {
				r = arr.length - 1;
			}
			val = arr[r];
			
		}
		return binarySearch(arr, l, r, key); 
	}
	
	public static void main(String[] args)  
    { 
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,  
                            100, 130, 140, 160, 170}; 
        int ans = findPos(arr,10); 
          
        if (ans==-1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element found at index " + ans); 
    } 
}
