package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleI {
    public static void main(String[] args) {
        int[][] mat = {{1, 0}};
        System.out.println(canFinish(2, mat));
    }
    static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            int x = prerequisites[i][0];
            int y = prerequisites[i][1];
            list.get(y).add(x);
            inDegree[x]++;
        }

        Queue<Integer> q = new LinkedList<>();

        int count = 0;
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                q.add(i);
                count++;
            }
        }

        while(!q.isEmpty()){
            int j = q.remove();
            for(Integer it: list.get(j)){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.add(it);
                    count++;
                }
            }
        }
        return count == numCourses;
    }
}
