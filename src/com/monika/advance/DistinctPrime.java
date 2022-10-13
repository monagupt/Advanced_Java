package com.monika.advance;

import java.util.HashSet;

public class DistinctPrime {
    public static void main(String[] args) {
        int A[] = {4, 8, 6, 7};
        HashSet hs=new HashSet<>();
        int N = A[0];
        for (int x : A) {
            if (x > N) {
                N = x;
            }
        }
        int B[] = new int[N + 1];
        B[0] = 0;
        B[1] = 0;
        for (int i = 2; i <= N; i++) {
            if (B[i] == 0) {
                B[i] = i;

                for (int j = 2 * i; j <= N; j = j + i) {
                    if (B[j] == 0) {
                        B[j] = i;
                    }
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            while (A[i] > 1) {
                int k = B[A[i]];
              hs.add(k);
              A[i]=A[i]/k;



            }


        }
    }
}
