/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
package graphmst;

public class LinkedList 
{ 
    Node head;
    int size;
    public class Node  //Node Class
    { 
        Edge data;
        Node next;
        public Node (Edge myData)
        { 
        data = myData;
        next = null;
        }
    }
    public LinkedList() //Linked List starts at 0 
    {
        size = 0;
        head = null;
    }
    public boolean isEmpty () //Check if empty
    {
        if (size == 0)
        {
            return true;
        }
        return false;
    }
    public Node find(Edge theData)  // find the data in the nodes
    {
       Node temp = head;
       if(isEmpty())
       {
           return null;
       }
       else 
       {
           while (temp != null) 
           {
               if(theData != temp.data)
               {
                   temp = temp.next;
               }
               else 
               {
                   return temp;
               }
           }
           return null;
       }
    }
    public void remove(Edge theData) // remove node based on data
    {
        Node foundNodePrev = findPrev(theData);
        if(!isEmpty() && foundNodePrev != null)
        {
            if(head.data == theData)
            {
                head = head.next;
            }
            else
            {
                foundNodePrev.next = foundNodePrev.next.next;
            }
            size--;
        }
    }
    public Node findPrev(Edge theData) // find prev node
    {
       Node temp = head;
       if(isEmpty())
       {
           return null;
       }
       else 
       {
           if(temp.data == theData)
           {
               return temp;
           }
           while (temp.next != null) 
           {
               if(theData != temp.next.data)
               {
                   temp = temp.next;
               }
               else 
               {
                   return temp;
               }
           }
           return null;
       }
    }
    public void insert(Edge newData) 
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void print()
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data+ " ");
            n = n.next;
        }
    }
}