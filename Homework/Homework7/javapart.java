package Homework.Homework7;

import java.util.Arrays;
import java.util.PriorityQueue;

public class javapart{
    public static int minMeetingRooms(int[][] intervals) {  
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> endTimes = new PriorityQueue<Integer>();
        for(int i=0; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while(!endTimes.isEmpty() && endTimes.peek()<=start){
                endTimes.poll();
            }
            endTimes.offer(end);
        }
        return endTimes.size();
    } 


    public static void main(String[] args){
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(intervals)); 
        int[][] intervalsTwo = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(minMeetingRooms(intervalsTwo));
    }
}

