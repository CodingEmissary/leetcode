package com.star.l55;

/**
 * @author star
 * @Date 2020/1/1.
 * @Description: No Description Yet.
 */
public class Solution_1 {
  public boolean canJump(int[] nums) {
    int lastPos = nums.length - 1;
    for (int i = lastPos; i >= 0; i--) {
      if (i + nums[i] >= lastPos) {
        lastPos = i;
      }
    }
    return lastPos == 0;
  }
}
