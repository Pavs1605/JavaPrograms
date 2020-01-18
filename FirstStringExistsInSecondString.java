//https://practice.geeksforgeeks.org/problems/remove-character/0

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
	     String s1 = br.readLine();
	     String s2 = br.readLine();
	     
	     String finalVal = "";
	     for(int j=0;j<s1.length();j++)
	    {
	        String temp = Character.toString(s1.charAt(j));
	        if(s2.indexOf(temp) < 0)
	        finalVal += temp;
	    }
	    
	System.out.println(finalVal);
	    
	 }
	 }
	 catch(Exception e)
	 {
	  e.printStackTrace();
	 }
	 }
}
