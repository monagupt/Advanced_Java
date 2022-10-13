package com.monika.advance;

public class PubgGame {
    public static int gcd(int A, int B) {

        if(A==0){
            return B;
        }
        return gcd(B%A,A);
    }
    public static void main(String[] args) {
        int a[]={2,3,4};
        int firstGcd=gcd(a[0],a[1]);

        for(int i=2;i<a.length;i++){
            firstGcd=gcd(firstGcd,a[i]);
        }

    }
}
