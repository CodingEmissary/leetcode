package com.star.l297;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author star
 * @Date 2020/6/16.
 * @Description: No Description Yet.
 */
public class Codec {

  public String rserialize(TreeNode root, String str) {
    if (root == null) {
      str += "None,";
    }else {
      str += String.valueOf(root.val) + ",";
      str = rserialize(root.left, str);
      str = rserialize(root.right, str);
    }
    return str;
  }

  public String serialize(TreeNode root) {
    return rserialize(root, "");
  }

  public TreeNode rdeserialize(List<String> l) {
    if (l.get(0).equals("None")) {
      l.remove(0);
      return null;
    }

    TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
    l.remove(0);
    root.left = rdeserialize(l);
    root.right = rdeserialize(l);

    return root;
  }

  public TreeNode deserialize(String data) {
    String[] data_array = data.split(",");
    List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
    return rdeserialize(data_list);
  }

}
