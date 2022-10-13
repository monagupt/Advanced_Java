package com.monika.advance;

public class AllocateBooks {
    public  static  Boolean canExecute(long time, int[] arr, int B){
        long curr_time = 0;
        int curr_worker = 1;

        for(int i=0; i<arr.length; i++)
        {
            if(curr_time + ((long)arr[i]) <= time)
            {
                curr_time = curr_time + ((long)arr[i]);
            }
            else
            {
                curr_worker++;
                curr_time = (long)arr[i];
            }
        }

        if(curr_worker > B)
        {
            return false;
        }
        return true;
    }
        public static int solve(int[]C,int B){
        if(B>C.length){
            return -1;
        }
        long max_element = Integer.MIN_VALUE;
            long sum = 0;
        for(int i = 0 ; i < C.length ; i++)
        {
            max_element = Math.max(max_element , C[i]);
            sum+=C[i];
        }
        long  s=max_element;
        long e=    sum;
        long ans=0;
            while(s<=e){
                long mid=(s+e)>>1;
                if(canExecute(mid,C,B)){
                    ans=mid;
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
         return (int) ans;
    }
    public static void main(String[] args) {
        int B=2;
        int A[]={12, 34, 67, 90};
        int k=solve(A,B);
        System.out.println(k);
    }
}
