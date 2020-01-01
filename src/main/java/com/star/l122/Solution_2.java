package com.star.l122;

/**
 * @author star
 * @Date 2020/1/1.
 * @Description: No Description Yet.
 */
public class Solution_2 {
  public int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 0, j = 1; i < prices.length && j < prices.length; i++, j++) {
      if (prices[j] > prices[i]) profit += (prices[j] - prices[i]);
    }
    return profit;
  }
}
