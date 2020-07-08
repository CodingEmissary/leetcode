package com.star.m1716;

import com.star.utils.PrintUtils;

public class Solution {
    public int massage(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        ans[1] = Math.max(nums[0], nums[1]);
        for (int i  = 2; i < nums.length; i++){
            ans[i] = Math.max(nums[i] + ans[i-2], ans[i-1]);
        }

        PrintUtils.printIntArray(ans);
        return ans[nums.length-1];
    }

    public static void main(String[] args) {
        new Solution().massage(new int[]{1,2,3,1});
    }
}
