package com.monika.advance;

import java.util.Arrays;

public class PrimeSum {
    public static void main(String[] args) {
        int N=1048574;
        int two[]=new int[2];
        int B[]=new int[N+1];
        B[0]=0;
        B[1]=0;
        for(int i=2;i<=N;i++){
            if(B[i]==0) {
                B[i] = i;

                for (int j = 2*i; j <= N; j = j + i) {
                    if (B[j] == 0) {
                        B[j] = i;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(B));

        for(int j=2;j<=N;j++){
            int K=N-j;

            if((B[j]!=0 && B[K]!=0) && (B[j]+B[K]==N)){
                two[0]=B[j];
                two[1]=K;
            }
        }
        System.out.println(Arrays.toString(two));
    }
}
