package com.monika.advance.Stack;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static String doubleCharacter(String s){
        Stack<Character> sta=new Stack();
        String sm="";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
           if(!sta.empty() && sta.peek()==ch){
               sta.pop();
           }
           else{

               sta.push(ch);
           }
        }
        int length=sta.size();
        if(length==0){
            return "";
        }
        else {
            for(int i=0;i<length;i++){
                sm=sm+sta.get(i);
            }
        }

        return sm;
    }
    public static void main(String[] args) {
        String s=doubleCharacter("abccbc");
        System.out.println(s);
    }
}
