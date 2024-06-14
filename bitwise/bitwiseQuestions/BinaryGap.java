package bitwise.bitwiseQuestions;

public class BinaryGap {
    public static void main(String[] args) {
        int x = 22;
        System.out.println(binaryGap(x));
    }
    static int binaryGap(int n) {
        int maxdistance = 0;
        int count = 0;
        String s = Integer.toBinaryString(n);
        boolean firstd = false;
        int i = s.length() - 1;
        while(i >= 0){
            int x = s.charAt(i) - '0';
            if((x &1) == 1 && count == 0 && i!= 0){
                count++;
                firstd = true;
            }
            else if((x&1) == 0 && firstd){
                count++;
            }
            else if((x&1) == 1 && count != 0){
                maxdistance = Math.max(count, maxdistance);
                count = 1;
            }
            i--;
        }
        return maxdistance;
    }
}
