package com.monika.advance.TwoPointers;

import java.util.HashMap;

public class GivenSubArraySum {
    public static int sumArray(int A[],int B){

        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i< A.length;i++){
            int feq= hm.getOrDefault(A[i],0);{
                hm.put(A[i],feq+1);
            }
        }
        System.out.println(hm);
        int count=0;
       for(int k:hm.keySet()){
         int m=B-k;
           System.out.println(m);
           if(hm.get(m)>0){
               count++;
           }
       }
        return count;
    }
    public static void main(String[] args) {
        int A[]={1, 5, 3, 4, 2};
        int B=3;
        int k=sumArray(A,B);
        System.out.println(k);
    }
}
