package com.monika.advance.TwoPointers;

import java.util.Arrays;

public class PairWithGivenDiffernce {
    public static int[] sumArray(int A[],int B){
        System.out.println(A.length);
        int N= A.length-1;
      int left=0;
      int right=0;
      int sum=A[0];
      int a[];
       while (right<N && left<=right){
          if(sum==B){
              System.out.println("1"+left);
              System.out.println(right);
              a= new int[(right-left)+1];
              int j=0;
              System.out.println(A.length);
              for(int i=left;i<=right;i++){
                  a[j]=A[i];
                  left++;
                  j++;
              }
              return a;
          } else if (sum<B) {
              right++;
              if(right<N){
                  sum=sum+A[right];
              }
          }
          else{
              sum=sum-A[left];
              left++;


              if(left<N && left>right){
                  right++;
                  sum+=A[right];
              }
          }

       }

        return new int[]{-1};
    }
    public static void main(String[] args) {
        int A[]={ 1, 1000000000 };

        int B=1000000000;

       int []k=sumArray(A,B);
        System.out.println(Arrays.toString(k));
    }
}
