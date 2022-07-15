package com.java.IntegerBased;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		
		Set<Integer> set = new HashSet<>();
		for(int i=0; i< nums.length; i++) {
			if(set.contains(nums[i])) {
				set.remove(nums[i]);
			} else {
				set.add(nums[i]);
			}
		}
		
		return set.iterator().next();
	} 
	
	public int singleNumberUsingXOR(int[] nums) {
		
		if(nums.length == 1) {
			return nums[0];
		}
		
		int ans = nums[0];
		
		for(int i=1; i< nums.length; i++) {
			ans ^= nums[i];
		}
		
		return ans;
	}
}
