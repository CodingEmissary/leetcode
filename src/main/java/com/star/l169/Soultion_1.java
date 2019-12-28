package com.star.l169;

import java.util.HashMap;
import java.util.Map;

/**
 * @author star
 * @Date 2019/12/28.
 * @Description: No Description Yet.
 */
public class Soultion_1 {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> countMap = new HashMap<>();
    for (int i : nums) {
      int cnt = countMap.getOrDefault(i, 0);
      countMap.put(i, ++cnt);
    }

    int half = nums.length / 2;
    for (Map.Entry<Integer, Integer> entry:countMap.entrySet()) {
      if (entry.getValue() > half) {
        return entry.getKey();
      }
    }
    return 0;
  }
}
