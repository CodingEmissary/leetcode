package com.star.l784;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author star
 * @Date 2020/6/25.
 * @Description: No Description Yet.
 */
public class Solution {
  public List<String> letterCasePermutation(String S) {
    if (S.length() == 0){
      return Collections.emptyList();
    }

    List<StringBuilder> ans = new ArrayList<>();
    ans.add(new StringBuilder());

    for (char c :S.toCharArray()) {
      int n = ans.size();
      if (Character.isLetter(c)) {
        for (int i = 0; i < n; i++) {
          ans.add(new StringBuilder(ans.get(i)));
          ans.get(i).append(Character.toLowerCase(c));
          ans.get(n+i).append(Character.toUpperCase(c));
        }
      }else {
        for (int i = 0; i < n; i++) {
          ans.get(i).append(c);
        }
      }
    }

    List<String> res = new ArrayList<>();
    for (StringBuilder sb : ans) {
      res.add(sb.toString());
    }

    return res;
  }
}
