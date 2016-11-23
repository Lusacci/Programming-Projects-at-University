import java.util.*;
public class NumberList 
{
 private Node head;
 private Node tail;
 public NumberList() 
 { 
   head = null;
   tail = null;
 }
 public void insertAtHead(int x) 
 {
  Node n = new Node(x);
  if (head == null) // starts null
  {
   head = n;
  }
  else
  { 
  n.setNext(head);
  head = n;
  }
 }
 public void insertAtTail(int x) 
 {
  Node t = new Node(x);
  if (head == null) // same case, different value set
  {
   head = tail = t;
  }
  else 
  {   
   tail.setNext(t);
   tail = t;
  }
 }
 public void insertInOrder(int x) 
 {
  Node n = new Node(x);
  Node curr;
  Node prev;
  curr = prev = head;
  if (head == null) 
  {
   head = tail = n;
  }
  else if (x < head.getNumber()) // check the head's values
  {
   insertAtHead(x);
  }
  else if (x > tail.getNumber()) // check the tail's values
  {
   insertAtTail(x);
  }
  else 
  {
   while(n.getNumber() > curr.getNumber()) //use curr and prev to add the node, sort in order
   { 
    prev = curr;
    curr = curr.getNext();
   }
   prev.setNext(n);
   n.setNext(curr);
  }
 }
 public String toString() 
 { 
   String output = "";
   for (Node curr = head; curr != null; curr = curr.getNext())
      {
      output = output + curr.toString(); // prints out my output
      }
   return output;
 }

/*---------------------
 test methods
---------------------*/
// This is the testInsertAtHead void method
 public static void testInsertAtHead() 
 {
  Random r = new Random();
  int n = 20;
  int range = 1000;

  NumberList list = new NumberList();
 
  for (int i=1; i<=n; i++) 
  {
   int x = r.nextInt(range);
   list.insertAtHead(x);
   System.out.println("" + x + ": " + list);
  }

 }
// This is the testInsertAtTail void method
 public static void testInsertAtTail() 
 {
  Random r = new Random();
  int n = 20;
  int range = 1000;

  NumberList list = new NumberList();

  for (int i=1; i<=n; i++) 
  {
  int x = r.nextInt(range);
  list.insertAtTail(x);
  System.out.println("" + x + ": " + list);
  }
 }
//This is the testInsertOrder void method
 public static void testInsertInOrder() 
 {
  Random r = new Random();
  int n = 20;
  int range = 1000;

  NumberList list = new NumberList();

  for (int i=1; i<=n; i++) 
  {
  int x = r.nextInt(range);
  list.insertInOrder(x);
  System.out.println("" + x + ": " + list);
  }
 }
//The main String, where it all runs. 
 public static void main(String[] args) 
  {
   testInsertAtHead();
   testInsertAtTail();
   testInsertInOrder();
  }
}