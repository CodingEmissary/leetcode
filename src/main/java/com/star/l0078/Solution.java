package com.star.l0078;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * @author star
 * @Date 2020/6/25.
 * @Description: No Description Yet.
 */
public class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    int len = candidates.length;
    Arrays.sort(candidates);
    dfs(candidates, len, target, 0, new ArrayDeque<>(), res);
    return res;
  }

  /**
   *
   * @param candidates 数组输入
   * @param len 输入数组的长度，冗余变量
   * @param residue 剩余数值
   * @param begin 本轮搜索的起点下标
   * @param path 从根节点到任意节点的路径
   * @param res 结果集变量
   */
  public void dfs(int[] candidates, int len, int residue, int begin, Deque<Integer> path, List<List<Integer>> res) {
    if (residue == 0) {
      res.add(new ArrayList<>(path));
    }

    for (int i = begin; i < len; i++) {
      if (residue - candidates[i] < 0) {
        break;
      }

      path.addLast(candidates[i]);
      dfs(candidates, len, residue - candidates[i], i, path, res);
      path.removeLast();
    }
  }
}
