package com.monika.advance;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[]={-4,3};
        int b[]={-2,-2};
        int m=a.length;
        int n=b.length;
        int c[]=new int[m+n];
        int i=0,j=0;
        while (i<m && j<n){
            if(a[i]<b[j]){

                c[i+j]=a[i];
                i++;
            }
            else {

                c[j+i]=b[j];
                j++;
            }
        }
        while (i<m){
            c[i+n]=a[i];
            i++;
        }

        while (j<n){
            c[j+m]=b[j];
            j++;
        }
        System.out.println(Arrays.toString(c));
    }
}
