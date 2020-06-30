package com.star.utils;

public class TreeNodes {
    public static TreeNode buildTree(Integer[] vals){
        if (vals == null || vals.length == 0) {
            return null;
        }

        return createBinaryTreeByArray(vals, 0);
    }

    private static TreeNode createBinaryTreeByArray(Integer[] vals, int index){
        TreeNode node = null;
        if (index<vals.length) {
            Integer value = vals[index];
            if (value == null) return null;
            node = new TreeNode(value);
            node.left = createBinaryTreeByArray(vals, 2*index+1);
            node.right = createBinaryTreeByArray(vals, 2*index+2);
            return node;
        }
        return node;
    }

    public static void main(String[] args) {
        TreeNode n = TreeNodes.buildTree(new Integer[]{1,2,null,4,5,6});
        dfs(n);
    }

    public static void dfs(TreeNode n){
        if (n == null) return;
        System.out.println(n.val);
        dfs(n.left);
        dfs(n.right);
    }
}
