package com.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TwoSum {
	
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
        	if(map.containsKey(target - nums[i])) {
        		result[0] = map.get(target - nums[i]);
        		result[1] = i;
        		System.out.println(Arrays.toString(result));
        		return result;
        	}
        	map.put(nums[i], i);
        }
        return result;
    }
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] nums = new int[n];
    	for(int i = 0; i < n; i++) {
    		System.out.println("Enter array "+i+":");
    		nums[i] = in.nextInt();
    	}
    	int target = in.nextInt();
    	twoSum(nums, target);
    }
}