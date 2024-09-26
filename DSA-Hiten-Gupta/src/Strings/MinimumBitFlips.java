package Strings;

public class MinimumBitFlips {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10, 7));
    }
    static int minBitFlips(int start, int goal) {
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        while(start > 0 || goal > 0){
            res1.append("" + start % 2);
            start /= 2;

            res2.append("" + goal % 2);
            goal /= 2;
        }
        int count = 0;
        for(int i = 0; i < res1.length(); i++){
            if(res1.charAt(i) != res2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
