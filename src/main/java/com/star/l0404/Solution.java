package com.star.l0404;

import com.star.utils.TreeNode;

public class Solution {

    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return sum;
        if (isLeaf(root.left)) sum += root.left.val;
        sumOfLeftLeaves(root.right);
        return sum;
    }


    public boolean isLeaf(TreeNode node){
        return node != null && node.left == null && node.right == null;
    }
}
