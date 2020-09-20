package Searching;

public class squareroot {
	static int sqrroot(int x) {
		int low = 1, high = x, ans = -1;
		while(low < high) {
			int mid = (high + low)/2;
			int midsqr = mid * mid;
			if (x ==  midsqr){
				return mid;
			}
			else if (midsqr > x) {
				high = mid -1;
			}
			else{
				low = mid + 1;
				ans = mid;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int x = 11; 
        System.out.println(sqrroot(x)); 
	}
}
