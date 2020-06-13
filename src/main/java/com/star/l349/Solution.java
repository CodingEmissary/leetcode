package com.star.l349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author star
 * @Date 2020/6/13.
 * @Description: No Description Yet.
 */
public class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Set<Integer> ans = new HashSet<>();
    for (int target:nums2) {
      if (!ans.contains(target) && binarySearch(nums1, target) >= 0) {
        ans.add(target);
      }
    }

    int[] res = new int[ans.size()];
    int index = 0;
    for (int num : ans) {
      res[index++] = num;
    }
    return res;
  }

  public int binarySearch(int[] nums, int target){
    int low = 0, high = nums.length-1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target) {
        return mid;
      }else if (nums[mid] < target){
        low = mid + 1;
      }else {
        high = mid - 1;
      }
    }

    return -1;
  }
}
