/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrbtree;

/**
 *
 * @author James
 */
public class RbNode 
{
    RbNode left, right, parent, uncle, grandparent; //parent 
    int data;
    boolean red;
 
    public RbNode (int newData)
    {
       data = newData;
       left = null;
       right = null;
       parent = null;
       uncle = null;
       grandparent = null;
       red = true; //this is red
    }
    
}


