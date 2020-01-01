package com.star.l98;

/**
 * @author star
 * @Date 2020/1/1.
 * @Description: No Description Yet.
 */
public class Solution_1 {
  public boolean isValidBST(TreeNode root) {
    return helper(root, null, null);
  }

  private boolean helper(TreeNode node, Integer lower, Integer upper){
    if (node == null) return true;
    if (lower != null && node.val <= lower) return false;
    if (upper != null && node.val >= upper)  return false;

    return helper(node.left, lower, node.val) && helper(node.right, node.val, upper);
  }
}
