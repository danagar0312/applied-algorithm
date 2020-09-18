package Searching;

public class CountOnes {
	int countOnes(int[] arr, int l, int r) {
		int n = arr.length;
		if(r >= l) {
			int mid = l + (r-l)/2;
			
			if (arr[mid] == 0) {
				return countOnes(arr,mid+1,r);
			}
			else {
				if(mid == 1 || arr[mid-1] == 0) {
					return (n-mid);
				}
				else
					return countOnes(arr,l,mid-1);
			}
		}
		return 0;
	}
	
	public static void main(String args[]) 
    { 
       CountOnes ob = new CountOnes(); 
       int arr[] = {0,1,1,1,1, 1}; 
       int n = arr.length; 
       System.out.println("Count of 1's in given array is " + 
                           ob.countOnes(arr, 0, n-1) ); 
    }
}
 