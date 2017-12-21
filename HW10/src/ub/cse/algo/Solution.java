package ub.cse.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;

public class Solution {

    private int origin;
    private ArrayList<HashMap<Integer, Integer>> incoming_edges;
    private ArrayList<HashMap<Integer, Integer>> outgoing_edges;

    public Solution(int origin, ArrayList<HashMap<Integer, Integer>> incoming_edges, ArrayList<HashMap<Integer, Integer>> outgoing_edges){
        this.origin = origin;
        this.incoming_edges = incoming_edges;
        this.outgoing_edges = outgoing_edges;
    }

    public int[] outputShortestDistance()
    {
        /* Your code goes below */
    	/* Initialization*/
    	Queue<Integer> exploreNext = new LinkedList<Integer>();
    	HashSet<Integer> explored = new HashSet<Integer>();
    	exploreNext.add(origin);
    	Queue<Integer> nextPrelim = new LinkedList<Integer>();
    	HashSet<Integer> exploredPrelim = new HashSet<Integer>();
    	
    	/* Loop for Number of Nodes*/
    	nextPrelim.add(origin);
    	while (nextPrelim.size() > 0)
    	{
    		int parentNode = nextPrelim.remove();
    		Set<Integer> childSet = outgoing_edges.get(parentNode).keySet();
    		for (Integer key: childSet)
    		{
    			if (exploredPrelim.contains(key) == false)
    			{
    				nextPrelim.add(key);
    			}
    			exploredPrelim.add(key);
    		}
    	}
    	
    	/* Initialization Part II */
    	int numberOfNodes = exploredPrelim.size();
    	ArrayList<Integer> weights = new ArrayList<Integer>();
    	for (int i = 0; i < numberOfNodes; i++)
    	{
    		weights.add(null);
    		if (i == origin)
    		{
    			weights.set(i, 0);
    		}
    		else
    		{
    			weights.set(i, 200000);
    		}
    	}
    	/* Loops */
    	int lastExplored = 0;
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    	}
    	
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	explored.removeAll(explored);
    	exploreNext.add(lastExplored);
    	while (exploreNext.size() > 0)
    	{
    		 int next = exploreNext.remove();
    		 Set<Integer> xSet =  outgoing_edges.get(next).keySet();
    		 for (Integer key: xSet)
    		 {
    			 if (outgoing_edges.get(next).get(key) + weights.get(next) < weights.get(key))
    			 {
    				 weights.set(key, outgoing_edges.get(next).get(key) + weights.get(next));
    			 }
    			 if (explored.contains(key) == false)
        		 {
        			 exploreNext.add(key);
        		 }
    			 explored.add(next);
    			 lastExplored = next;
    		 }
    		 
    	}
    	int solution[] = new int[weights.size()];
    	for (int i = 0; i < weights.size(); i++)
    	{
    		solution[i] = weights.get(i);
    	}
    	return solution;
    		
    }
}
