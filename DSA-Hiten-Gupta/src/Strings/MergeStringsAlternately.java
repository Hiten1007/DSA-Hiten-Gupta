package Strings;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String s1 = "Hiten";
        String s2 = "Manashwi";
        System.out.println(mergeAlternately(s1, s2));
    }
    static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < word1.length() && j < word2.length()){
            result.append(word1.charAt(i));
            i++;
            result.append(word2.charAt(j));
            j++;
        }
        if(i == word1.length()){
            result.append(word2.substring(j));
        }
        if(j == word2.length()){
            result.append(word1.substring(i));
        }
        return result.toString();
    }
}
