package com.star.l123;

/**
 * @author star
 * @Date 2020/6/14.
 * @Description: No Description Yet.
 */
public class Solution {

  public int maxProfit(int[] prices) {
    if (prices.length == 0) return 0;

    //三个状态：0次操作，1次操作，2次操作
    int[][] profiles = new int[prices.length][3];

    //第一天不管做什么，收益都是0
    for (int i = 1; i < prices.length; i++) {
      //1次操作
      int minPrice1 = Integer.MAX_VALUE;
      for (int j = 0; j < i; j++){
        if (minPrice1 > prices[j]) {
          minPrice1 = prices[j];
        }
      }
      // max: prices[i] - min(prices[0...i-1]) and profiles[i-1][1]
      profiles[i][1] = Math.max(prices[i] - minPrice1, profiles[i-1][1]);

      //2次操作
      //max prices[i] - min(prices[k...i-1]) + profiles[k][1] and profiles[i-1][2]

      int maxProfile2 = Integer.MIN_VALUE;
      for (int j = 0; j < i; j++){

        int minPrice2 = Integer.MAX_VALUE;
        for (int k = j; k < i; k++) {
          if (minPrice2 > prices[k]) {
            minPrice2 = prices[k];
          }
        }

        if (prices[i] - minPrice2 + profiles[j][1] > maxProfile2) {
          maxProfile2 = prices[i] - minPrice2 + profiles[j][1];
        }
      }

      profiles[i][2] = Math.max(maxProfile2, profiles[i-1][2]);
    }

    return Math.max(profiles[prices.length-1][1], profiles[prices.length-1][2]);
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
  }


  public int stateMmaxProfit(int[] prices) {
    if(prices.length == 0) return 0;
    //进行初始化，第一天 s1 将股票买入，其他状态全部初始化为最小值
    int s1=-prices[0],s2=Integer.MIN_VALUE,s3=Integer.MIN_VALUE,s4=Integer.MIN_VALUE;

    for(int i=1;i<prices.length;++i) {
      s1 = Math.max(s1, -prices[i]); //买入价格更低的股
      s2 = Math.max(s2, s1+prices[i]); //卖出当前股，或者不操作
      s3 = Math.max(s3, s2-prices[i]); //第二次买入，或者不操作
      s4 = Math.max(s4, s3+prices[i]); //第二次卖出，或者不操作
    }
    return Math.max(0,s4);
  }
}
