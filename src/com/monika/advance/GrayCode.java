package com.monika.advance;

import java.util.ArrayList;
import java.util.Arrays;

public class GrayCode {

        public static ArrayList<Integer> createCode(int a,ArrayList<Integer> list){
            if(a==1){

                return list;
            }
            createCode(a-1,list);
            int size=list.size();
            for(int j=0;j<=a;j++,a--){
                int k= j*10+a;
                list.add(k);
            }
            return list;



    }
    public static void main(String[] args) {
        ArrayList<Integer> result=new ArrayList();
       result= createCode(2,result);
        System.out.println(result);
    }
}
