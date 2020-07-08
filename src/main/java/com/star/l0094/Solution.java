package com.star.l0094;

import com.star.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode node){
        if (node == null) return;
        inorder(node.left);
        ans.add(node.val);
        inorder(node.right);
    }
}
