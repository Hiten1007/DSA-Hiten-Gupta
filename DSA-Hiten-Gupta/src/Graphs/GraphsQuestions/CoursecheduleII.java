package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class CoursecheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] vis = new int[numCourses];
        int[] pathVis = new int[numCourses];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++){
            int x = prerequisites[i][0];
            int y = prerequisites[i][1];

            list.get(y).add(x);
        }

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < numCourses; i++){
            if(vis[i] == 0){
                if(!dfs(i, vis, pathVis, st, list)){
                    return new int[] {};
                }
            }
        }
        int[] arr = new int[numCourses];
        int i = 0;
        while(!st.isEmpty()){
            arr[i++] = st.pop();
        }

        return arr;
    }

    static boolean dfs(int i, int[] vis, int[] pathVis, Stack<Integer> st, ArrayList<ArrayList<Integer>> list){
        vis[i] = 1;
        pathVis[i] = 1;

        for(Integer it : list.get(i)){
            if(vis[i] == 0){
                if(!dfs(i, vis, pathVis, st, list)){
                    return false;
                }
            }
            else if(pathVis[i] == 1){
                return false;
            }
        }
        pathVis[i] = 0;
        if(!st.contains(i)) {
            st.push(i);
        }
        return true;
    }
}
