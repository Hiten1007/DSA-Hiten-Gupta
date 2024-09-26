package Strings;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String s = "Hiten";
        System.out.println(reversePrefix(s, 't'));
    }
    static String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        if(j != -1){
            return new StringBuilder(word.substring(0, j + 1)).reverse().toString().concat(word.substring(j + 1, word.length()));
        }
        return word;
       /* StringBuilder result  = new StringBuilder();
        int idx = -1;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                idx = i;
            }
        }
        if(idx!= - 1){
            for(int i = idx; i >= 0; i--){
                result.append(word.charAt(i));
            }
            result.append(word.substring(idx + 1));
            return result.toString();
        }
        return word;
        */
    }
}
