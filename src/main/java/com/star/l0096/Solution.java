package com.star.l0096;

public class Solution {
    public int numTrees(int n) {
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; i++) {
            int sg = 0;
            for (int j = 1; j <= i; j++){
                sg += G[j-1] * G[i-j];
            }
            G[i] = sg;
        }

        return G[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numTrees(3));
    }
}
