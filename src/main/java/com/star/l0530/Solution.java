package com.star.l0530;

import com.star.utils.TreeNode;

public class Solution {

    int minDiff = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    public void inOrder(TreeNode node){
        if (node == null) return;
        inOrder(node.left);
        if (pre != null) {
            minDiff = Math.min(minDiff, Math.abs(node.val - pre.val));
        }
        pre = node;

        inOrder(node.right);
    }
}
