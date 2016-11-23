/*Name: James Tam
Date created or Date last modified: 12/8/2015
Project info: Project 4 - "Sorting and Complexity"
Description: Binary Search Tree, PreOrder, In-Order, Post-Order 
*/
public class BinarySearchTree<K extends Comparable<K>, V>{

   private Node<K, V> root;
   private int size;
   enum traversalStyle {PRE, IN, POST};

   class Node<K, V> {
   
      private K key;
      private V value;
      private Node<K, V> leftChild;
      private Node<K, V> rightChild;
   
      public Node(K k, V v) {
         key = k;
         value = v;
         leftChild = rightChild = null;
      }
      
      @Override
      public String toString() {
         return ""+value;
      }
   }

   public String toString(Node n, traversalStyle s) {
      String str = "";
      if(s.equals(traversalStyle.PRE)) {
         str = preOrder(n,"");
      }
      else if(s.equals(traversalStyle.IN)) {
         str = inOrder(n,"");
      }
      else if(s.equals(traversalStyle.POST)){
         str = postOrder(n,"");
      }
      return str;
   }
   
   public BinarySearchTree() {
      root = null;
      size = 0;
   }

   public V find(K key) {
      return find(key, root);
   }

   public V find(K key, Node<K, V> n) {
      if (n == null) {
         return null;
      }
      if (((Comparable<K>)key).compareTo(n.key) < 0){ 
         return find(key,n.leftChild);
      } 
      else if (((Comparable<K>)key).compareTo(n.key) > 0){
         return find(key, n.rightChild);
      }
      else  {  
      return (V) n.value;
      }   
   }

    public boolean delete(K key) {
    	Node<K, V>n=root;
      while(key !=n.key){
         if(n==null){
            break;
         }
         else if(key !=n.key){
            if(compare(key, n.key) <0){
               n=n.leftChild;
               }
               else{
               n=n.rightChild;
               }
             }
           }
    Node<K, V> successor= getSuccessor(n);
    while(successor.leftChild !=null || successor.rightChild != null){
      n.value = successor.value;
      n = successor;
      successor = getSuccessor(successor);
    }
    n = successor;
    n = null;
    
    return true;
              
    }
    public Node getSuccessor(Node deleleNode) 
    {
      Node<K, V> successor = null;
      if(deleleNode.leftChild == null && deleleNode.rightChild == null){
         successor = null;
      }
      else if(deleleNode.leftChild != null){
         successor = deleleNode.leftChild;
      }
      else if(deleleNode.leftChild == null && deleleNode.rightChild != null){
         successor = deleleNode.rightChild;
      }
      return successor;
         
 }

   public boolean insert(K k, V v) {
      if(root == null){
         root = new Node<K, V>(k,v);
      }
      else{
         insert(k,v,root,null, false);
      }
      size++;   
      return true;
   }

   public void insert(K k, V v, Node<K, V> n, Node<K, V> parent, boolean left) {
      
      if(n == null){ //i.e. parent is a leaf!
         if (left) {
            parent.leftChild = new Node<K, V>(k, v);
         } else { 
            parent.rightChild = new Node<K, V>(k, v);
         }
      }
         else if(((Comparable<K>) k).compareTo((K) n.key) <0) {
         insert(k,v,n.leftChild,n,true);
      }
      else{
         insert(k,v,n.rightChild,n, false);
         }
      
   }

   private String preOrder(Node<K, V> n, String str) 
   {
      if(n!=null)
      {
         System.out.println(n.value);
         if(n.leftChild != null){
            preOrder(n.leftChild, str);
         }
         if(n.rightChild != null){
            preOrder(n.rightChild, str);
         }
      }   
      return str;
   }

   private String inOrder(Node<K, V> n, String str) {
      if(n!=null)
      {
          
         if(n.leftChild != null){
            inOrder(n.leftChild, str);
         }
         System.out.println(n.value);
         if(n.rightChild != null){
            inOrder(n.rightChild, str);
         } 
         
      }   
      return str;
   }

   private String postOrder(Node<K, V> n, String str) {
       if(n!=null)
      {
          
         if(n.leftChild != null){
            postOrder(n.leftChild, str);
         }
         if(n.rightChild != null){
            postOrder(n.rightChild, str);
         } 
         System.out.println(n.value);
      }   
      return str;
   }
  private int compare(K m1, K m2){
      if(m1.compareTo(m2) < 0){
         return -1;
      }
      else if(m1.compareTo(m2) > 0) {
         return 1;
         }
      else{
         return 0;
      }
}
      
      
   public static void main(String args[]) {
        BinarySearchTree b = new BinarySearchTree();
/*
        b.insert(7, 7);
        b.insert(1, 1);
        b.insert(0, 0);
        b.insert(3, 3);
        b.insert(2, 2);
        b.insert(5, 5);
        b.insert(4, 4);
        b.insert(6, 6);
        b.insert(9, 9);
        b.insert(8, 8);
        b.insert(10, 10);
*/

        b.insert(491, 491);
        b.insert(13, 13);
        b.insert(65, 65);
        b.insert(702, 702);
        b.insert(42, 42);
        b.insert(37, 37);
        b.insert(2, 2);
        b.insert(1, 1);
        b.insert(900, 900);
        b.insert(9, 9);
        
        System.out.println("Pre-order : ");
        System.out.println(b.toString(b.root, traversalStyle.PRE));
//        b.preOrder(b.root);
        System.out.println("");
        System.out.println("In-order : ");
        System.out.println(b.toString(b.root, traversalStyle.IN));
//        b.inOrder(b.root);
        System.out.println("");
        System.out.println("Post-order : ");
        System.out.println(b.toString(b.root, traversalStyle.POST));
//        b.postOrder(b.root);
        System.out.println("");
    }
}


