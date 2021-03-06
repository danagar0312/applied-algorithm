package Arrays;

public class RotateArrayWithMaximumSun {
	
	
	static int arr[] = new int[]{10, 1, 2, 3}; 
	
	static int maxSum() {
		int arrSum = 0;
		int currentVal = 0;
		for (int i = 0; i < arr.length ; i++) {
			arrSum = arrSum + arr[i];
			currentVal = currentVal + (i * arr[i]);
		}
		
		int maxVal = currentVal;
		System.out.println(maxVal);
		System.out.println(arrSum);
		for (int j = 1; j < arr.length ; j++) {
			currentVal = currentVal  + arrSum - arr.length*arr[arr.length - j];
			if (currentVal > maxVal) {
				maxVal = currentVal;
			}
		}
		return maxVal;
	}
	
	public static void main(String[] args)  
	    { 
	        System.out.println("Max sum is " + maxSum()); 
	    } 
}
