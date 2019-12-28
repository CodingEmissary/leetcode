package com.star.l03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author star
 * @Date 2019/12/22.
 * @Description: No Description Yet.
 */
public class Solution_1 {

  public int lengthOfLongestSubstring(String s) {
    int len = s.length();
    if (len == 0) return 0;

    Set<Character> set = new HashSet<>();
    int maxLen = 0, i = 0, j = 0;
    while (j < len) {
      if (set.contains(s.charAt(j))) {
        set.remove(s.charAt(i++));
      }else {
        set.add(s.charAt(j++));
        maxLen = Math.max(maxLen, j - i);
      }
    }
    return maxLen;
  }
}
