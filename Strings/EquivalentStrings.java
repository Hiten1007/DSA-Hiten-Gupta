package Strings;

public class EquivalentStrings {
    public static void main(String[] args) {
        String[] word1 = {"Ab", "c"};
        String[] word2 = {"a", "Bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("", word2));
    }
}
