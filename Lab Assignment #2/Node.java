class Node 
{


 private int number;

 private Node next;

 public Node(int n) 
 {
  this.number = n; // this number
  this.next = null; // this next
 }

 

 public Node getNext() 
 {
   return this.next; // return 
 }

 public int getNumber()
 {
   return this.number; // return 
 }

 public void setNext(Node n) 
 { 
   this.next = n;
 }
 
 public String toString() 
 {
   return this.number + (";"); // return the number
 }

}