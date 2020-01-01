package com.star.l226;

/**
 * @author star
 * @Date 2020/1/1.
 * @Description: No Description Yet.
 */
public class Solution_1 {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    TreeNode node = root.left;
    root.left = root.right;
    root.right = node;

    invertTree(root.left);
    invertTree(root.right);

    return root;
  }
}
