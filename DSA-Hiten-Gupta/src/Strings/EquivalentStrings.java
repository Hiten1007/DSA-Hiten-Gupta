package Strings;

public class EquivalentStrings {
    public static void main(String[] args) {
        String[] word1 = {"AB", "c"};
        String[] word2 = {"A", "Bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("", word2));
    }
}
