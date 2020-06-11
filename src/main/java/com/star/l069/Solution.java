package com.star.l069;

/**
 * @author star
 * @Date 2020/6/10.
 * @Description: No Description Yet.
 */
public class Solution {
  public int mySqrt(int x) {
    int l = 0, r = x, ans = -1;
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if ((long)mid * mid <= x) {
        ans = mid;
        l = mid + 1;
      }
      else {
        r = mid - 1;
      }
    }
    return ans;
  }


  public int mySqrt2(int x) {
    if (x == 0) {
      return 0;
    }
    int ans = (int)Math.exp(0.5 * Math.log(x));
    return (long)(ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
  }

}
