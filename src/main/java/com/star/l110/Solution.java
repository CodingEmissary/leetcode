package com.star.l110;

import com.star.utils.TreeNode;

/**
 * @author star
 * @Date 2020/6/28.
 * @Description: No Description Yet.
 */
public class Solution {
  public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    return Math.abs(height(root.right) - height(root.left)) < 2 && isBalanced(root.left) && isBalanced(root.right);
  }

  public int height(TreeNode node){
    if (node == null) return 0;
    return 1 + Math.max(height(node.left), height(node.right));
  }
}
