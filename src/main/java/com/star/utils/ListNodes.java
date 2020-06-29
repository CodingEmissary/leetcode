package com.star.utils;


/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class ListNodes {

  public static ListNode buildList(int[] nums) {
    ListNode root = null;
    ListNode last = root;
    for (int num:nums) {
      ListNode cur = new ListNode(num);
      if (root == null) {
        root = cur;
        last = root;
      }else {
        last.next = cur;
        last = cur;
      }
    }

    return root;
  }

  public static void printList(ListNode root){
    if (root == null) {return;}
    while (root != null) {
      System.out.println(root.val);
      root = root.next;
    }
  }
}
