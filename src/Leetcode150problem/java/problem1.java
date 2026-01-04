package Leetcode150problem.java;
import java.util.*;
public class problem1 {
	class Solution {
	    public int[] twoSum(int[] nums, int target){
	    	
	        // BRUTE FORCE APPROACH Time complexity=O(n^2) and Space complexity= O(1)

	         int n=nums.length;
	         for(int i=0;i<n;i++){
	             for (int j=i+1; j<n; j++ ){
	                 if (nums[i]+nums[j]==target){
	                     return new int[]{i,j};

	                 }
	             }
	         }
	         return new int []{};

	        // HASHMAP Time complexity=O(n) and space complexity O(n)
	         
	        int n=nums.length;
	        HashMap<Integer, Integer>map=new HashMap<>();

	        for (int i=0;i<n;i++){
	            int find=target-nums[i];
	            
	            if(map.containsKey(find)){
	                return new int[]{map.get(find),i};
	            }
	            map.put(nums[i],i);
	        }
	        return new int []{};


	        
	}
	}


}
