package com.star.l278;

/**
 * @author star
 * @Date 2020/6/12.
 * @Description: No Description Yet.
 */
public class Solution {

  public int firstBadVersion(int n) {
    int low = 1, high = n;
    while (low < high){
      int mid = low + (high - low)/2;
      if (isBadVersion(mid)) {
        high = mid; //这里一定不能 high = mid - 1 不然会死循环，实际上也不符合逻辑
      }else {
        low = mid  + 1;
      }
    }

    return low;
  }

  public boolean isBadVersion(int version){
    return version >= 4;
  }

  public static void main(String[] args) {
    System.out.println(new Solution().firstBadVersion(10));
  }
}
