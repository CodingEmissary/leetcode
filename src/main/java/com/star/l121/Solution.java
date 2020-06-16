package com.star.l121;

/**
 * @author star
 * @Date 2020/6/14.
 * @Description: No Description Yet.
 */
public class Solution {
  public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfile = 0;
    for(int i = 0; i < prices.length; i++){
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }else if (prices[i] - minPrice > maxProfile) {
        maxProfile = prices[i] - minPrice;
      }
    }

    return maxProfile;
  }

  public static void main(String[] args) {
    System.out.println(new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
  }
}
