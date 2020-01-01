package com.star.l111;

/**
 * @author star
 * @Date 2020/1/1.
 * @Description: No Description Yet.
 */
public class Solution_1 {
  public int minDepth(TreeNode root) {
    return dfs(root);
  }

  private int dfs(TreeNode node){
    if (node == null) return 0;
    int leftHigh = dfs(node.left);
    int rightHigh = dfs(node.right);
    //这个是个大坑
    if (node.left == null || node.right == null) {
      return leftHigh + rightHigh + 1;
    }else {
      return Math.min(leftHigh, rightHigh) + 1;
    }
  }
}
