package com.star.l108;

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

  public TreeNode sortedArrayToBST(int[] nums) {
    if(nums == null) return null;
    return sortedArrayToBST(nums, 0, nums.length-1);
  }

  private TreeNode sortedArrayToBST(int[] nums, int l, int h) {
    if (l > h) {
      return null;
    }

    int m = l + (h - l) / 2 ;
    TreeNode root = new TreeNode(nums[m]);
    root.left = sortedArrayToBST(nums, l, m-1);
    root.right = sortedArrayToBST(nums, m + 1, h);
    return root;
  }
}
