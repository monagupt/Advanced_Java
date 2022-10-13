package com.monika.advance;

import java.util.Arrays;

public class AllPairSum {
      public static int merge(int []A,int s,int mid,int e){
        int MOD=1000000007;

        int inversioncount=0;
        int temp[]=new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=e) {
            if (A[i] <= A[j]) {
                temp[k] = A[i];
                k++;
                i++;
            } else {
                temp[k] = A[j];

                k++;
                j++;
                inversioncount+=(mid-i+1)%MOD;

            }
        }


        while(j<=e){
            temp[k]=A[j];
            j++;
            k++;
        }
        while(i<=mid){
            temp[k]=A[i];
            i++;
            k++;
        }
        int m=0;
        for(int t=s;t<=e;t++){
            A[t]=temp[m];
            m++;
        }
        return inversioncount%MOD;
    }
    public  static  int mergeSort(int []A,int s,int e){
        int MOD=1000000007;
        if(s>=e) {
            return 0;
        }
        //   System.out.println(e);
        int mid =(s+e)/2;
        int x=  mergeSort(A, s, mid)%MOD;
        int y =mergeSort(A, mid + 1, e)%MOD;
        int z=  merge(A,s,mid,e)%MOD;
        return  (x+y+z)%MOD;

    }

    public static void main(String[] args) {
        int A[]={28, 18, 44, 49, 41, 14};
        int s=0;
        int e=A.length-1;
        int k= mergeSort(A,s,e);
        System.out.println(k);
    }
}
