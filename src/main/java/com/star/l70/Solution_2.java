package com.star.l70;

/**
 * @author star
 * @Date 2019/12/22.
 * @Description: No Description Yet.
 */
public class Solution_2 {
  public int climbStairs(int n) {
    int memo[] = new int[n + 1];
    return climb_Stairs(0, n, memo);
  }

  /**
   * @param i 爬楼梯的起始位置
   * @param n 楼梯总数
   * @param memo 存储第i位爬上去的可能的数量
   * @return
   */
  public int climb_Stairs(int i, int n, int memo[]) {
    if (i > n) return 0;
    if (i == n) return 1;
    if (memo[i] > 0) return memo[i];
    memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
    return memo[i];
  }
}
