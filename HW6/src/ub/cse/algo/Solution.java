package ub.cse.algo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    
    private int _n_rallies;
    private ArrayList<int[]> _rallies;
    
    public Solution (int n_rallies, ArrayList<int[]> rallies){
        _n_rallies = n_rallies;
        _rallies = rallies;
    }
    
    /**
     * You should fill this in on your own. Rallies is list of tuples, in the form (rally duration, rally deadline).
     * Your output should also be a list of tuples, of the form (rally id, start time of rally). If no possible
     * schedule exists, you should return an empty list.
     * @return
     */
    public ArrayList<int[]> getSchedule()
    {
        
        ArrayList<int[]> schedule = new ArrayList<int[]>();
        ArrayList<Integer> deadlines = new ArrayList<Integer>();
        ArrayList<Integer> durations = new ArrayList<Integer>();
        int startTime = 0;
        for (int i = 0; i < _n_rallies; i++)
        {
            deadlines.add(null);
        }
        for (int i = 0; i < _n_rallies; i++)
        {
            durations.add(null);
        }
        PriorityQueue<Integer> deadline_Rankings = new PriorityQueue<Integer>();
        PriorityQueue<Integer> duration_Rankings = new PriorityQueue<Integer>();
        for (int i = 0; i < _n_rallies; i++)
        {
            deadline_Rankings.add(_rallies.get(i)[1]);
        }
        for (int i = 0; i < _n_rallies; i++)
        {
            duration_Rankings.add(_rallies.get(i)[0]);
        }
        for (int i = 0; i < _n_rallies; i++)
        {
            deadlines.set(i, _rallies.get(i)[1]);
        }
        for (int i = 0; i < _n_rallies; i++)
        {
            durations.set(i, _rallies.get(i)[0]);
        }
        while (deadline_Rankings.size() > 0)
        {
            int earliestDeadline = deadline_Rankings.remove();
            int earliestTask = deadlines.indexOf(earliestDeadline);
            deadlines.set(earliestTask, -1);
            int[] retTuple = new int[2];
            retTuple[0] = earliestTask;
            retTuple[1] = startTime;
            schedule.add(retTuple);
            startTime += _rallies.get(earliestTask)[0];
        }
        for (int i = 0; i < schedule.size()-1; i++)
        {
            int check1 = schedule.get(i)[0];
            if (_rallies.get(check1)[1] < schedule.get(i+1)[1])
            {
                schedule.clear();
                break;
            }
        }
        
        return schedule;
    }
}
