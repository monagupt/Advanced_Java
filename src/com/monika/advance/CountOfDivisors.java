package com.monika.advance;

import java.util.Arrays;

public class CountOfDivisors {
    public static  int sieveArray(int N){
        int B[]=new int[N+1];
        B[0]=0;
        B[1]=0;
        for (int i=2;i<=N;i++)
        {
            if (B[i]==0)
            {
                B[i]=i;

                for(int j=2*i;j<=N;j=j+i)
                {
                    if (B[j]==0)
                    {
                        B[j]=i;
                    }
                }
            }


        }
        return B[N];
    }
    public static void main(String[] args) {
        int A[]={3, 52, 66, 64, 14, 51, 6, 39, 5, 26, 80, 88, 60, 73, 67, 16, 1, 81, 62, 42, 83, 31, 40, 4, 32, 31, 44, 3, 20, 94, 93, 57, 2, 18, 32, 59, 91, 30, 45};
      int C[]=new int[A.length];

        for(int i=0;i<A.length;i++){
            int c=0;
            int div=1;
            if(A[i]==1) {
                C[i]=1;
            }

            while (A[i]>1){

                int k= sieveArray(A[i]);

                c=0;
                while(A[i]%k==0){
                    c++;
                    A[i]=A[i]/k;

                }

                div=div*(c+1);
                C[i]=div;
            }

        }


     System.out.println(Arrays.toString(C));
    }
}
