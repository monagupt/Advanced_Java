package StringPattern;

import java.util.Arrays;

public class BoringString {
    public static String sort(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);

        // Returning new sorted string
        return new String(ch);
    }
    public static int check(String s){
        int n=s.length();

        int oddMin = Integer.MAX_VALUE;
        int oddMax = Integer.MIN_VALUE;
        int evenMin = Integer.MAX_VALUE;
        int evenMax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          char currentChar=s.charAt(i);
            if(currentChar%2==0){
               if(evenMax<currentChar) {
                   evenMax=currentChar;
               }
               if(evenMin>currentChar){
                   evenMin=currentChar;
               }
            }
            else{
                if(oddMax<currentChar) {
                    oddMax=currentChar;
                }
                if(oddMin>currentChar){
                    oddMin=currentChar;
                }
            }
        }


        if(Math.abs(oddMax - evenMin) != 1){
            return 1;
        }
        if(Math.abs(evenMax - oddMin) != 1){
            return 1;
        }


//        if((((s.charAt(0))-'0')-(s.charAt(oddLength)-'0'))!=1){
//            return 1;
//        }
        return  0;
    }
    public static void main(String[] args) {
        String s="aab";
        int k=check(s);
        System.out.println(k);
    }
}
