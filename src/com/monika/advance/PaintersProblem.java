package com.monika.advance;

public class PaintersProblem {
//    public static  int Max(int arr[],int B){
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if(arr[i] > max)
//                max = arr[i];
//        }
//        return max*B;
//    }
    public static long Sum(int arr[],int B){
        long sum = 0;


        for (int i = 0; i < arr.length; i++) {

            sum+=arr[i];

        }
        return sum*B;
    }
    public  static  Boolean canExecute(long time, int painter, int[] arr, int B){
        long curr_time = 0;
        int curr_worker = 1;

        for(int i=0; i<arr.length; i++)
        {
            if(curr_time + ((long)arr[i] * B) <= time)
            {
                curr_time = curr_time + ((long)arr[i] * B);
            }
            else
            {
                curr_worker++;
                curr_time = (long)arr[i] * B;
            }
        }

        if(curr_worker > painter)
        {
            return false;
        }
        return true;
    }


    public static int paint(int A, int B, int[] C) {
        long max_element = Integer.MIN_VALUE;;
        for(int i = 0 ; i < C.length ; i++)
        {
            max_element = Math.max(max_element , C[i]);
        }
        long  s=max_element*B;
        long e=Sum(C,B);
        long ans=0;

        while(s<=e){
            long mid=(s+e)>>1;
            if(canExecute(mid,A,C,B)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return (int)((ans) % 10000003);
    }

    public static void main(String[] args) {
        int A = 1;
        int B = 1000000;
        int C []= {1000000 ,1000000};

      int ans=  paint(A,B,C);
        System.out.println(ans);
    }
}
