package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WalkingRobotSimulation {
    public static void main(String[] args) {
        int[] commands = {6,-1,-1,6};
        int[][] obstacles = {{0, 4}};
        System.out.println(robotSim(commands, obstacles));
    }
    static int robotSim(int[] commands, int[][] obstacles) {
        int northf = 1;
        int southf = 0;
        int eastf = 0;
        int westf = 0;

        int max = 0;
        int[] pos = new int[2];

        Set<String> set = new HashSet<>();

        for(int[] obstacleSet : obstacles){
            set.add(obstacleSet[0] + "," + obstacleSet[1]);
        }

        for(int i = 0; i < commands.length; i++){
            if(commands[i] == -2){
                if(northf == 1){
                    westf = 1;
                    northf = 0;
                }
                else if(westf == 1){
                    southf = 1;
                    westf = 0;
                }
                else if(southf == 1){
                    eastf = 1;
                    southf = 0;
                }
                else if(eastf == 1){
                    northf = 1;
                    eastf = 0;
                }
            } else if (commands[i] == -1) {
                if(northf == 1){
                    eastf = 1;
                    northf = 0;
                }
                else if(westf == 1){
                    northf = 1;
                    westf = 0;
                }
                else if(southf == 1){
                    westf = 1;
                    southf = 0;
                }
                else if(eastf == 1){
                    southf = 1;
                    eastf = 0;
                }
            }
            else{
                for(int j = 0; j < commands[i]; j++){
                    int x = pos[0];
                    int y = pos[1];
                    if(northf == 1){
                        pos[1]++;
                    } else if (eastf == 1) {
                        pos[0]++;
                    } else if (southf == 1) {
                        pos[1]--;
                    } else if (westf == 1) {
                        pos[0]--;
                    }
                    if(set.contains(pos[0] + "," + pos[1])){
                        pos[0] = x;
                        pos[1] = y;
                        max = Math.max(max, x*x + y*y);
                        break;
                    }
                    max = Math.max(max, pos[0]*pos[0] + pos[1] * pos[1]);
                }
            }
        }
        return max;
    }
}
