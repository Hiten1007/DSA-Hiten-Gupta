package StacksandQueues.StacksAndQueuesQuestions;

public class divideintervalsintominimumnumberofgroups {
    public int minGroups(int[][] intervals) {
        int rangeStart = Integer.MAX_VALUE;
        int rangeEnd = Integer.MIN_VALUE;
        for(int[] time : intervals){
            rangeStart = Math.min(rangeStart, time[0]);
            rangeEnd = Math.max(rangeEnd, time[1]);
        }
        int[] count = new int[rangeEnd + 2];

        for(int[] time : intervals){
            count[time[0]]++;
            count[time[1] + 1]--;
        }


        int concurrent = 0;
        int maxi = 0;
        for(int time : count){
            concurrent += time;
            maxi = Math.max(maxi, concurrent);
        }
        return maxi;
    }
}
