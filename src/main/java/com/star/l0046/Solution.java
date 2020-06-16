package com.star.l0046;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author star
 * @Date 2020/6/14.
 * @Description: No Description Yet.
 */
public class Solution {
  private List<List<Integer>> ans = new ArrayList<>();
  private int[] nums;

  public List<List<Integer>> permute(int[] nums) {
    this.nums = nums;
    backtrack(new ArrayList<>());
    return ans;
  }


  public void backtrack(List<Integer> path) {
    if (path.size() == nums.length) {
      ans.add(path);
      return;
    }

    Set<Integer> usedSet = new HashSet<>(path);
    for (int item : nums) {
      if (!usedSet.contains(item)) {
        List<Integer> pathCopy = new ArrayList<>(path);
        pathCopy.add(item);
        backtrack(pathCopy);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(new Solution().permute(new int[]{1,2,3}));
  }
}
