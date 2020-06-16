package com.star.l0053;

/**
 * @author star
 * @Date 2020/6/13.
 * @Description: No Description Yet.
 */
public class Solution {
  public int maxSubArray(int[] nums) {
    if (nums.length == 0) return 0;
    int[] ans = new int[nums.length];
    int max = nums[0];
    for(int index = 0; index < nums.length; index++){
      if (index == 0) {
        ans[index] = nums[index];
        continue;
      }
      ans[index] = nums[index] + ans[index - 1] > nums[index] ? nums[index] + ans[index - 1]:nums[index];
      max = max > ans[index] ? max:ans[index];
    }

    return max;
  }
}
