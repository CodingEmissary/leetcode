package com.star.l0215;

import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k - 1];
    }
}
