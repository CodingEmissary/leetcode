package com.star.l0501;

import com.star.utils.PrintUtils;
import com.star.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class Solution {

    int maxCnt = 0;
    int cnt = 0;
    TreeNode pre = null;
    List<Integer> res = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inOrder(root);

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }

    public void inOrder(TreeNode node){
        if(node == null) return;

        inOrder(node.left);
        if (pre == null || pre.val == node.val) {
            ++cnt;
            pre = node;
        }else if (pre.val != node.val){
            cnt = 1;
            pre = node;
        }

        if (maxCnt < cnt) {
            maxCnt = cnt;
            res.clear();
            res.add(node.val);
        }else if(maxCnt == cnt) {
            res.add(node.val);
        }

        inOrder(node.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        node.right = node2;

        PrintUtils.printIntArray(new Solution().findMode(node));
    }
}
