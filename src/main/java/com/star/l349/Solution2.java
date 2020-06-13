package com.star.l349;

import java.util.Arrays;

/**
 * @author star
 * @Date 2020/6/13.
 * @Description: No Description Yet.
 */
public class Solution2 {
  public int[] intersection(int[] nums1, int[] nums2) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    //最大值，最小值
    for (int i = 0; i < nums1.length; ++i) {
      max = nums1[i] > max ? nums1[i]:max;
      min = nums1[i] < min ? nums1[i]:min;
    }

    boolean[] map = new boolean[max - min + 1];
    for (int i = 0; i < nums1.length; ++i){
      map[nums1[i] - min] = true;
    }

    int index = 0;
    int[] tmp = new int[nums2.length];
    for (int i = 0; i < nums2.length; ++i) {
      if (nums2[i] >= min && nums2[i] <= max && map[nums2[i] - min]){
        tmp[index++] = nums2[i];
        map[nums2[i] - min] = false;
      }
    }

    return Arrays.copyOf(tmp, index);
  }

  public static void main(String[] args) {
    int[] nums1 = new int[]{1,2,2,1};
    int[] nums2 = new int[]{2,2};
    Solution2 s = new Solution2();
    s.intersection(nums1, nums2);
  }
}
