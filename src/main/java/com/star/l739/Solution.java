package com.star.l739;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author star
 * @Date 2020/6/11.
 * @Description: No Description Yet.
 */
public class Solution {
  public int[] dailyTemperatures(int[] T) {
    Deque<Integer> stack = new LinkedList<>();
    int len = T.length;
    int[] res = new int[len];
    for (int i = 0; i < len;) {
      if (stack.isEmpty() || (T[stack.peek()] >= T[i])){
        stack.push(i);
        i++;
      }else {
        int pre = stack.pop();
        int duration = i - pre;
        res[pre] = duration;

        if (stack.isEmpty()) {
          stack.push(i);
          i++;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(Arrays.toString(s.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
  }
}
