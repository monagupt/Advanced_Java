package com.monika.advance;

import java.util.Arrays;

public class SubSequences {
    public static void main(String[] args) {
        int A[]={9,4,9,1,5};
        int N= A.length;
        int max=A[0];
        for(int x:A){
            if(x>max){
                max=x;
            }
        }
        int B[]=new int[max+1];
        B[0]=0;
        B[1]=0;
        for(int i=2;i<=max;i++){
            if(B[i]==0) {
                B[i] = i;

                for (int j = 2*i; j <= max; j = j + i) {
                       if(B[j]==0)
                        B[j] = i;

                }
            }
        }


        int count=1;
        for (int i=0;i<N;i++){

          if(B[A[i]]==A[i]){
              count=(count<<1);
            }
        }


        int ans=count-1;
        System.out.println(ans);

    }
}
