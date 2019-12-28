package com.star.l70;

/**
 * @author star
 * @Date 2019/12/22.
 * @Description: No Description Yet.
 */
public class Solution_3 {
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  //内存优化版 数组 -> 变量
  public int climbStairs2(int n) {
    int pre = 1, preOfPre = 1, cur = 1;
    for(int i = 2; i <= n; i++) {
      cur = pre + preOfPre;
      preOfPre = pre;
      pre = cur;
    }
    return cur;
  }
}
