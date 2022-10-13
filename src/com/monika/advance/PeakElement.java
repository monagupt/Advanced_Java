package com.monika.advance;

public class PeakElement {
    public  static int solve(int A[]){
        int s=0;
        int e=A.length;
        int ans=-1;

        while(s<=e)
        {
            int  mid=(s+e)/2;


            if(mid<e && A[mid] > A[mid+1])
            {
                System.out.println(s +"11");
                ans=mid+1;
                e=mid;
            }
            else if(mid>s && A[mid] < A[mid-1])
            {
                System.out.println(s +"2");
                ans=mid;
            }
            else if(A[mid]>A[s]){
                System.out.println(s +" "+e);
                s=mid+1;
            }
            else{

                e=mid-1;
            }
        }
        System.out.println(ans);
        return A[s];
    }

    public static void main(String[] args) {
        int []A={5, 17, 100, 11};
        int k=solve(A);
        System.out.println(k);
    }
    }

