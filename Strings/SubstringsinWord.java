package Strings;

public class SubstringsinWord {
    public static void main(String[] args) {
        String[] patterns = {"hi", "tie", "tin", "et", "ten", "t"};
        String word = "Hiten";
        System.out.println(numOfStrings(patterns, word));
    }
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
