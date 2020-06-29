package com.star.l0268;

/**
 * @author star
 * @Date 2020/6/27.
 * @Description: No Description Yet.
 */
public class Solution {
  public int missingNumber(int[] nums) {
    int sum = 0;
    for (int num:nums) {
      sum += num;
    }

    int length = nums.length;
    int sum2 = (int)((length/2.0) * (length+1));
    return sum2 - sum;
  }

  public static void main(String[] args) {
    System.out.println(new Solution().missingNumber(new int[]{0,1,3}));
  }
}
