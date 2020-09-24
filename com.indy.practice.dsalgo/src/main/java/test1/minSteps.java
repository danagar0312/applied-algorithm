package test1;

import java.util.Arrays;
import java.util.Collections;

public class minSteps {

	// q1 - Minimum number of steps 
	
	
	    public static void main(String[] args) {
	        System.out.println(step(new Integer[]{5,2,1}));
	        System.out.println(step(new Integer[]{4,5,5,4,2}));
	    }
	    
	    public static int step(Integer[] input){
	        if(input == null || input.length == 0){
	            return 0;
	        }
	        
	        int steps = 0;
	        Arrays.sort(input, Collections.reverseOrder());
	        
	        for( int i=1; i<input.length; i++){
	            if(input[i] < input[i-1]){
	                steps += i;
	            }
	        }
	        return steps;
	    }
	    
	 // q2 - Activity selection problem 
	    
	    /**
	     * import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class ActivitySelection 
{ 
    // Prints a maximum set of activities that can be done by a single 
    // person, one at a time. 
    //  n   -->  Total number of activities 
    //  s[] -->  An array that contains start time of all activities 
    //  f[] -->  An array that contains finish time of all activities 
    public static void printMaxActivities(int s[], int f[], int n) 
    { 
    int i, j; 
       
    System.out.print("Following activities are selected : n"); 
       
    // The first activity always gets selected 
    i = 0; 
    System.out.print(i+" "); 
       
    // Consider rest of the activities 
    for (j = 1; j < n; j++) 
    { 
         // If this activity has start time greater than or 
         // equal to the finish time of previously selected 
         // activity, then select it 
         if (s[j] >= f[i]) 
         { 
              System.out.print(j+" "); 
              i = j; 
          } 
     } 
    } 
       
    // driver program to test above function 
    public static void main(String[] args) 
    { 
    int s[] =  {1, 3, 0, 5, 8, 5}; 
    int f[] =  {2, 4, 6, 7, 9, 9}; 
    int n = s.length; 
         
    printMaxActivities(s, f, n); 
    } 
      
} 
	     */
	}
	
	

