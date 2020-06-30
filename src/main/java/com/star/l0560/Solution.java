package com.star.l0560;

import java.util.HashMap;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        int ans = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int targetSum = sum - k;
            if (preSum.containsKey(targetSum)) ans += preSum.get(targetSum);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().subarraySum(new int[]{3,5,2,-2,4,1}, 8));
    }
}
