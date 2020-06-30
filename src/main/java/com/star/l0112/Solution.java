package com.star.l0112;

import com.star.utils.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            return true;
        }else {
            return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
        }
    }
}