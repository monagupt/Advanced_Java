package com.monika.advance;

import java.util.Arrays;

public class ArrayWithConsecutiveElement {
    public static void swap(int Arr[],int a,int b){
        int temp=Arr[a];
        Arr[a]=Arr[b];
        Arr[b]=temp;
    }
    public static void main(String[] args) {
        int A[]={3, 4, 1, 9, 56, 7, 9, 12};
        int B=5;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<=A.length-1;i++){
            int smalles_idx=i;
            for(int j=i+1;j<A.length;j++){
                if(A[j]<A[smalles_idx]){
                    smalles_idx=j;
                }
            }
            swap(A,i,smalles_idx);
        }
        for(int i=0;i+B-1<A.length;i++){
            System.out.println(A[B+i-1]);
            max=Math.min(max,(A[B+i-1]-A[i]));
        }
        System.out.println(Math.log(11));
        int c[]=new int[A[A.length-1]];
        for(int i=0;i<c.length;i++){
            c[i]=i+1;
        }
        if(Arrays.equals(A,c)){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
       // System.out.println(Arrays.toString(c));
    }
}
