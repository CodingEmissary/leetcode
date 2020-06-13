package com.star.l70;

import java.util.HashMap;
import java.util.Map;

/**
 * @author star
 * @Date 2020/6/13.
 * @Description: No Description Yet.
 */
public class Solution {
  Map<Integer, Integer> cache = new HashMap<>();
  public int climbStairs(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;

    int fn1 = cache.containsKey(n-1) ? cache.get(n-1) : climbStairs(n-1);
    cache.put(n-1, fn1);
    int fn2 = cache.containsKey(n-2) ? cache.get(n-2) : climbStairs(n-2);
    cache.put(n-2, fn2);
    return fn1 + fn2;
  }
}
