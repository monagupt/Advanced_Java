package com.monika.advance.Stack;

import java.util.Stack;

public class CalculateSign {
    public static  boolean calculateSign(String A){
        Stack <Boolean> sta=new Stack<Boolean>();
        sta.push(true);
        int i=0;
        while (i<A.length()){
            if(A.charAt(i)=='+' || A.charAt(i)=='-'){
                continue;
            }


        }
    }
    public static void main(String[] args) {
        boolean t=calculateSign("-(a+b+c)");
    }
}
