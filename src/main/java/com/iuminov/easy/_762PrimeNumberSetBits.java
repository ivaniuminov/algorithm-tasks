package com.iuminov.easy;

import java.util.Arrays;

public class _762PrimeNumberSetBits {

    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        int r = R;

        while (r > 0) {
            r >>= 1;
            count++;
        }

        boolean[] primes = new boolean[count + 1];

        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        int answer = 0;

        for (int n = L; n <= R; n++) {
            if (primes[Integer.bitCount(n)]) {
                answer++;
            }
        }

        return answer;
    }
}
