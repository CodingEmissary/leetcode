package com.star.l392;

/**
 * @author star
 * @Date 2020/6/14.
 * @Description: No Description Yet.
 */
public class Solution {
  public boolean isSubsequence(String s, String t) {
    if (s.length() == 0) return true;
    if (s.length() > t.length()) return false;

    char[] arr = s.toCharArray();
    int j = -1;
    for (int i = 0; i < arr.length; i++) {
      j = t.indexOf(arr[i], j+1);
      if (j == -1) {
        return false;
      }
    }

    return true;
  }
}
