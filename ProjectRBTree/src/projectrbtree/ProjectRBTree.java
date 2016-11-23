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
public class ProjectRBTree 
{
    public static void main(String[] args) 
    {
       RedBlackTree rbTree = new RedBlackTree();
       rbTree.insert(13);
       rbTree.insert(30);
       rbTree.insert(21);
       rbTree.insert(25);
       rbTree.insert(17);
       rbTree.insert(31);
       System.out.println("InOrder: "); // left, parent, right
       rbTree.inOrder(rbTree.root);
       System.out.println("left rotate test"); 
       rbTree.leftRotate(rbTree.root);
       System.out.println(rbTree.root.data);
       System.out.println("right rotate test");
       rbTree.rightRotate(rbTree.root);
       System.out.println(rbTree.root.data);
       System.out.println(rbTree.root.red);
    }
}
