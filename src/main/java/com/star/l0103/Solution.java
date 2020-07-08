package com.star.l0103;

import com.star.utils.TreeNode;
import com.star.utils.TreeNodes;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);

        TreeNode cur = null;
        boolean fromLeft = true;
        while (!deque.isEmpty()){
            List<Integer> ansTemp = new ArrayList<>();
            Deque<TreeNode> dequeTmp = new LinkedList<>();
            while(!deque.isEmpty()){
                if (fromLeft) {
                    cur = deque.removeFirst();
                    if (cur.left != null) dequeTmp.add(cur.left);
                    if (cur.right != null) dequeTmp.add(cur.right);
                }else {
                    cur = deque.removeLast();
                    if (cur.right != null) dequeTmp.addFirst(cur.right);
                    if (cur.left != null) dequeTmp.addFirst(cur.left);
                }
                ansTemp.add(cur.val);
            }

            fromLeft = !fromLeft;
            deque = dequeTmp;
            ans.add(ansTemp);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(
                new Solution().zigzagLevelOrder(
                        TreeNodes.buildTree(new Integer[]{3,9,20,null,null,15,7})));
    }
}
