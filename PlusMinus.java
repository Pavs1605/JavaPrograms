import java.io.*;

import java.math.*;

import java.security.*;

import java.text.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

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


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      

        int[][][] arr = {{ { 1, 2,3 }, {1,2,3 },{1,2,3} }};

        //int result = diagonalDifference(arr);
        int[] arrNew={-2,-1,0,1,2};
       plusMinus(arrNew);
       
    }
}
