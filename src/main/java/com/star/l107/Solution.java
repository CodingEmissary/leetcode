package com.star.l107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author star
 * @Date 2019/11/16.
 * @Description: No Description Yet.
 *
 * 层次遍历本身需要使用辅助队列，然后这里需要对每一层的节点个数记录下来，将这一层的节点值放在一个list
 */
public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if (root == null ) return new ArrayList<>();

    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      List<Integer> list = new ArrayList<>();
      int length = queue.size();

      for (int i = 0; i < length; i++){
        TreeNode node = queue.remove();
        list.add(node.val);

        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }
      result.add(list);
    }
    Collections.reverse(result);
    return result;
  }
}
