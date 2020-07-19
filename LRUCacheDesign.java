/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedLists.LRUDesign;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheDesign {
    static NodeDLL head, tail;
    static HashMap<Integer,NodeDLL> hm = new HashMap<Integer,NodeDLL>();
    static int cacheSize = 4;
    
    public static void main(String args[])
    {
        int arr[] = { 10,20,10,30,40,50,30,40,60,30};
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                swapData(arr[i]);
                      System.out.println(arr[i] + ":: Hit" + ", Head :: " + head.data + " ,Tail :: " + tail.data + " LL ::" + printDLL(head));   
            }
            else
            {
                insert(arr[i]);
                System.out.println(arr[i] + ":: Miss"+ ", Head :: " + head.data + " ,Tail :: " + tail.data + " LL ::" + printDLL(head));
            }
        }
    }
    
    public static String printDLL(NodeDLL head)
    {
        NodeDLL curr = head;
        String list="";
        while(curr != null)
        {
            list = list + curr.data + "-->";
            curr = curr.next;
        }
        
        return list;
    }
    
    
    public static void insert(int data)
    {
        if(hm.isEmpty())
        {
            NodeDLL n = new NodeDLL(data);
            head = n;
            tail = n;
            hm.put(data,n);
        }
        else if(hm.size() < cacheSize)
        {
            insertUpdateHead(data);
        }
        else if(hm.size() == cacheSize)
         {
                    deleteData();  
                     insertUpdateHead(data);
         }
    }
    
    public static void insertUpdateHead(int data)
    {
        NodeDLL n = new NodeDLL(data);
        n.next = head;
        //tail = head;
        head.prev = n;
        head = n;
        hm.put(data,n);
        
    }
    
    public static void swapData(int data)
    {
      
        if(data == head.data)
            return;
        else if(tail.data == data)
        {
            deleteData();
            insertUpdateHead(data);
        }
        else 
        {
        NodeDLL ref = hm.get(data);
        NodeDLL prevNode = ref.prev;
        NodeDLL nextNode = ref.next;
        
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        ref.prev = null;
        ref.next = null;
        
        
         insertUpdateHead(data);
        }
    }
    
    public static void deleteData()
    {
          int data = tail.data;
        NodeDLL tailPrev = tail.prev;
           tailPrev.next = null;
        tail = tailPrev;
     
        hm.remove(data);
    }
            
}

public class NodeDLL {
 
    int data;
    NodeDLL prev;
    NodeDLL next;
    
    public NodeDLL(int x)
    {
            this.data = x;
    }
    
}
