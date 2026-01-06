package Leetcode150problem.java;

import java.util.Arrays;

public class problem242 {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	    	if (s.length()!=t.length()) {
	    		return false;
	    	}
	    	char[]sArr= s.toCharArray();
	    	char[]tArr= t.toCharArray();
	    	
	    	Arrays.sort(sArr);
	    	Arrays.sort(tArr);
	    	
	    	return Arrays.equals(sArr,tArr);
	    }
	}
}



