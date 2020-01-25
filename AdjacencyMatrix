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
public class AdjacencyMatrix {
    
    
    
    public static class Graph{
    int adjMatrix[][] = null;
    int vertex ;
   Graph(int v)
   {
       this.vertex = v;
         
       adjMatrix = new int[vertex][vertex];
   
   }
    }
   
   public static void addEdge(Graph graph, int src, int dest)
   {
       graph.adjMatrix[src][dest] = 1;
       graph.adjMatrix[dest][src] = 1;
   }
   
   public static void printGraph(Graph graph)
   {
       for(int i=0;i<graph.vertex;i++)
       {
           System.out.print(i);
           for(int j=0;j<graph.adjMatrix[i].length;j++)
           {
               if(graph.adjMatrix[i][j] == 1)
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
