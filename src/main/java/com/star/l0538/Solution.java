package com.star.l0538;

import com.star.utils.TreeNode;

public class Solution {

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        inOrder(root);
        return root;
    }

    public void inOrder(TreeNode node){
        if (node == null) return;
        inOrder(node.right);
        node.val = node.val + sum;
        sum = node.val;
        inOrder(node.left);
    }
}
