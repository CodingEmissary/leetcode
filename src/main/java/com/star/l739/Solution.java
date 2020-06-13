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
    int[] res = new int[T.length];
    for (int i = 0; i < T.length; i++) {
      while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
        int prev = stack.pop();
        res[prev] = i - prev;
      }
      stack.push(i);
    }
    return res;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(Arrays.toString(s.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
  }
}
