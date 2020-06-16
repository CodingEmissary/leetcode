package com.star.l1300;

import java.util.Arrays;

/**
 * @author star
 * @Date 2020/6/14.
 * @Description: No Description Yet.
 */

public class Solution {
  public int findBestValue(int[] arr, int target) {
    Arrays.sort(arr);
    int n = arr.length;
    int[] sum = new int[n+1];
    for (int i = 1; i <= n; i++) {
      sum[i] = sum[i-1] + arr[i-1];
    }

    int ans = 0, diff = target;
    for (int i = 1; i <= arr[n-1]; i++) {
      int index = Arrays.binarySearch(arr, i);
      if (index < 0) {
        index = -index - 1;
      }
      int cur = sum[index] + (n - index) * i;

      if (Math.abs(cur - target) < diff) {
        ans = i;
        diff = Math.abs(cur - target);
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(new Solution().findBestValue(new int[]{2,3,5}, 10));
  }
}
