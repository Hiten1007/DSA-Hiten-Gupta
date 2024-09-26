package Strings;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String s = "UDLRLRUD";
        System.out.println(judgeCircle(s));
    }
    static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] move = moves.toCharArray();
        for(char c : move){
            switch(c){
                case 'U' :
                    y++;
                    break;
                case 'D' :
                    y--;
                    break;
                case 'L' :
                    x++;
                    break;
                case 'R' :
                    x--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
