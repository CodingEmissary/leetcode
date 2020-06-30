package com.star.l0543;

import com.star.utils.TreeNode;
import com.star.utils.TreeNodes;

public class Solution {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        height(root);
        return ans;
    }

    public int height(TreeNode node){
        if (node == null) return 0;
        int l = height(node.left);
        int r = height(node.right);
        ans = Math.max(l+r, ans);
        int h = Math.max(l,r)+1;
        System.out.println(node.val + ":" + h + " ans:"+ans);
        return h;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().diameterOfBinaryTree(TreeNodes.buildTree(new Integer[]{1,2,3,4})));
    }
}
