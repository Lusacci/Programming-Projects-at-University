/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class TestHashTable 
{
    public static void main(String [] args)
    {
        Hashtable hashbrown = new Hashtable();
        hashbrown.insert(34);
        hashbrown.insert(53);
        hashbrown.insert(23);
        hashbrown.insert(19);
        hashbrown.insert(12);
        hashbrown.insert(31);
        hashbrown.insert(07);
        hashbrown.insert(123);
        hashbrown.insert(20);
        for (int i = 0; i < 100; i++)
            hashbrown.insert((int)(Math.random() * 99));
        hashbrown.print();
        hashbrown.remove(20);
        for (int i = 0; i < 500; i++)
            hashbrown.remove((int)(Math.random() * 99));
        hashbrown.print();
    }
    
    public static void print(LinkedList any)
    {
        LinkedList.Node printList = any.head; 
        while (printList != null)
        {
            System.out.print(printList.data + " ");
            printList = printList.next;
        }
        System.out.println();
    }
    
}
