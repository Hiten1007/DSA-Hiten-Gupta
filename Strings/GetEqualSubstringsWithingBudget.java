package Strings;

public class GetEqualSubstringsWithingBudget {
    public static void main(String[] args) {
        String s = "ujteygggjwxnfl";
        String t = "nstsenrzttikoy";
        int maxCost = 43;
        System.out.println(equalSubstring(s, t, maxCost));
    }
    static int equalSubstring(String s, String t, int maxCost) {
        int i = 0;
        int cursum = 0;
        int maxlength = 0;
        int curlength = 0;
        while(i < s.length()){
            if(Math.abs(s.charAt(i) - t.charAt(i)) <= maxCost - cursum){
                cursum += Math.abs(s.charAt(i) - t.charAt(i));
                curlength++;
            } else if (Math.abs(s.charAt(i) - t.charAt(i)) > maxCost - cursum) {
                cursum = 0;
                if(curlength > maxlength){
                    maxlength = curlength;
                }
                curlength = 0;
            }
            i++;
        }
        if(curlength > maxlength){
            maxlength = curlength;
        }
        return maxlength;
    }
}
