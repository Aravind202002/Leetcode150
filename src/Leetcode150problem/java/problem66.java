package Leetcode150problem.java;

public class problem66 {
	class Solution {
	    public int[] plusOne(int[] digits) {
	    	
	    	//Carry Propagation  Time complexity=O(n) and Space complexity=O(1) when digits <9 and if digits >9 O(n)
	    	
	        for (int i=digits.length-1; i>=0 ;i--){
	            if(digits[i]<9){
	                digits[i]++;
	                return digits;
	            }
	            digits[i]=0;
	        }
	        int result[]=new int[digits.length+1];
	        result[0]=1;

	        return result;


	    }
	    }

}
