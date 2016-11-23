/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphmst;

/**
 *
 * @author James
 */
public class Node //node for linked list
{
  Edge data;
  Node next;
  public Node (Edge data) 
  {
    this.data = data;
    next = null;
  }    

    public Edge getData() {
        return data;
    }

    public void setData(Edge data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
