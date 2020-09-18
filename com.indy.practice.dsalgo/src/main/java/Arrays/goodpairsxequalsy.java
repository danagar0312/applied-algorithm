package Arrays;

public class goodpairsxequalsy {
	 public int numIdenticalPairs(int[] nums) {
	        int count = 0;
	        int len = nums.length - 1;
	        for (int i = 0 ; i <= len ; i++){
	            for (int j = i+1 ; j <= len ; j++){
	                 if (nums[j] - nums[i] == 0){
	                        count++;
	                }
	            }
	           
	        }
	        return count;
	    }
}


/**

Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.


**/ 		