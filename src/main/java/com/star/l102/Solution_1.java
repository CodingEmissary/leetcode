package com.star.l102;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author star
 * @Date 2019/12/28.
 * @Description: No Description Yet.
 */

public class Solution_1 {


  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) return new ArrayList<>();

    List<List<Integer>> res = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      List<Integer> resItem = new ArrayList<>();

      int levelLen = queue.size();
      for (int i = 0; i < levelLen; i++) {
        TreeNode n = queue.remove();
        resItem.add(n.val);

        if (n.left != null) queue.add(n.left);
        if (n.right != null) queue.add(n.right);
      }

      res.add(resItem);
    }
    return res;
  }
}
