package com.star.l0342;

/**
 * @author star
 * @Date 2020/6/27.
 * @Description: No Description Yet.
 */
public class Solution {
  public boolean isPowerOfFour(int num) {
    return (num > 0) && ((num & (num-1)) == 0) && ((num & 0xaaaaaaaa)== 0);
  }
}
