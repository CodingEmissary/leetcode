package com.star.l0105;

import com.star.utils.TreeNode;

import java.util.HashMap;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length, map);
    }

    public TreeNode buildTreeHelper(int[] preorder, int pStart, int pEnd,
                                    int[] inorder, int iStart, int iEnd, HashMap<Integer, Integer> map){

        if (pStart >= pEnd) return null;

        //建立根节点
        int rootVal = preorder[pStart];
        TreeNode rootNode = new TreeNode(rootVal);

        //inorder中找到rootVal的index
        int iIndex = map.get(rootVal);
        int leftNum = iIndex - iStart;
        rootNode.left = buildTreeHelper(preorder, pStart+1, pStart+leftNum+1,
                inorder, iStart, iIndex, map);
        rootNode.right = buildTreeHelper(preorder, pStart+leftNum+1, pEnd,
                inorder, iIndex+1, iEnd, map);
        return rootNode;
    }
}
