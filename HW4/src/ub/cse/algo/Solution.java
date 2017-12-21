package ub.cse.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class Solution 
{
      private int startNode;
      private HashMap<Integer, ArrayList<Integer>> graph;
      public Solution(int node, HashMap<Integer, ArrayList<Integer>> g)
      {
        startNode = node;
        graph = g;
      }

      public int[] outputDistances()
      {
          
          int[] levels = new int[graph.size()];
          HashSet<Integer> explored = new HashSet<Integer>();
          Queue<Integer> traversal = new LinkedList<Integer>();
          traversal.add(startNode);
          for (int i = 0; i < levels.length; i++)
          {
              levels[i] = -1;
          }

          levels[startNode] = 0;
          explored.add(startNode);
          
          while (traversal.size() > 0)
          {
              int index = traversal.remove();
              for (int i = 0; i < graph.get(index).size(); i++)
              {
                  if ((explored.contains(graph.get(index).get(i)) == false))
                  {
                      levels[graph.get(index).get(i)] = levels[index] + 1;
                      traversal.add(graph.get(index).get(i));
                      explored.add(graph.get(index).get(i));
                  }
              }
          }
          return levels;
      }
}
