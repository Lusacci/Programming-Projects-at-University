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
public class Graph 
{
    LinkedList[] adjList; // array of linked lists
    int[][] adjMatrix; // double matrix
    boolean list; // list? not list?
    int vertices; // size of the list/matrix (the points)
    Node temper; // may not be in use
    Edge[] edgeArr; // array of edges used to sort minimum weight
    Edge temp; // used to traverse.
    public Graph (boolean dalist, int vertices)  
    {
        list = dalist; 
        this.vertices = vertices;
        if(dalist == true) // user choice to make a list or not 
        {
           adjList = new LinkedList[vertices];  // makes list
           for(int i = 0; i< adjList.length; i++)
           {
               adjList[i] = new LinkedList();
           }
        }
        else 
        {
           adjMatrix = new int[vertices][vertices]; // makes a matrix
           for(int i = 0; i < adjMatrix.length; i++)
           {
               for(int j = 0; j < adjMatrix.length; j++)
               {
                   adjMatrix[i][j]= -1;
               }
           }
        }
    } 
    public void insertEdge(int start, int end, int cost)
    {    
         
         if(list == true) //create my adjacency list
         {
             Edge storedEdge = new Edge(start, end, cost); //storing edges given
             Edge secondEdge = new Edge(end, start, cost);
             adjList[start].insert(storedEdge);
             adjList[end].insert(secondEdge);
             
         }
         else //create the adjacency Matrix
         {
             adjMatrix[start][end]=cost;
             adjMatrix[end][start]=cost;
         }
    }
    public void adjListtoMatrix(LinkedList[] adjList)
    {
       adjMatrix = new int[vertices][vertices];
       for(int i = 0; i< adjList.length; i++) //adjacency matrix
       {
          for(int j = 0; j< adjList.length; j++)
          { 
              adjMatrix[i][j] = -1;
          }
       }
       for(int i = 0; i < adjList.length; i++) //adjacency list
       {
           LinkedList.Node temp = adjList[i].head;
           while(temp != null)
           {
               /*~* /
               System.out.println(temp.data.start);
               System.out.println(temp.data.end);
               System.out.println(adjMatrix.length);
               System.out.println(adjMatrix[temp.data.start].length);
               /*~*/
               int z = temp.data.end;
               adjMatrix[temp.data.start][z] = temp.data.cost;
               temp = temp.next;
           }
       }
    }
    public void adjMatrixtoList(int[][] adjMatrix)
    {
        adjList = new LinkedList[vertices];
        for(int i = 0; i < adjMatrix.length; i++)
        {
            adjList[i] = new LinkedList();
            for(int j = 0; j < adjMatrix.length; j++)
            {
                if(adjMatrix[i][j] != -1)
                {
                 adjList[i].insert(new Edge(i,j,adjMatrix[i][j]));                 
                }
            }
        }
    }
    public Edge[] sortEdge(int[][] adjMatrix)
    {
        int count = 0;
        for(int i = 0; i < adjMatrix.length; i++)
        {
            for(int j = i; j < adjMatrix.length; j++)
            {
                if(adjMatrix[i][j] != -1)
                {
                    count++;
                }
            }
        } 
        edgeArr = new Edge[count];
        int b = 0;
        for(int i = 0; i < adjMatrix.length; i++)
        {
            for(int j = i; j < adjMatrix.length; j++)
            {
                if(adjMatrix[i][j] != -1)
                {
                    edgeArr[b++] = new Edge(i, j, adjMatrix[i][j]);
                    //System.out.println("Found Edge: " + i + " " + j);
                }
            }
        }
        for(int k = 0; k < edgeArr.length-1; k++)
        {
            if(edgeArr[k].cost > edgeArr[k+1].cost)
            {
               temp = edgeArr[k];
               edgeArr[k] = edgeArr[k+1];
               edgeArr[k+1] = temp;
            }
        }   
        return edgeArr;
    }
    public int kruskal()
    {
        int mCost = 0;
        edgeArr = sortEdge(adjMatrix);
        int [] vArray = new int[vertices];
        for (int i = 0; i < vArray.length; i++)
        {
           vArray[i] = i;
        }
        
        for(int j = 0; j < edgeArr.length; j++)
        {
            int start = edgeArr[j].start;
            int end = edgeArr[j].end;
            int cost = edgeArr[j].cost;
            int temp = vArray[start];
            if(vArray[start] != vArray[end])
            {
                //System.out.println("Found New Min Edge: " + start + " " + end + " " + mCost);
                mCost += cost;
                for(int k = 0; k < vArray.length; k++)
                {
                    if(vArray[k] == temp)
                    {
                        vArray[k] = vArray[end];
                    }
                }
            }
        }
        return mCost;
    }
    public  void printadjList()
    {
      for(int i = 0; i<adjList.length; i++)
      {
          LinkedList.Node temp = adjList[i].head;
          while(temp != null)
          {
              System.out.print(temp.data.start + " "+ temp.data.end + " " 
               + temp.data.cost + " ");
              temp = temp.next;
          }
          System.out.println("");
      }
    }
    public void printadjMatrix() 
    {
        for(int i = 0; i < adjMatrix.length; i++)
        {
            for(int j = 0; j < adjMatrix.length; j++)
            {
                System.out.print(adjMatrix[i][j] + " ");             
            }
        }
    }
}
