package com.monika.advance;

public class LargestCoPrimeDivisor {
    public static int gcd(int A, int B) {

        if(A==0){
            return B;
        }
        return gcd(B%A,A);
    }
    public static void main(String[] args) {
        int A=2;
        int B=3;
        while (gcd(A,B)!=1)
        {
          A=A/gcd(A,B);
        }
        System.out.println(A);

    }

}
