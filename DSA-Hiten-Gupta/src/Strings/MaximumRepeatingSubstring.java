package Strings;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence, word));
    }
    static int maxRepeating(String sequence, String word) {
        int count = 0;
        String add = word;
        while(sequence.contains(word)){
            word += add;
            count++;
        }
        return count;
    }
}
