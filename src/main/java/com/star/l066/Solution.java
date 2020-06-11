package com.star.l066;

/**
 * @author star
 * @Date 2020/6/10.
 * @Description: No Description Yet.
 */
public class Solution {
  public int[] plusOne(int[] digits) {

    int length = digits.length;
    if (length == 0){
      return digits;
    }

    for (int i = length - 1; i >= 0; i--){
      digits[i] = digits[i] + 1;
      if (digits[i] == 10) {
        digits[i] = 0;
      }else {
        return digits;
      }
    }

    int[] arr = new int[++length];
    arr[0] = 1;
    return arr;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] res = s.plusOne(new int[]{9});
    for (int item:res){
      System.out.println(item);
    }
  }
}
