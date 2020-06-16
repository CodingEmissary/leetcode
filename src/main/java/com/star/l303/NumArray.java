package com.star.l303;

/**
 * @author star
 * @Date 2020/6/13.
 * @Description: No Description Yet.
 */
public class NumArray {

  private int[] ans;

  public NumArray(int[] nums) {
    ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        ans[0] = nums[0];
        continue;
      }

      ans[i] = ans[i-1] + nums[i];
    }
  }

  public int sumRange(int i, int j) {
    if (i == 0 ) return ans[j];
    int ii = ans[--i];
    int jj = ans[j];

    return jj - ii;
  }

  public static void main(String[] args) {
    NumArray n = new NumArray(new int[]{-2,0,3,-5,2,-1});
    System.out.println(n.sumRange(0, 2));
  }
}
