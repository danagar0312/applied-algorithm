package College;

public class correctplaceelements {
	int binarySearch(int[] arr, int l, int r) {
		
		if(r >= l) {
			int mid = l + (r-l)/2;
			System.out.println("mid " + mid);
			if (arr[mid] == mid) {
				return arr[mid];
			}
			else if (arr[mid] > mid) {
				return binarySearch(arr, l,mid-1);
			}
			return binarySearch(arr,mid+1,r);
			
		}
		return -1;
	}
	
	
	public static void main(String args[]) 
    { 
		correctplaceelements ob = new correctplaceelements(); 
        int arr[] = { 2, 2, 2, 10, 40 }; 
        int n = arr.length;  
        System.out.println(n);
        System.out.println(ob.binarySearch(arr, 0, n - 1)); 
}
}
