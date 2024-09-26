package Strings;

public class JumpGameVII {
    public static void main(String[] args) {
        String s = "001010010101011011101010101010111101011111010";
        int minjump = 6;
        int maxjump = 9;
        System.out.println(s.length());
        System.out.println(canReach(s, minjump, maxjump));
    }
    static boolean canReach(String s, int minJump, int maxJump) {
        if(s.charAt(s.length() - 1) == '1') return false;
        boolean[] available = new boolean[s.length()];
        available[0] = true;
        int start;
        int end = 1;
        for(int i = 0; i < s.length(); i++){
            if(!available[i]) continue;
            start = Math.max(i + minJump, end + 1);
            end = Math.min(i + maxJump, s.length() - 1);
            for(int j = start; j <= end; j++){
                if(s.charAt(j) == '0'){
                    available[j] = true;
                }
                if(available[available.length - 1]) return true;
            }
        }
        return available[s.length() - 1];
    }
}
