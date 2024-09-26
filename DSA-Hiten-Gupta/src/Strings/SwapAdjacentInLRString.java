package Strings;

public class SwapAdjacentInLRString {
    public static void main(String[] args) {
        String s = "RXXXXXXXXXLL";
        String e = "XRXXXXXXXLXL";
        System.out.println(canTransform(s, e));
    }
    static boolean canTransform(String start, String end) {
        int p1 = 0;
        int p2 = 0;
        while(p1 < start.length() || p2 < end.length()){
            while(p1 < start.length() && start.charAt(p1) == 'X'){
                p1++;
            }
            while(p2 < end.length() && end.charAt(p2) == 'X'){
                p2++;
            }
            if(p1 >= start.length() && p2 >= end.length()){
                return true;
            }
            if(p1 >= start.length() || p2 >= end.length()){
                return false;
            }
            if(start.charAt(p1) != end.charAt(p2)){
                return false;
            }
            if(start.charAt(p1) == 'R' && p1 > p2){
                return false;
            }
            if(start.charAt(p1) == 'L' && p1 < p2){
                return false;
            }
            p1++;
            p2++;
        }
        return true;
    }
}
