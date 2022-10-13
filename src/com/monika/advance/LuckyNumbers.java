package com.monika.advance;

import java.util.Arrays;

public class LuckyNumbers {
    public static void main(String[] args) {
        int n=8;
        int B[]=new int[n+1];


        for(int i=2;i<=n;i++){

            if(B[i]==0){
              B[i]=1;
                for(int j=2*i;j<=n;j=j+i){

                  if(B[j]==0){
                      B[j]=1;
                  } else if (B[j]>=1) {
                      B[j]=B[j]+1;
                  }

                }

            }

        }
        int  ans=0;
        for(int i=0;i<=n;i++){
            System.out.println(B[i]);
           if(B[i]==2){
               ans=ans+1;
           }
        }
        System.out.println(ans);
       System.out.println(Arrays.toString(B));
    }
}
