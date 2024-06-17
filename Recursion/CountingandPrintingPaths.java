package Recursion.MazeProblemsandBacktracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingandPrintingPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
        {true, true, true},
        {true, true, true},
        };
        int[][] path = new int[maze.length][maze[0].length];

        pathpath("", maze, 0, 0, path, 1);
    }
    static int path(int r, int c){
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = path(r - 1, c);
        int right = path(r, c - 1);
        return left + right;
    }

    static void pathretdiagonal(String p, int r, int c){
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r > 1 && c > 1){
            pathretdiagonal(p + "D", r - 1, c - 1);
        }
       if(r > 1){
           pathretdiagonal(p + "V", r - 1, c);
       }
       if(c > 1){
           pathretdiagonal(p + "H", r, c - 1);
       }
    }
    static ArrayList<String> pathret2(String p, int r, int c){
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathret2(p + "D", r - 1, c));
        }
        if(c > 1){
            list.addAll(pathret2(p + "R", r, c - 1));
        }
        return list;
    }
    static void pathretobstacles(String p, boolean[][] maze,int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            pathretobstacles(p + "V", maze,r + 1, c);
        }
        if(c < maze[0].length - 1){
            pathretobstacles(p + "H", maze, r, c + 1);
        }
    }

    static void pathbacktrack(String p, boolean[][] maze,int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r < maze.length - 1){
            pathbacktrack(p + "D", maze,r + 1, c);
        }
        if(c < maze[0].length - 1){
            pathbacktrack(p + "R", maze, r, c + 1);
        }
        if(r > 0){
            pathbacktrack(p + "U", maze,r - 1, c);
        }
        if(c > 0){
            pathbacktrack(p + "L", maze,r, c - 1);
        }
        maze[r][c] = true;
    }

    static void pathpath(String p, boolean[][] maze,int r, int c, int[][] path, int step){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length - 1){
            pathpath(p + "D", maze,r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            pathpath(p + "R", maze, r, c + 1, path, step + 1);
        }
        if(r > 0){
            pathpath(p + "U", maze,r - 1, c, path, step + 1);
        }
        if(c > 0){
            pathpath(p + "L", maze,r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
