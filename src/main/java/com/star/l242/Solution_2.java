package com.star.l242;

import java.util.Arrays;

/**
 * @author star
 * @Date 2019/12/21.
 * @Description: 排序比较
 */
public class Solution_2 {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);

    return Arrays.equals(str1, str2);
  }
}
