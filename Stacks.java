/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 //stacks implementation -https://www.geeksforgeeks.org/stack-class-in-java/
package com.samples;

import java.util.Enumeration;
import java.util.Stack;

/**
 *
 * @author psambamu
 */
public class StackUsingJavaClass {
    
    public static void main(String[] args)
    {
        Stack<Integer> stackVar = new Stack<Integer>();
           for(int i=1;i<=10;i++)
               pushToStack(stackVar,i);
              
        displayStack(stackVar);
        
        for(int i=0;i<=2;i++)
        {
            popFromStack(stackVar,i);
        }
        
          displayStack(stackVar);
          
          peekInStack(stackVar);
          
          searchInStack(stackVar,6);
          searchInStack(stackVar,7);
          searchInStack(stackVar,2);
          searchInStack(stackVar,8);
    }
    
    public static void pushToStack(Stack stackVar, Integer num)
    {
       stackVar.push(num);
       
        
    }
    
       public  static void  popFromStack(Stack stackVar, Integer num)
    {
       stackVar.pop();
        
    }
       
          public static void peekInStack(Stack stackVar)
    {
     Integer ele = (Integer)stackVar.peek();
       System.out.println("Element on stack ::" + ele);
    }
          
             public static void searchInStack(Stack stackVar, Integer num)
    {
       Integer pos = stackVar.search(num);
       System.out.println("Element " + num + " position ::" + pos);
       
        
    }
             
     public static void displayStack(Stack stackVar)
    {
     
        Enumeration enu = stackVar.elements();
        System.out.println("Stack elements");
        while(enu.hasMoreElements())
            System.out.println(enu.nextElement());
                    
            

        
    }
                
}
