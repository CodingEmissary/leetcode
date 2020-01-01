package com.star.l455;

import java.util.Arrays;

/**
 * @author star
 * @Date 2020/1/1.
 * @Description: No Description Yet.
 */
public class Solution_1 {
  public int findContentChildren(int[] g, int[] s) {
    if (g.length == 0 || s.length == 0) return 0;

    Arrays.sort(g);
    Arrays.sort(s);

    int cnt = 0;

    for (int i = 0, j = 0; i < g.length && j < s.length;) {
      if (g[i] <= s[j]) {
        i++;
        j++;
        cnt++;
      }else {
        j++;
      }
    }

    return cnt;
  }
}
