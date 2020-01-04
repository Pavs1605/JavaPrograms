/****************************************************************************
https://practice.geeksforgeeks.org/problems/equilibrium-point/0
//Example:
Input:
2
1
1
5
1 3 5 2 2

Output:
1
3

Explanation:
Testcase 1: Since its the only element hence its the only equilibrium point.
Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).

Below code takes O(n*n) time complexity
*******************************************************************************/

import java.util.*;
import java.lang.*;
import java.io.*;
class Test
 {
	public static void main (String[] args)
	 {
	 try{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String testCases = br.readLine();
	 int testVal = Integer.parseInt(testCases);
	 
	 for(int i=0;i<testVal;i++)
	 {
	   int arrSize = Integer.parseInt(br.readLine());
	   String val = br.readLine();
	   String arrEle[]= val.split(" ");
	   int newVal[] = new int[arrSize];
	   
	   int pos =0;
	   for(int j=1;j<arrSize;j++)
	   {
	     int leftSum = sum(0,j-1,arrEle);
	    // System.out.println("left sum" + leftSum);
	     int rightSum = sum(j+1,arrSize-1,arrEle);
	    // System.out.println("right sum" + rightSum);
	     if(leftSum == rightSum)
	     {
	      pos = j+1;
	         break;
	     }
	   }
	   
	   if(arrSize == 1)
	   pos = 1;
	   
	  
	   if(pos == 0)
	   pos = -1;
	   
	   
	   System.out.println(pos);
	   
	 }
	 }
	 catch(Exception e)
	 {
	  e.printStackTrace();
	 }
	 }
	 
	 public static int sum(int start, int end, String arr[])
	 {
	     int sumVal=0;
	     for(int i=start;i<=end;i++)
	     {
	         sumVal += Integer.parseInt(arr[i]);
	     }
	     
	     
	     return sumVal;
	     
	     
	 }
}
