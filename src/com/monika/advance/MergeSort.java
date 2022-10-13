package com.monika.advance;

import java.util.Arrays;

public class MergeSort {
    public static boolean compare(int a,int b){
      String m=String.valueOf(a);
      String n=String.valueOf(b);
      String s1=m+n;
      String s2=n+m;
      if (s1.compareTo(s2)>0)
      {
          return true;
      }
        return false;
    }
    public static void merge(int []A,int s,int mid,int e){

        int temp[]=new int[A.length];
        int i=s;
        int j=mid+1;
        int k=s;


        /* Create temp arrays */
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        /*Copy data to temp arrays*/
//        for (int p = 0; p < n1; ++p)
//            L[p] = A[s + p];
//        for (int q = 0; q < n2; ++q)
////            R[q] = A[mid + 1 + q];
//        System.out.println(Arrays.toString(L));
//        System.out.println(Arrays.toString(R));
        while (i<=mid && j<=e) {
            if (compare(A[i],A[j])) {
                temp[k] = A[i];
                k++;
                i++;
            } else {
                temp[k] = A[j];
                k++;
                j++;
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

       for(int t=s;t<=e;t++){
           A[t]=temp[t];
       }
    }
    public static void mergeSort(int []A,int s,int e){
        if(s>=e) {
            return;
        }
     //   System.out.println(e);
        int mid =(s+e)/2;

            mergeSort(A, s, mid);
            mergeSort(A, mid + 1, e);
           merge(A,s,mid,e);


    }
    public static void main(String[] args) {
        int A[]={3, 30, 34, 5, 9};
        int s=0;
        int e=A.length-1;
         mergeSort(A,s,e);
         String s1="";
         for (int i=0;i<A.length;i++)
         {
             String temp=String.valueOf(A[i]);
             s1=s1.concat(temp);
         }
        System.out.println(s1);

    }
}
