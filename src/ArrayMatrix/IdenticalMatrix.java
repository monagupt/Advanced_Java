package ArrayMatrix;


import java.util.Arrays;

public class IdenticalMatrix {
    public static  int solve(int [][]arr) {
        int r = arr.length;
        int flag = 0;
        int sum = 0;
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (i == j) {
                    sum = sum + arr[i][j];
                }
                if ((i + j) == (arr.length - 1)) {
                    sum = sum + arr[i][j];
                }



            }

        }
        return sum;
    }
    public static void main(String[] args) {

        int[][] arr = { { 1, 3 }, { 3, 1 } };
        int m= solve(arr);
        System.out.println(m);
    }
}
