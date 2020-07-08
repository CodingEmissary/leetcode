package com.star.l0213;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(robHelper(nums, 0, nums.length - 1), robHelper(nums, 1, nums.length));
    }

    //左闭右开
    public int robHelper(int[] nums, int start, int end){
        int pre = 0, cur = 0, tmp;
        for (int i = start; i < end; i++) {
            tmp = cur;
            cur = Math.max(nums[i] + pre, cur);
            pre = tmp;
        }

        return cur;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{2,1,1,1}));
    }
}
