/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples;

import java.util.LinkedList;

/**
 *
 * @author psambamu
 */
public class AdjacencyLists {
    
  static  class Graph
    { int V;
     LinkedList<Integer> arr[] = null;
        Graph(int v)
        {
            this.V = v;
            
           
            arr = new LinkedList[V];
            for(int i=0;i<V;i++)
            {
                arr[i] = new LinkedList<Integer>();
            }
            
        }
    }
    
    static void addEdge(Graph graph, Integer src, Integer dest)
    {
        graph.arr[src].add(dest);
        
        graph.arr[dest].add(src);
    }
    
    static void printGraph(Graph graph)
    {
         System.out.println("size of array" + graph.V);
        for(int i=0;i<graph.V;i++)
        {
           
            System.out.print(i);
            for(Integer j : graph.arr[i])
            {
                System.out.print("--->" + j);
            }
             System.out.println();
        }
    }
    public static void main(String args[])
    {
          int V = 5; 
        Graph graph = new Graph(V); 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        // print the adjacency list representation of  
        // the above graph 
        printGraph(graph); 
    }
}
