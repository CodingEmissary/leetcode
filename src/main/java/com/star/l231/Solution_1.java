package com.star.l231;

/**
 * @author star
 * @Date 2019/12/22.
 * @Description: No Description Yet.
 */
public class Solution_1 {
  public boolean isPowerOfTwo(int n) {
    return n > 0 && ((n & (n-1)) == 0);
  }
}

