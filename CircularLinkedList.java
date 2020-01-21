/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples;

/**
 *
 * @author psambamu
 */
public class CircularLinkedList {

    Node head;
    Node tail;
    public static class Node {

        int data;
        Node next;
        boolean visited = false;
        public Node(int data) {
            this.data = data;
        }
    }
    
    public static void main(String args[])
    {
        CircularLinkedList cll = new CircularLinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        
        cll = add(cll,n1);
       
        cll = add(cll,n2);
       
        cll = add(cll,n3);
  
        cll = add(cll,n4);
     
        cll = add(cll,n5);
        
        print(cll);
        
        System.out.println("Adding to the beginning");
        cll = addBeginning(cll, new Node(7));
         print(cll);
         
             System.out.println("Adding to the end");
        cll = addEnd(cll, new Node(8));
         print(cll);
         
         System.out.println("Adding to a position");
        cll = addAfterPos(cll,3, new Node(9));
         print(cll);
         
          System.out.println("Deleting from beginning");
        cll = deleteFromHead(cll);
         print(cll);
         
         System.out.println("Deleting from end");
        cll = deleteFromEnd(cll);
         print(cll);
         
         System.out.println("Deleting from pos");
        cll = deleteFromPos(cll, 3);
         print(cll);
    }
    
    public static CircularLinkedList add(CircularLinkedList cll, Node n1)
    {
      Node head = cll.head;
        
       if(head == null)
       {
           head = n1;
           n1.next = head;
           cll.head = n1;
       }
       else
       {
           Node temp = head;
          //  Node headVal = head;
          //break link of temp 
          
            do
            {
                temp = temp.next;
            }while(temp.next != head);
            
            //Node temp2 = temp.next;
            temp.next = n1;
            n1.next = head;
           
       }
        
        return cll;
    }
    
    public static void print(CircularLinkedList cll)
    {
        Node head = cll.head;
        Node travNode = head;
        if(travNode != null)
        {
        do
        {
            System.out.println("Element ::" + travNode.data + " next pos ::" + travNode.next);
          travNode = travNode.next;   
        }while(travNode != head);
        
      //  System.out.println("Element ::" + travNode.data + " next pos ::" + travNode.next);
        }
    }
    
    public static CircularLinkedList addBeginning(CircularLinkedList cll, Node n1)    
    {
        Node head = cll.head;
        Node temp = cll.head;
           Node travNode = head;
        do
        {
          
          travNode = travNode.next;   
        }while(travNode.next != head);
        
        
        travNode.next = n1;
        n1.next = head;
        cll.head = n1;
        
        return cll;
    }
    
    
    public static CircularLinkedList addEnd(CircularLinkedList cll, Node n1)    
    {
        Node head = cll.head;
        
           Node travNode = head;
        do
        {
          
          travNode = travNode.next;   
        }while(travNode.next != head);
        
        
       Node temp = travNode;
       temp.next = n1;
       n1.next = head;
       
        
        return cll;
    }
    
     public static CircularLinkedList addAfterPos(CircularLinkedList cll, int pos, Node n1)    
    {
        Node head = cll.head;
        int count =0;
           Node travNode = head;
        do
        {
          
          travNode = travNode.next;  
          count ++;
        }while(pos != count);
        
        
       Node temp = travNode;
   
       n1.next = travNode.next.next;
           temp.next = n1;
       
       
        
        return cll;
    }
     
     public static CircularLinkedList deleteFromHead(CircularLinkedList cll)
     {
         Node head = cll.head;
         Node temp = head.next;
         Node travNode = head;
         do
         {
             travNode = travNode.next;
         }while(travNode.next != head);
         
         cll.head = temp;
         travNode.next = cll.head;
         
         return cll;
     }
     
      public static CircularLinkedList deleteFromEnd(CircularLinkedList cll)
     {
         Node head = cll.head;
         
         Node travNode = head;
         do
         {
             travNode = travNode.next;
         }while(travNode.next.next != head);
         
         Node temp = travNode;
         
         travNode.next.next = null;
         temp.next = cll. head;
         
         
         
         return cll;
     }
      
      public static CircularLinkedList deleteFromPos(CircularLinkedList cll, int pos)
     {
         Node head = cll.head;
         int count=0;
         Node travNode = head;
         do
         {
             travNode = travNode.next;
             count ++;
         }while(count != pos-1);
         
         Node temp = travNode;
         temp.next = temp.next.next;
         return cll;
       
     }
    
}
