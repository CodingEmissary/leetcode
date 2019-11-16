package com.star.l101;

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
  public boolean isSymmetric(TreeNode root) {
    return isMirror(root, root);
  }

  public boolean isMirror(TreeNode t1, TreeNode t2){
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;

    if (t1.val != t2.val) return false;
    return isMirror(t1.left, t2.right) && isMirror(t2.left, t1.right);
  }
}
