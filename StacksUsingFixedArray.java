/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 //https://www.techiedelight.com/stack-implementation-in-java/
package com.samples;

import java.util.Enumeration;
import java.util.Stack;

/**
 *
 * @author psambamu
 */
public class StacksUsingArrays {
    
   
   static int arr[] = new int[10];
static int top = -1;    
    public static void main(String args[])
    {
      System.out.println("Push to stack");
       for(int i=0;i<10;i++)
       {
           pushToStack(arr,i);
       }
        displayStack(arr);
        
        System.out.println("Pop from stack");
        for(int i=0;i<2;i++)
        {
            popFromStack(arr);
        }
        
         displayStack(arr);
         
         
         System.out.println("Search in stack");
         searchInStack(arr,5);
         searchInStack(arr,1);
         searchInStack(arr,7);
         searchInStack(arr,10);
         
          System.out.println("peek in stack");
          peekInStack(arr);
    }
    
    public static void pushToStack(int arr[], int num)
    {   
        if(top == arr.length-1)
            System.out.println("Stack is full");
        else
        {
            top++;
            arr[top] = num;
        }
         
    }
    
       public  static void  popFromStack(int arr[])
    {
       top--;
      System.out.println("removed element" + arr[top]);
      arr[top] = -1;
        
    }
       
          public static void peekInStack(int arr[])
    {
     System.out.println("top most element" + arr[top]);
    }
          
             public static void searchInStack(int arr[], int num)
    {
      
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                System.out.println("Position of element num " + num + " is " + (i+1));
                break;
            }
        }
    }
             
     public static void displayStack(int arr[])
    {
     
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]);
        }
    
        
    }  
     
     public void size()
     {
         System.out.println("Size" + top+1);
     }
}


