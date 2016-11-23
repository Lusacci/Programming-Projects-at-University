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
public class RedBlackTree
{
    RbNode root;
    public RedBlackTree()
    {
        root = null;
    }
    
    public void insert(RbNode nR)
    { //insert method that inserts the node.
        insert(nR.data); //insert node in Binary Search Tree 
    }
    
    public void insert(int newData)
    {
        RbNode temp = root; //what I'm using to traverse tree
        RbNode newNode = new RbNode(newData);
        if (root == null)
        {
            root = new RbNode(newData);
            root.red = false;
        }
        else
        {
            while (true)
            { //infinite loop
                if(newData >= temp.data) // check if new node.data is bigger than the root/parent
                {
                    if (temp.right == null)
                    { // so we don't point to null.
                        temp.right = newNode;
                        newNode.parent = temp;
                        break;
                    }
                    temp = temp.right;
                }
                else // other case for the left root/parent
                { 
                    if (temp.left == null) 
                    { // so we don't point to null.
                        temp.left = newNode;
                        newNode.parent = temp;
                        break;
                    }
                    temp = temp.left;
                } //bst insertions
               /* if(temp.parent.red == true && temp.parent.parent.right.red == true) //case 1
                {
                    temp.parent.red = false; //change to black
                    temp.parent.parent.right.red = false; //change to black
                    temp.parent.parent.red = true; //grandparent to red
                }
                */
            }
        } 
        //below doesn't work
        /*RbNode grandparent = new RbNode(newData);
        if (grandparent != null)
        {
        if (newNode.grandparent.right.color == true)
        {
            newNode.parent.color = false;
            newNode.grandparent.right.color = false;
            newNode.grandparent.color = true;
        }
        } */
    }
    public RbNode search(int newData) // the same kind of loops for the insert, but we stop at search. 
    {
        RbNode temp = root;
        while (temp != null) 
        {
            if(newData > temp.data)
                temp = temp.right;
            else if (newData < temp.data)
                temp = temp.left;
            else 
                return temp;
        } 
        return null;    
    }
    public void remove (int newData) 
    {
        RbNode temp = search(newData);
        while (temp !=null){
            if(temp.right == null && temp.left == null)
            {
                if (temp.parent == null)
                {
                    root = null;
                }else if (temp.parent.right == temp)
                {
                    temp.parent.right = null;
                }else
                {
                    temp.parent.left = null;
                }
                temp = null;
            }
            else if(temp.right == null) 
            {
                if(temp.parent.right == temp)
                {   
                    temp.parent.right = temp.left;
                    temp.left.parent = temp.parent;
                }
                else
                {
                    temp.parent.left = temp.left;
                    temp.left.parent = temp.parent;
                }
                temp = null;
            }
            else if(temp.left == null)
            {
                if(temp.parent.right == temp)
                {
                    temp.parent.right = temp.right;
                    temp.right.parent = temp.parent;
                }
                else
                {
                    temp.parent.left = temp.right;
                    temp.right.parent = temp.parent;         
                }
                temp = null;
            }
            else
            {
                RbNode successor = temp.right;
                while(successor.left != null)
                {
                    successor = successor.left;
                }
                temp.data = successor.data;
                temp = successor;
            }
        }   
    }  
    public void leftRotate(RbNode x) // do not rotate if only root
    { 
        RbNode y = x.right; 
        x.right = y.left; 
        if(y.left != null)
        {
            y.left.parent = x;
            y.parent = x.parent;
            if (x.parent == null)
            {
                root = y;
            }    
        }
        else if (x == x.parent.left) 
        {
            x.parent.left = y;
        }
        else 
        {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }
    
    public void rightRotate(RbNode x)
    {
        RbNode y = x.left;
        x.left = y.right;
        if(y.right != null)
        {
            y.right.parent = x;
            y.parent = x.parent;
            if(x.parent == null)
            {
                root = y;
            }
        }
        else if(x == x.parent.right)
        {
            x.parent.right = y;
        }
        else
        {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }
    
    public void inOrder(RbNode nR)
    { 
        if(nR != null) 
        {
            inOrder(nR.left);
            System.out.println(" " + nR.data);
            inOrder(nR.right);
        }
    }

}
