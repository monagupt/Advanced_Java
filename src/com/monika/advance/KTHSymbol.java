package com.monika.advance;

import java.util.Arrays;

public class KTHSymbol {
    public static void swap(int Arr[],int a,int b){
        System.out.println(a);
        int temp=Arr[a];
        Arr[a]=Arr[b];
        Arr[b]=temp;
    }
    public static  int kthsmallest(int[] A, int B) {


        for(int i=0;i<=A.length-1;i++){
            int smalles_idx=i;
            for(int j=i+1;j<A.length;j++){
                if(A[j]<A[smalles_idx]){
                    smalles_idx=j;
                }
            }
            swap(A,i,smalles_idx);
        }

        return A[B-1];
    }
    public static void main(String[] args) {
        int A[]={ 8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92 };
        int B=9;

       int m= kthsmallest(A,B);
        System.out.println(m);
    }
}
