package com.star.mediun_test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int fib(int N) {
        Map<Integer, Integer> re = new HashMap<>();
        re.put(0, 0);
        re.put(1, 1);
        re.put(1, 1);
        return fib2(N, re);
    }

    private int fib2(int N, Map<Integer, Integer> map) {
        if (N == 0) return 0;
        if (N == 1 || N == 2) return 1;

        Integer fibN1 = map.get(N-1);
        if (fibN1 == null) {
            int N1 = N - 1;
            fibN1 = fib2(N1, map);
            map.put(N1, fibN1);
        }

        Integer fibN2 = map.get(N-2);
        if (fibN2 == null) {
            int N2 = N - 2;
            fibN2 = fib2(N2, map);
            map.put(N-2, fibN2);
        }

        map.put(N, fibN1 + fibN2);
        return fibN1 + fibN2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.fib(1));
    }
}