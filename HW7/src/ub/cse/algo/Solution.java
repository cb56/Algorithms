package ub.cse.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Comparator;

import ub.cse.algo.Solution.Pair;

public class Solution {
    
    private int _startNode;
    private int _endNode;
    private HashMap<Integer, ArrayList<Integer>> graph;
    public Solution(int startNode, int endNode, HashMap<Integer, ArrayList<Integer>> g){
        _startNode = startNode;
        _endNode = endNode;
        graph = g;
    }
    /* customized class that I implemented */
    public class Pair<key, value> implements Comparable<Pair>
    {
        private final Integer key;
        private final Integer value;

        public Pair(Integer key, Integer value) 
        {
            this.key = key;
            this.value = value;
        }

        public Integer getKey() 
        { 
            return key; 
        }
        public Integer getValue() 
        { 
            return value; 
        }
        
        public int compareTo(Pair p1) 
        {
            return (this.value - p1.value);
        }
        
        public String toString() 
        {
            return "(" + this.key + "," + this.value + ")";
        }
        
        public Comparator<Pair> pairComparator = new Comparator<Pair>()
        {
            @Override
            public int compare(Pair p1, Pair p2) 
            {
                return (p1.getValue() - p2.getValue());
            }
        };
    }

    public ArrayList<Integer> outputPath() 
    {
        /*
         * Find the smallest weighted path between _startNode and _endNode
         * The first number of graph's adjacency list is the weight of its node
         */
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        ArrayList<Integer> S = new ArrayList<Integer>();
        ArrayList<Integer> V = new ArrayList<Integer>();
        int runningMinimums[] = new int[graph.size()];
        int parents[] = new int[graph.size()];
        for (int i = 0; i < graph.size(); i++)
        {
            runningMinimums[i] = -1;
        }
        for (int i = 0; i < graph.size(); i++)
        {
            parents[i] = -1;
        }
        runningMinimums[_startNode] = graph.get(_startNode).get(0);
        S.add(_startNode);
        int currentNode = _startNode;
        while (S != V)
        {    
            for ( int i =1; i < graph.get(currentNode).size(); i++)
            {
                int childNode = graph.get(currentNode).get(i);
                Pair p1 = new Pair(childNode, graph.get(childNode).get(0) + runningMinimums[currentNode]);
                int distance = p1.getValue();
                int key = p1.getKey();
                if (runningMinimums[key] == -1 || distance < runningMinimums[key])
                {
                    runningMinimums[key] = distance;
                    parents[p1.getKey()] = currentNode;
                    pq.add(p1);
                }
            }
            if (pq.isEmpty())
            {
                return new ArrayList<Integer>();
            }
            
            Pair next = pq.remove();
            S.add(next.getKey());
            if (next.getKey() == _endNode)
            {
                int current = next.getKey();
                path.add(current);
                while (current != -1)
                {
                    if (parents[current] != -1)
                    {
                        path.add(parents[current]);
                    }
                    current = parents[current];
                }
                
                break;
            }
            currentNode = next.getKey();
        }
        ArrayList<Integer> finalPath = new ArrayList<Integer>();
        for (int i = path.size() -1; i >=0; i--)
        {
            finalPath.add(path.get(i));
        }
        return finalPath;
    }
}