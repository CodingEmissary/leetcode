package com.star.l433;

import java.util.Set;

/**
 * @author star
 * @Date 2019/12/28.
 * @Description: No Description Yet.
 */
public class Solution_dfs {

  private int diff(String s1, String s2){
    int res = 0;
    for (int i = 0; i < 8; i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        res++;
      }
    }
    return res;
  }

  private int dfs(String start, String end, Set<String> bank, int depth){
    if (start.equals(end)) return depth;

    int res = Integer.MAX_VALUE;

    return 0;
  }
}
