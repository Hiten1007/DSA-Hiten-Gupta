package Strings;

public class ContiguousOnes {
    public static void main(String[] args) {
        String s = "10";
        System.out.println(checkOnesSegment(s));
    }
    static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
