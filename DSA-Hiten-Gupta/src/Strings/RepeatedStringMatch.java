package Strings;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "";
        System.out.println(repeatedStringMatch(a, b));
    }
    static int repeatedStringMatch(String a, String b) {
        if(b.isEmpty()) return 0;
        int count = 0;
        String x = "";
        while(x.length() <= (b.length() + a.length())){
            x += a;
            count++;
            if(x.length() >= b.length()) {
                for (int i = 0; i <= x.length() - b.length(); i++) {
                    if (x.substring(i, i + b.length()).equals(b)) {
                        return count;
                    }
                }
            }
        }
        return -1;
    }
}
