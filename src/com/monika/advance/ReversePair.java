package com.monika.advance;

import java.util.Arrays;

public class ReversePair {
    public static  long inversioncount=0;
    public static void merge(int []A,int s,int mid,int e){
        int temp[]=new int[A.length];
        int i=0;
        int j=0;
        int k=s;
        System.out.println("mid"+mid);
        int n1 = mid - s + 1;
        int n2 = e - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int p = 0; p < n1; p++)
            L[p] = A[s + p];
        for (int q = 0; q < n2; q++)
            R[q] = A[mid + 1 + q];
        System.out.println(Arrays.toString(L));
        System.out.println(Arrays.toString(R));

        i=0;

        while (i<n1 && j<n2) {
            if (L[i] > 2*R[j]) {
                inversioncount+=(n1-i);
                j++;
            } else {

                i++;
            }
        }

        i=0;
        j=0;
        while (i<n1 && j<n2) {
            if (L[i] < R[j]) {
                A[k] = L[i];
                k++;
                i++;
            } else {
                A[k] = R[j];
                k++;
                j++;

            }
        }


        while(j<n2){
            A[k++]=R[j++];

        }
        while(i<n1){
            A[k++]=L[i++];


        }





    }
    public  static  void mergeSort(int []A,int s,int e){

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

        int A[]={ 2000000000, 2000000000, -2000000000};
        int s=0;
        int e=A.length-1;
         mergeSort(A,s,e);
        System.out.println("kkk"+inversioncount%1000000007);

    }
}
