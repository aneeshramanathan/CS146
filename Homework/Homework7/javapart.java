package Homework.Homework7;

import java.util.Arrays;
import java.util.PriorityQueue;

public class javapart{
    public static int minMeetingRooms(int[][] intervals) {  
        Arrays.sort(intervals, (x,y) -> x[0] - y[0]);
        PriorityQueue<Integer> serverEndTimes = new PriorityQueue<Integer>();
        for(int i=0; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while(!serverEndTimes.isEmpty() && serverEndTimes.peek()<=start){
                serverEndTimes.poll();
            }
            serverEndTimes.offer(end);
        }
        return serverEndTimes.size();
    } 


    public static void main(String[] args){
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(intervals)); 
        int[][] intervalsTwo = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(minMeetingRooms(intervalsTwo));
    }
}

