//Put in hashmap with counts while iterating array - O(n)
// sort based on hashMap values - put in a linkedlist and then sort-  O(n)
// get the very first element - o(1)
// iterate hashmap to check if value is equal to max element, if matches pick it up and put in a list, if does not match, ignore the element
// sort the list -  O(n)
//pick up the first element of the list - o(1)

//Time to execute - 0.11

//https://practice.geeksforgeeks.org/problems/maximum-occuring-character/0


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
	     String str = br.readLine();
	     HashMap<String,Integer> hm = new HashMap<String,Integer>();
	     for(int j=0;j<str.length();j++)
	     {
	         char ch = str.charAt(j);
	         String newSt = Character.toString(ch);;
	         if(hm != null && hm.containsKey(newSt))
	         {
	             int count = hm.get(newSt);
	             hm.put(newSt,count+1);
	         }
	         else 
	         {
	             hm.put(newSt,1);
	         }
	     }
	      List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
	     
	     Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
	        
	        public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2 )
	        {
	               return (o1.getValue()).compareTo(o2.getValue()); 
	        }
	     });
	     
	           Collections.reverse(list);
	    
	      HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
          //  System.out.println(aa.getKey() + ":::" + aa.getValue());
            temp.put(aa.getKey(), aa.getValue()); 
        }
   
         
	     ArrayList<String> strFreq = new ArrayList<String>();
	     int maxValue=0;
	      for(String charVal : temp.keySet())
	     {
	         
	         maxValue = temp.get(charVal);
	       break;
	     }
	     
	     for(String charVal : temp.keySet())
	     {
	         
	         Integer val = temp.get(charVal);
	         if(val == maxValue)
	         strFreq.add(charVal);
             else
	         break;
	         
	     }
	     
	     Collections.sort(strFreq);
	     
	     System.out.println(strFreq.get(0));
	     
	 }
	 }
	 catch(Exception e)
	 {
	  e.printStackTrace();
	 }
	 }
}
