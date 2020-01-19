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
public class DoublyLinkedList {
    Node head;
    
  public static class Node
    {
        Node next;
        Node previous;
        int data;
        
        Node(int d)
        {
            data =d;
        }
    }
  
  public static void main(String args[])
  {
      DoublyLinkedList dll = new DoublyLinkedList();
      
      Node n1 = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(3);
      Node n4 = new Node(4);
      Node n5 = new Node(5);
      Node n6 = new Node(6);
     
           
    dll.head = n1;
    n1.previous = null;
    n1.next = n2;
    
    n2.next = n3;
    n2.previous = n1;
    
    n3.next = n4;
    n3.previous = n2;
    
    n4.next = n5;
    n4.previous = n3;
    
    n5.next = n6;
    n5.previous = n4;
    
    
    n6.previous = n5;
    
    n2.next = n3;
    n2.previous = n1;
    
      printList(dll);
      
      System.out.println("Insert at head");
      Node n0 = new Node(0);
      printList(insertAtHead(dll,n0));
      
      
       System.out.println("Insert at end");
      Node n7 = new Node(7);
      printList(insertAtEnd(dll,n7));
      
      
       System.out.println("Insert at pos 2");
      Node n8 = new Node(8);
      printList(insertAfterSomeNode(dll,n8,2));
      
       System.out.println("Delete head");
      printList(deleteFromStart(dll));
      
      
       System.out.println("Delete from end");
      printList(deleteFromEnd(dll));
      
        System.out.println("Delete from pos 2");
      printList(deleteFromPos(dll,2));
  } 
  
  public static void printList(DoublyLinkedList dll)
  {
      if(dll != null)
      {
         Node travNode = dll.head;
         while(travNode != null)
         {
             System.out.println("Previous:: " + travNode.previous + " Data:: " + travNode.data + " Next:: " + travNode.next);
             travNode = travNode.next;
         }
         
      }
  }
  
  public static DoublyLinkedList insertAtHead(DoublyLinkedList dll, Node n)
  {
      Node temp = dll.head;
      
      dll.head = n;
      n.previous = null;
      n.next = temp;
      
      temp.previous = n;
      return dll;
  }
 
    public static DoublyLinkedList insertAtEnd(DoublyLinkedList dll, Node n)
  {
     Node traverseNode = dll.head;
     while(traverseNode.next != null)
     {
         traverseNode = traverseNode.next;
       //  System.out.println(traverseNode.data);
     }
     
     Node temp = traverseNode;
     n.next = null;
     n.previous = temp;
     
     temp.next = n;
     
             
      return dll;
  }
    
    
     public static DoublyLinkedList insertAfterSomeNode(DoublyLinkedList dll, Node n, int pos)
  {
     Node traverseNode = dll.head;
     int count =0;
     while(traverseNode != null)
     {
      if(count == pos)
      {
          Node temp = traverseNode;
          
          
          
          n.previous = temp;
          n. next = temp.next;
          
          temp.next = n;
          
          traverseNode.next.previous = n;
          traverseNode = traverseNode.next;
          count++;
      }
      else
      {
          traverseNode = traverseNode.next;
          count ++;
      }
     }
     
             
      return dll;
  }
     
     
     public static DoublyLinkedList deleteFromStart(DoublyLinkedList dll)
     {
         Node travNode = dll.head;
         
         Node nextNode = travNode.next;
         
         nextNode.previous = null;         
         dll.head = nextNode;
         
         return dll;
     }
     
     
     public static DoublyLinkedList deleteFromEnd(DoublyLinkedList dll)
     {
         Node travNode = dll.head;
         
         while(travNode.next != null)
         {
           travNode = travNode.next;  
         }
         
         
         
         Node prev = travNode.previous;
        
         prev.next = null;
         
         return dll;
         
     }
     
     
        public static DoublyLinkedList deleteFromPos(DoublyLinkedList dll, int pos)
     {
         Node travNode = dll.head;
         int count =0;
         while(travNode != null)
         {
             if(count == pos)
             {
               
                 Node prevNode = travNode.previous;
                 Node nextNode = travNode.next.next;
                 
                 
                prevNode.next = nextNode;
                nextNode.previous = prevNode;
                
                travNode = nextNode;
               travNode = travNode.next;
              
                 
                 count++;
                     
              
             }
             else
             {
           travNode = travNode.next;  
           count ++;
             }
         }
         
         
         
         return dll;
         
     }
  
}
