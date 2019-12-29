import java.util.*;
import java.lang.*;
import java.io.*;
class Test
 {
	public static void main (String[] args)
	 {
	 //code
	 try{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String testcases = br.readLine();
//	 System.out.println(testcases);
	 
	 int val = Integer.parseInt(testcases);
	 
	 for(int i=0;i<val;i++)
	 {
	     String newVal = br.readLine();
	     int arrSize = Integer.parseInt(newVal.split(" ")[0]); 
	     int rotations = Integer.parseInt(newVal.split(" ")[1]);
	     
	    // int exisArr = new int[arrSize];
	     String valProv[] = (br.readLine()).split(" ");
	     for(int j=0;j<arrSize;j++)
	     {
	         int sum = j+rotations;
	      //   System.out.println(sum);
	         if(sum < arrSize)
	        {
	         System.out.print(valProv[sum]);
	         System.out.print(" ");
	        }
	     
	     }
	     
	            for(int k=0;k<rotations;k++)
	            {
	                System.out.print(valProv[k]);
	                   System.out.print(" ");
	                
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
