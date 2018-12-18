import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
                int sizeArr = arr.length;
        System.out.println(sizeArr);
        int leftSideTotal = 0;
        int rightSideTotal = 0;
        int finalTotal = 0;
               for (int i = 0; i < sizeArr; i++) {


            for (int j = 0; j < sizeArr; j++) {
                 if(i == j && i + j == sizeArr-1)
                 {
                       rightSideTotal += arr[i][j];
                         leftSideTotal += arr[i][j];
                 }                   
               else if (i + j == sizeArr-1) {
                  
                    System.out.println("right cal :: i " + i +" j::"+ ""+j + " val::" +arr[i][j]);
                    rightSideTotal += arr[i][j];
                  
                } else if (i == j) {
                  
                  System.out.println("left cal::i+" + i + " j:::"+j + " val::" +arr[i][j]);
                    leftSideTotal += arr[i][j];
                   
                } else {
                    //System.out.println("none of the above");

                }

            }
        }
        System.out.println("left total " + leftSideTotal);
        System.out.println("right total " + rightSideTotal);
        finalTotal = Math.abs(leftSideTotal - rightSideTotal);
        System.out.println("finalTotal" + finalTotal);
        return finalTotal;



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
