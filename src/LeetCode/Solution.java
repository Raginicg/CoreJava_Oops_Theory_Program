package LeetCode;

import java.util.HashMap;

class Solution {
////	Length of Last Word-------> Code 1

//	public int lengthOfLastWord(String s) {
//        s=s.trim();
//        int lastSpaceIndex= s.lastIndexOf(' ');
//        return s.length() - lastSpaceIndex - 1;
//    }
//    public static void main(String[] args) {
//	System.out.println("Length of Last Word");	
//	}

	/*
	 * Two Sum----> Code 2 Input: nums = [2,7,11,15], target = 9 Output: [0,1]
	 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. Example 2:
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
	 * 
	 * Input: nums = [3,3], target = 6 Output: [0,1]
	 * 
	 */

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}

		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums1 = { 2, 7, 11, 15 };
		int target1 = 9;
		int[] result1 = twoSum(nums1, target1);
		System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");

		int[] nums2 = { 3, 2, 4 };
		int target2 = 6;
		int[] result2 = twoSum(nums2, target2);
		System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");

		int[] nums3 = { 3, 3 };
		int target3 = 6;
		int[] result3 = twoSum(nums3, target3);
		System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
	}

}
