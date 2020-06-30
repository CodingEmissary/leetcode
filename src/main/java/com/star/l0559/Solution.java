package com.star.l0559;


public class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null || root.children.size() == 0) {
            return 1;
        }

        int childMaxDepth = 0;
        for (Node child:root.children){
            childMaxDepth = Math.max(maxDepth(child), childMaxDepth);
        }
        return childMaxDepth + 1;
    }
}
