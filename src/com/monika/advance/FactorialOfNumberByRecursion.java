package com.monika.advance;

import java.util.Arrays;

public class FactorialOfNumberByRecursion {
   public static long power(long x, long y, long p)
    {

        // Initialize result
        long res = 1;

        // Update x if it is more than or
        // equal to p
        x = x % p;

        while (y > 0) {

            // If y is odd, multiply x
            // with result
            if (y % 2 == 1)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }

        return res;
    }
    public static long modInverse(long n, long p)
    {
        return power(n, p - 2, p);
    }
    public static int solve(int A, int B, int C) {
        //Base Case
        if (B == 0)
            return 1;
        //Precomputing the factorial values
        long[] fac = new long[A + 1];
        fac[0] = 1;

        for (int i = 1; i <= A; i++)
            fac[i] = fac[i - 1] * i % C;

        long ncr = ((fac[A] * modInverse(fac[B], C)
                % C * modInverse(fac[A - B], C)
                % C)% C);
        return (int)ncr;
    }
    public static void main(String[] args) {
       int A = 41;
        int  B = 27;
        int C = 143;
        int k=solve(A, B, C);

        System.out.println(k);

       // System.out.println(ans);
    }
}
