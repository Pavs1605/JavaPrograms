/****************************************************
Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3

https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0

Time complexity is o,n*n);
************************************************************/
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
	     String a[] = br.readLine().split(" ");
	     
	     for(int j=0;j<arrSize;j++)
	     {
	         int count=0;
	         for(int k=j+1;k<arrSize;k++)
	         {
	             if(Integer.parseInt(a[j]) >= Integer.parseInt(a[k]))
	             count++;
	         }
	         
	         if(count == arrSize-j-1)
	        {
	         System.out.print(a[j] + " ");
	        }
	        
	     }
	     System.out.println();
	 }
	 }
	 catch(Exception e)
	 {
	  e.printStackTrace();
	 }
	 }
}
