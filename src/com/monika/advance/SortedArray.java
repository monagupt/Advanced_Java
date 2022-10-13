package com.monika.advance;

import java.util.Arrays;

public class SortedArray {
    public static  int search(final int[] A, int B) {
        int s=0;
        int e=A.length-1;


        while(s<=e){

         int mid= s+(e-s)/2;
            if(A[mid]==B){
                return mid;
            }
            else if(A[mid]>=A[s]){
                if(A[mid]>=B && A[s]<=B){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(A[mid]<=B && A[e]>=B){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }

        return -1;
    }
    public static int[] generateLps(String A){
        int n=A.length();
        int lps[]=new int[n];
        lps[0]=0;
        int x=0;
        for(int i=1;i<n-1;i++){
            x=lps[i-1];
            while(A.charAt(i)!=A.charAt(x)){

                if(x==0){
                    x=-1;
                    break;
                }
                x=lps[x-1];
            }
            lps[i]=x+1;
        }

        return lps;
    }

    public static void main(String[] args) {
       int [] A={180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177};

        int B =42;
        String s="111";
        String m="111";
        String k=s+'$'+m+m;
        int lps[]=generateLps(k);
        System.out.println(Arrays.toString(lps));
        int count=0;
        for(int i=0;i<lps.length;i++){
            if(lps[i]==s.length()){
                count ++;
            }
        }
       System.out.println(count);
//        int k=search(A,B);
//        System.out.println(k);
    }
}
