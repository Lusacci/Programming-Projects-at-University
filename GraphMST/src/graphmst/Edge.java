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
public class Edge //edges have the vertix connections and cost
{
    int start;
    int end;
    int cost;
    public Edge(int start,int end,int cost)
    {
      this.start = start;
      this.end = end;
      this.cost = cost;
    }
}
