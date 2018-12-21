import java.io.*;

import java.math.*;

import java.security.*;

import java.text.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.

    static void staircase(int n) {
        for(int i=0;i<=n;i++)
        { 
    
            for(int j=2*(n-i); j>=0; j--) 
                       { 
                           // printing spaces 
                           System.out.print(" "); 
                       } 
                        
                       //  inner loop to handle number of columns 
                       //  values changing acc. to outer loop 
                       for(int j=0; j<=i; j++) 
                       { 
                           // printing stars 
                           System.out.print("* "); 
                       } 
                         
                       // ending line after each row 
                       System.out.println(); 
        }
    
        for(int i=1;i<=n;i++)
        { 
     System.out.print("i value ::" + i);
        
          
         for(int j=1;j<=i && j>0;j++)
         {
             System.out.print("j value ::" + j);
         }
            
            System.out.println();
        }


    }


    // Complete the plusMinus function below.
      static void plusMinus(int[] arr) {
          double countPos =0;
          double countNeg =0;
          double countZero=0;
          int arrSize = arr.length;
          for(int i=0;i<arrSize;i++)
          {
              if(arr[i] == 0)
                  countZero ++;
              if(arr[i] < 0)
               countNeg ++;
               if(arr[i] > 0)
               countPos++;
          }
          double fracPos = (double)(countPos/arrSize);
          System.out.println( "value is" +fracPos);
          double fracNeg = countNeg/arrSize;
          double fracZero = countZero/arrSize;

      System.out.println(fracPos);
      System.out.println(fracNeg);
      System.out.println(fracZero);
      

      }


    static int diagonalDifference(int[][][] arr) {
        int sizeArr = arr.length;
        System.out.println(sizeArr);
        int leftSideTotal = 0;
        int rightSideTotal = 0;
        int finalTotal = 0;

        double div = sizeArr/2;
        int val = (int)Math.ceil(div);
        
        for (int i = 0; i < sizeArr; i++) {


            for (int j = 0; j < sizeArr; j++) {
                if (i == j) {
                    if(i == val) {
                        leftSideTotal += arr[i][i][i];
                        rightSideTotal += arr[i][i][i];
                    }
                    else
                    {
                    System.out.println("left cal::i+" + i + " j:::" + j + " val::" + arr[i][j]);
                    
                    }

                } else if (i + j == sizeArr - 1) {

                    System.out.println("right cal :: i " + i + " j::" + "" + j + " val::" + arr[i][j]);
                 //   rightSideTotal += arr[i][j];

                } else {


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
      

        int[][][] arr = {{ { 1, 2,3 }, {1,2,3 },{1,2,3} }};

        //int result = diagonalDifference(arr);
        int[] arrNew={-2,-1,0,1,2};
       //plusMinus(arrNew);
        staircase(arrNew.length);
    }
}
