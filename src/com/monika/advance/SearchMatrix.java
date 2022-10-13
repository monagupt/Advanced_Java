package com.monika.advance;

import java.util.Arrays;

public class SearchMatrix {
    public  static int binSearch(int A[][],int B){
        int s=0;
        int n=A.length;
        int m=A[0].length;
        int e=(n*m)-1;
        while(s<=e){
            int mid=(s+e)/2;
            int i=mid/m;
            int j=mid%m;
            if(A[i][j]==B){
                return 1;
            } else if (A[i][j]<B) {
                s=mid+1;

            }
            else{
                e=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[][] A = {
                {1, 0, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        int B=3;


           int k=binSearch(A,B);

        System.out.println(k);
    }
}

