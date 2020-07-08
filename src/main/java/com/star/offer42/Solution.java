package com.star.offer42;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int pre = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++){
            int cur = nums[i] > pre + nums[i] ? nums[i] : pre + nums[i];
            max = Math.max(max, cur);
            pre = cur;
        }

        return max;
    }
}
