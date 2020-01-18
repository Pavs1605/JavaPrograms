/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 //list of insertion/deletion in linkde list
package com.samples;

/**
 *
 * @author psambamu
 */
public class LinkedLists {

    Node head;

    static class Node {

        Node next;
        int data;

        Node(int d) {
            data = d;
        }

    }

    public static void main(String args[]) {
        //creating linked list
        LinkedLists list = new LinkedLists();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        list.head = n1;
        n1.next = n2;
        n2.next = n3;

        printList(list);

        //inserting node at beginning of list
        Node headVar = new Node(10);

        list.head = headVar;
        headVar.next = n1;
        printList(list);

        //inserting node at end of list
        Node n5 = new Node(15);

        System.out.println("Insert at end of list");
        int lengthLL = 0;
        if (list != null) {
            Node travNode = list.head;
            if (travNode != null) {

                while (travNode.next != null) {
                    // System.out.println("Data :: " + travNode.data + ",Address ::" + travNode.next );
                    travNode = travNode.next;
                    lengthLL++;

                }

                travNode.next = n5;

            }
        }

        printList(list);

        System.out.println("Insert in the middle of list at position 3");
        lengthLL = 0;
        Node n6 = new Node(20);
        if (list != null) {
            Node travNode = list.head;
            Node previous = null;

            while (travNode != null) {
                // System.out.println("Data :: " + travNode.data + ",Address ::" + travNode.next );
                if (lengthLL != 3) {
                    previous = travNode;
                    travNode = travNode.next;
                    lengthLL++;
                } else {
                    Node nextNode = travNode;
                    travNode = n6;
                    travNode.next = nextNode;
                    previous.next = travNode;
                    lengthLL++;

                }

                System.out.println(travNode != null ? travNode.data : "");
            }
        }

        printList(list);

         //Deleting a node from beginning of a linked list
        System.out.println("Deleting head node");
        Node travNode = list.head;

        travNode = travNode.next;
        list.head = travNode;

        printList(list);

        //deletimg last node
        System.out.println("Deleting last node");
        if (list != null) {
            travNode = list.head;

            while (travNode.next.next != null) {
                // System.out.println("Data :: " + travNode.data + ",Address ::" + travNode.next );
                travNode = travNode.next;
                lengthLL++;

            }

            travNode.next = null;

        }
        printList(list);

                   //deleting from a position in a node
        //deletimg last node
        System.out.println("Deleting from middle of a node");
        if (list != null) {
            travNode = list.head;
            lengthLL = 0;

            while (travNode != null) {
                // System.out.println("Data :: " + travNode.data + ",Address ::" + travNode.next );
                Node previous = travNode;
                System.out.println("previous" + previous.data);
                if (lengthLL != 1) {
                    travNode = travNode.next;
                    lengthLL++;
                } else {
                    System.out.println("In else block");
                    System.out.println(travNode.data);                                   
                    travNode = travNode.next.next;
                    System.out.println(travNode.data);
                    previous.next = travNode;
                    //System.out.println(previous.next.data);
                    lengthLL++;
                }

            }

        }
        printList(list);

    }

    public static void printList(LinkedLists list) {
        //traversing and printing list
        //getting length also
        int lengthLL = 0;
        if (list != null) {
            Node travNode = list.head;
            if (travNode != null) {

                while (travNode != null) {
                    System.out.println("Data :: " + travNode.data + ",Address ::" + travNode.next);
                    travNode = travNode.next;
                    lengthLL++;
                }
            }
        }

        System.out.println(lengthLL);

    }

}
