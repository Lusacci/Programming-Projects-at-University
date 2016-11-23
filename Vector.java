/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class Vector
{ 
    int size; //elements inside vector
    int capacity; //actual size of vector
    LinkedList[] list;
    public Vector () // starting vector array
    {
        size = 0;
        capacity = 2;
        list = new LinkedList[capacity];
    }
    public Vector (int capacity) // capacity of the vector class
    {
        size = 0;
        this.capacity = capacity;
        list = new LinkedList[capacity];
    }
    public void insert(int index, int value) 
    {
     if(list[index] == null)
     {
         list[index] = new LinkedList();
         size++;
     }   
     list[index].insert(value);
    }
    public void growMe()
    {
        capacity *= 2;
        LinkedList[] newL = new LinkedList[capacity];
        for(int i = 0; i < list.length; i++) 
        {
            newL[i] = list[i];
        }
        list = newL;
    }
    public void remove(int index, int value)
    {
      if(list[index] != null)  
      {
        list[index].remove(value);
        if(list[index].isEmpty())
        {
            list[index] = null;
            size--;
        }
      }
    }
    public void shrinkMe()
    {
        capacity /= 2;
        LinkedList[] newL= new LinkedList[capacity];
        int indexTwo = 0;
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] != null)
            {
                newL[indexTwo] = list[i];
                indexTwo++;
            }
        }
        list = newL;
    }
    public void print()
    {
        for(int i=0; i< list.length; i++)
        {
            System.out.print("index[" + i + "] ");
            if (list[i] != null)
            {
                list[i].print();
            }
            System.out.println();
        }
    }
}