package Homework.Homework7;

import java.util.Arrays;
import java.util.PriorityQueue;

public class javapart{
    public int minMeetingRooms(int[][] intervals) {  
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> endTimes = new PriorityQueue<Integer>();
        int min = 0;
        for(int i=0; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int index = -1;
            for(int j=0; j<min; j++){
                if(){
                    
                }
            }
        }

        return min;
    }
}

