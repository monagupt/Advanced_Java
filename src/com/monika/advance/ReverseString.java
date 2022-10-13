package com.monika.advance;

public class ReverseString {
    public static void main(String[] args) {
        String str="Mona";
        int s=0;
        int e=str.length()-1;

        //String str1="";
        while(e>=0){
            str=str.charAt(s)+str;
            s++;
            e--;

        }
        System.out.println(str);
    }
}
