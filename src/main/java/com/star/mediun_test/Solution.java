package com.star.mediun_test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int fib(int N) {
        int[] memo = new int[7];
        memo[0] = 0;
        memo[1] = 1;

        return fib(N, memo);
    }

    private int fib(int n, int[] memo) {
        if (n <= 1) return n;

        if (memo[0] == 0) {
            memo[n] = fib(n-1, memo) + fib(n - 2, memo);
        }

        return memo[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.fib(1));
    }
}