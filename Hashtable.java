/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class Hashtable 
{
    Vector myVector;
    public static int[] primes = {275604547,295075147,295075153,314606869,314606891,334214459,334214467,353868013};
    int randomA;
    int randomB;
    int thePrime;
    
    public Hashtable ()
    {
        thePrime = primes[(int)(Math.random() * primes.length)];
        myVector = new Vector();
        randomA = (int)(Math.random()*15485863);//random*big int
        randomB = (int)(Math.random()*15485867);//random*big int
    }
    public void insert(int value)
    {
        
        int hashed= hash(value);
        myVector.insert(hashed, value);
        double loadFactor = 0;
        if(myVector.list[hashed] != null)
        {
            loadFactor = (double)(myVector.list[hashed].size) / myVector.capacity;
        }
        if(myVector.size == myVector.capacity && loadFactor >= .75)
        {
            myVector.growMe();
            rehash();
        }
    }
    public void remove(int value)
    {
        int hashed= hash(value);
        myVector.remove(hashed, value);
        if(myVector.size <= myVector.capacity/4 && myVector.capacity > 2)
        {
            myVector.shrinkMe();
            rehash();
        }
    }
    public LinkedList.Node find(int value) 
    {
        return myVector.list[hash(value)].find(value);
    }
    public void rehash()
    {
        thePrime = primes[(int)(Math.random() * primes.length)];
        Vector nVector = new Vector(myVector.capacity);
        for(int i=0; i < myVector.capacity; i++)
        {
            if(myVector.list[i] != null) 
            {
               LinkedList.Node reNode = myVector.list[i].head;
               while(reNode != null)
               {
                   nVector.insert(hash(reNode.data), reNode.data);
                   reNode = reNode.next;
               }
            }
        }
        myVector = nVector;
    }
    public int hash(int key)
    {
        int hashFunction = ((randomA * key) + randomB) % thePrime;
        if (hashFunction < 0)
            hashFunction *= -1;
        return hashFunction % myVector.capacity;
    }
    public void print()
    {
        myVector.print();
        System.out.println();
    }
}
