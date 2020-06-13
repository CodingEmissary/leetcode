package com.star.l367;

/**
 * @author star
 * @Date 2020/6/13.
 * @Description: No Description Yet.
 */
public class Solution {
  public boolean isPerfectSquare(int num) {
    if (num < 2) return true;
    long low = 2, high = num / 2;
    while (low <= high) {
      long mid = low + (high - low) / 2;

      long tmp = mid * mid;
      if (tmp == num) {
        return true;
      }else if (tmp < num){
        low = mid + 1;
      }else {
        high = mid - 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.isPerfectSquare(808201));

    int i = 111111;
    System.out.println(i * i);
  }
}
