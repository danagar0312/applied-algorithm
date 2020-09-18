package Searching;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab03Algo {
	
	static int lookupelement(ArrayList<Integer> ar1, int l , int r, int x) {
		
		if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (ar1.get(mid) == x) 
            	return mid+1; 

            else if (ar1.get(mid) > x) 
                return lookupelement(ar1, l, mid - 1, x); 
 
            return lookupelement(ar1, mid + 1, r, x); 
        } 
		
		return -1;
	}
	
	static void findElement(ArrayList<Integer> ar1, ArrayList<Integer> ar2, int n1, int n2) throws IOException {

		ArrayList<Integer> arrlist3 = new ArrayList<Integer>(n2);
		for(int i = 0 ; i < n2 ; i++) {
			
			arrlist3.add(lookupelement(ar1, 0 , n1, ar2.get(i)));
		}
		
//		for(Integer name:arrlist3) {
//            System.out.print(name);
//        }
		
		System.out.println(arrlist3.size());
//		
		FileWriter writer = new FileWriter("C:\\Users\\18126\\Downloads\\testout.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    
	    buffer.write(arrlist3.toString());  
	    
	    buffer.close();  
	    System.out.println("Success");  
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
//		Lab03Algo lago = new Lab03Algo();
		File file = new File("C:\\Users\\18126\\Downloads\\rosalind_bins (5).txt"); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
	
		String st;
		ArrayList<String> s1 = new ArrayList<String>();
		while ((st = br.readLine()) != null) {
			  s1.add(st);
			  }
		  int n1 = Integer.parseInt(s1.get(0));
		  int n2 = Integer.parseInt(s1.get(1));
		  int[] arr1 = new int[n1];
		  int[] arr2 = new int[n2];
		  String[] str1 = s1.get(2).split(" ");
//		  System.out.println(Arrays.toString(str1));
		  ArrayList<Integer> arrlist1 = new ArrayList<Integer>(n1);
		  ArrayList<Integer> arrlist2 = new ArrayList<Integer>(n2);
		  for (int i = 0; i < n1 ; i++) {
			  arrlist1.add(Integer.parseInt(str1[i]));
		  } 
		  
		  
		  String[] str2 = s1.get(3).split(" ");
		  for (int i = 0; i < n2 ; i++) {
			  arrlist2.add(Integer.parseInt(str2[i]));
		  }
		 
		  findElement(arrlist1,arrlist2,n1,n2);	  
		  br.close();
	}}





	


	
	


