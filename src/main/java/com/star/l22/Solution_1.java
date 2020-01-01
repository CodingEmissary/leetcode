package com.star.l22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author star
 * @Date 2019/12/28.
 * @Description: No Description Yet.
 */
public class Solution_1 {
  private List<String> ans = new ArrayList<>();
  public List<String> generateParenthesis(int n) {
    backtrack("", 0, 0, n);
    return ans;
  }

  private void backtrack(String cur, int open, int close, int max){
    if (cur.length() == max * 2) {
      ans.add(cur);
      return;
    }

    if (open < max) backtrack(cur + "(", open + 1, close, max);
    if (close < open) backtrack(cur + ")", open, close + 1, max);
  }

  public static void main(String[] args) {
    Solution_1 s = new Solution_1();
    s.generateParenthesis(3);
  }
}
