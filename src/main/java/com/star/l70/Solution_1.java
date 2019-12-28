package com.star.l70;

/**
 * @author star
 * @Date 2019/12/22.
 * @Description: No Description Yet.
 */
public class Solution_1 {

  public int climbStairs(int n) {
    return climb_Stairs(0, n);
  }
  public int climb_Stairs(int i, int n) {
    if (i > n) {
      return 0;
    }
    if (i == n) {
      return 1;
    }
    return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
  }
}
