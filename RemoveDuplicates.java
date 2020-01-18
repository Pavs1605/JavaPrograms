//putting in hashset
//https://practice.geeksforgeeks.org/problems/remove-duplicates/0

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
	     String val = br.readLine();
	      String finalVal="";
	     HashSet<String> hs = new HashSet<String>();
	     for(int j=0;j<val.length();j++)
	     {
	         String inChar = Character.toString(val.charAt(j));
	        
	         if(hs != null && !hs.contains(inChar))
	         {
	            hs.add(inChar);
	            finalVal += inChar;
	            
	         }
	         
	       
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
