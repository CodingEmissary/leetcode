package com.star.l0257;

import com.star.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final String joiner = "->";
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return ans;
        dfs(root, "");
        return ans;
    }

    public void dfs(TreeNode node, String path){
        if (path.equals("")) {
            path = path + node.val;
        }else {
            path = path + joiner + node.val;
        }


        if (isLeaf(node)) {
            ans.add(path);
            return;
        }

        if (node.left != null) dfs(node.left, path);
        if (node.right != null) dfs(node.right, path);
    }

    public boolean isLeaf(TreeNode node){
        return (node != null && node.left == null && node.right == null);
    }
}
