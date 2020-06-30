package com.star.l0437;

import com.star.utils.TreeNode;

public class Solution {
    int cnt = 0;
    public int pathSum(TreeNode root, int sum) {
        helper(root, sum);
        return cnt;
    }

    public void helper(TreeNode node, int sum){
        if (node == null) return;
        search(node, sum, 0);
        helper(node.left, sum);
        helper(node.right, sum);
    }

    public void search(TreeNode node, int sum, int left){
        if (node == null) return;
        if (sum == left + node.val) {
            cnt++;
        }
        search(node.left, sum, node.val + left);
        search(node.right, sum, node.val + left);
    }
}
