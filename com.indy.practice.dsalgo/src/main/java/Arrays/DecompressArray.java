package Arrays;

import java.util.Arrays;

public class DecompressArray {
	 public int[] decompressRLElist(int[] nums) {
	        int len = 0;
	        for (int i = 0 ; i < nums.length ; i=i+2){
	            len = len + nums[i];
	        }
            int temp = 0;
            int[] res = new int[len];
	        for (int i = 0 ; i < nums.length/2 ; i++){
	            int freq = nums[2*i];
	            int value = nums[2*i + 1];
	            temp = temp + freq;
	            while(freq > 0){
	                res[temp-freq] = value;
	                freq--;
	                System.out.println(Arrays.toString(res));
	            }   
	        }
	        return res;
	    }
	 
	 public static void main(String args[]) {
		 	DecompressArray snmt = new DecompressArray();
			int[] a = {1,2,3,4};
			snmt.decompressRLElist(a);
		}
}
