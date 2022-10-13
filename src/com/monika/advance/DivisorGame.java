package com.monika.advance;

public class DivisorGame {
    public static int gcd(int A, int B) {

        if(A==0){
            return B;
        }
        return gcd(B%A,A);
    }
    public static void main(String[] args) {
        int A=6;
        int B=1;
        int C=4;
        int cGd=gcd(B,C);
        int LCM=(B*C)/cGd;
        long ans=A/LCM;
        System.out.println((int)ans);
    }
}
