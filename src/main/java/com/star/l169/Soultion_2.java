package com.star.l169;

/**
 * @author star
 * @Date 2019/12/28.
 * @Description: No Description Yet.
 */
public class Soultion_2 {

  private int countInRange(int[] nums, int num, int lo, int hi){
    int count = 0;
    for (int i = 0; i <= hi; i++) {
      if (nums[i] == num) {
        count++;
      }
    }
    return count;
  }

  public int majorityElement(int[] nums) {
    return majorityElementc(nums, 0, nums.length - 1);
  }

  private int majorityElementc(int[] nums, int lo, int hi){
    if (lo == hi) return nums[lo];

    int mid = (hi - lo) / 2 + lo;
    int left = majorityElementc(nums, lo, mid);
    int right = majorityElementc(nums, mid + 1, hi);

    if (left == right) return left;

    int leftCount = countInRange(nums, left, lo, hi);
    int rightCount = countInRange(nums, right, lo, hi);
    return leftCount > rightCount ? left : right;
  }
}
