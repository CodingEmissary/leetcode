package com.star.m16_11;

import com.star.utils.PrintUtils;


/**
 * @author star
 * @Date 2020/6/28.
 * @Description: No Description Yet.
 */
public class Solution {
  public int[] divingBoard(int shorter, int longer, int k) {
    if (k == 0) return new int[]{};
    if (shorter == longer)  return new int[]{k};
    //i为短板的数量
    int[] ans = new int[k+1];
    for (int i = 0; i <= k; i++) {
      ans[i] = i * shorter + longer * (k-i);
    }
    return ans;
  }

  public static void main(String[] args) {
    PrintUtils.printIntArray(new Solution().divingBoard(2,1118596, 979));
  }
}
