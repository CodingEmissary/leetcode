package com.star.l401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author star
 * @Date 2020/6/14.
 * @Description: No Description Yet.
 */
public class Solution {
  private Map<Integer, Integer> map = new HashMap<>();
  {
    map.put(0, 1);
    map.put(1, 2);
    map.put(2, 3);
    map.put(3, 8);

    map.put(4, 1);
    map.put(5, 2);
    map.put(6, 4);
    map.put(7, 8);
    map.put(8, 16);
    map.put(9, 32);
  }

  private List<String> ans;
  //分钟超过59要丢弃
  public List<String> readBinaryWatch(int num) {
    ans = new ArrayList<>();
    trackback(num, num, new HashSet<>(), new HashSet<>());
  }

  private void trackback(int total, int left, Set<Integer> hourPath, Set<Integer> minPath){
    if (hourPath.size() + minPath.size() == total) {
      int hour = 0;
      for (int i : hourPath){
        hour += map.get(i);
      }

      if (hour > 11) return; //不合法

      int mintue = 0;
      for (int i : minPath){
        mintue += map.get(i);
      }

      if (mintue > 59) return; //不合法
      ans.add(hour + System.out.format("%2d", mintue).toString());
    }

   while (left > 0) {
      if (hourPath.size() > 4) {

      }
     trackback(total, left-1, hourPath, minPath);
   }
  }
}
