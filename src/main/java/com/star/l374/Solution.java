package com.star.l374;

/**
 * @author star
 * @Date 2020/6/13.
 * @Description: No Description Yet.
 */
public class Solution {
  public int guessNumber(int n) {
    int low = 0, high = n, mid, comp;
    while (low <= high) {
      mid = low + (high - low) / 2;
      comp = guess(mid);
      if (comp == 0) return mid;
      if (comp == 1) {
        low = mid + 1;
      }else {
        high = mid - 1;
      }
    }

    return -1;
  }

  int guess(int num) {
    if (num == 6) {
      return 0;
    }else if (num < 6) {
      return 1;
    }else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.guessNumber(10));
  }
}
