package bitwise.bitwiseQuestions;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String[] words = {"aksd", "jjjikk", "ndhg", "k", "kdo"};
        String allowed = "ijk";
        System.out.println(countConsistentStrings(allowed, words));
    }
    static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            int j = 0;
            while(j < words[i].length()){
                if(!allowed.contains(words[i].charAt(j)+"")){
                    break;
                }
                j++;
            }
            if(j == words[i].length()){
                count++;
            }
        }
        return count;
    }
}
