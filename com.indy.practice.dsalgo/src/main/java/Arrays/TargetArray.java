package Arrays;

import java.util.Arrays;

public class TargetArray {
	public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        Arrays.fill(target,-1);
        int n = nums.length;
        for (int i = 0 ; i < n ; i++){
            int ind = index[i];
            if (target[ind] == -1){
                target[ind] = nums[i]; 
            }
            else{
                for(int j=target.length-1; j>ind;j--)
                {
                    target[j]=target[j-1];
                }
                target[ind]=nums[i];
            }
        }
        return target;
    }
}
