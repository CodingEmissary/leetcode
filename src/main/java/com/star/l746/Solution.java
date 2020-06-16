package com.star.l746;

/**
 * @author star
 * @Date 2020/6/13.
 * @Description: No Description Yet.
 */
public class Solution {
  public int minCostClimbingStairs(int[] cost) {
    if (cost.length == 0) return 0;
    int[] res = new int[cost.length+1];
    for (int i = 0; i < cost.length; i++) {
      if (i < 1) continue;
      res[i+1] = Math.min(res[i] + cost[i], res[i-1] + cost[i-1]) ;
    }
    return res[cost.length];
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }
}
