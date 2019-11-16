package com.star.l104;

/**
 * @author star
 * @Date 2019/11/16.
 * @Description: No Description Yet.
 */
public class Solution {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  public int maxDepth(TreeNode root) {
    return depth(root);
  }

  public int depth(TreeNode t) {
    if (t == null) return 0;
    return 1 + Math.max(depth(t.left), depth(t.right));
  }
}
