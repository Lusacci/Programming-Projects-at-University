/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphmst;
import java.util.Scanner;
/**
 *
 * @author James
 */
public class GraphMST 
{
    boolean done;
    public static void main(String[] args) 
    {
      Scanner readThat = new Scanner(System.in);
      
      System.out.println("Are we making an adjacency list? True or false?");
      boolean dalist = readThat.nextBoolean();
      
      System.out.println("What is the maximum amount of vertices?");
      int vertices = readThat.nextInt();
      readThat.nextLine();
      
      Graph nGraph = new Graph(dalist, vertices);
      
      System.out.println("Give me the edges!");
      System.out.println("(Int values only) for the start, end, and the cost");
      System.out.println("Type done for no more edges.");
      
      for(;;)
      {
          int start, end, cost;
          System.out.print("Start: ");
          String input = readThat.nextLine();
          if(input.equals("done")) 
          {
              boolean done = true;
              break;
          }
          else
          {
            start = Integer.parseInt(input);
          }
          System.out.print("End: ");
          end = readThat.nextInt();readThat.nextLine();
          System.out.print("Cost: ");
          cost = readThat.nextInt();readThat.nextLine();
          nGraph.insertEdge(start, end, cost);
            
          
      }
      
      // Conversions
      if(dalist == true)
      {
          nGraph.printadjList();
          nGraph.adjListtoMatrix(nGraph.adjList);
          nGraph.printadjMatrix();
      }
      else
      {
          nGraph.printadjMatrix();
          nGraph.adjMatrixtoList(nGraph.adjMatrix);
          nGraph.printadjList();
      }
      
      
      int mcost =  nGraph.kruskal();
      System.out.println("Your minimum cost is: " + mcost);
      
     
      
      
      
      
      
      
    }
}
