package com.star.l1464;

import java.util.Arrays;

/**
 * @author star
 * @Date 2020/6/14.
 * @Description: No Description Yet.
 */
public class Solution {
  public int maxProduct(int[] nums) {
    if (nums.length == 0 ) return 0;
    Arrays.sort(nums);
    return nums[nums.length - 1] * nums[nums.length-2];
  }
}
