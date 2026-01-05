package Leetcode150problem.java;

public class problem125 {
	class Solution {
	    public boolean isPalindrome(String s) {
	    	
	    	// Two pointer approach Time complexity=O(n)  and Space complexity=O(n)
	        s=s.toLowerCase();
	        s=s.replaceAll("[^a-z0-9]","");
	        int left=0;
	        int right=s.length()-1;
	        while(left<right){
	            if(s.charAt(left)!=s.charAt(right)){
	                return false;
	            }
	            left++;
	            right--;
	            
	        }
	        return true;
	    }
	}  

}
