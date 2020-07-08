package com.star.m0801;

public class Solution {
    public int waysToStep(int n) {

        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        int[] ans = new int[n+1];
        ans[0] = 1;
        ans[1] = 2;
        ans[2] = 4;
        for (int i = 3; i <= n; i++){
            ans[i] = (ans[i-1] +  ans[i-2] + ans[i-3])%1000000007;
        }

        return ans[n];
    }
}
