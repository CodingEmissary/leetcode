package com.star.l27;

/**
 * @author star
 * @Date 2020/6/10.
 * @Description: No Description Yet.
 */
public class Solution {
  public int removeElement(int[] nums, int val) {
    int slow = 0;
    for (int fast = 0; fast < nums.length; fast++) {
      if (nums[fast] != val) nums[slow++] = nums[fast];
    }
    return slow;
  }

  public int s2(int[] nums, int val){
    int i = 0;
    int n = nums.length;
    while (i < n) {
      if (nums[i] == val) {
        nums[i] = nums[n - 1];
        n--;
      } else {
        i++;
      }
    }
    return n;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int l = s.removeElement(new int[]{3,2,2,4}, 3);
    System.out.println(l);
  }
}
