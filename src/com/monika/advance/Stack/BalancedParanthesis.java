package com.monika.advance.Stack;

import java.util.Arrays;
import java.util.Stack;

public class BalancedParanthesis {
    public static boolean Solve(char [] ch){
        Stack<Character> st=new Stack();
        for(char x:ch){
            if (x=='}') {

                if(st.empty()){
                    return false;
                }
                else {
                    st.pop();
                }
            }
            else if (x==')') {

                if(st.empty() ){
                    return false;
                }
                else {
                    st.pop();
                }
            }
            else if (x==']') {

                if(st.empty() ){
                    return false;
                }
                else {
                    st.pop();
                }
            }
            else {
                st.push(x);
            }

            }

        return st.empty();
    }
    public static void main(String[] args) {

        String s="({)}";
        char [] ch=s.toCharArray();
        System.out.print(Arrays.toString(ch));
       boolean k=Solve(ch);
        System.out.println(k);
    }


}
