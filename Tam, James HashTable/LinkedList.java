/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class LinkedList 
{ 
    Node head;
    int size;
    public class Node  //Node Class
    { 
        int data;
        Node next;
        public Node (int myData)
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
    public Node find(int theData)  // find the data in the nodes
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
    public Node findPrev(int theData) // find prev node
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
    public void insert(int newData) //insert the data at the given index every time
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void remove(int theData) // remove node based on data
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