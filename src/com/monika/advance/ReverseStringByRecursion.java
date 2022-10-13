package com.monika.advance;

import java.util.Scanner;

public class ReverseStringByRecursion {
    public  static String solve(String s){

        if(s.length()==0){
            return s;
        }
        System.out.println(s.substring(1));
        //System.out.println(s.charAt(0));
        return solve(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str= solve(s);
        System.out.println(str);
    }
}
