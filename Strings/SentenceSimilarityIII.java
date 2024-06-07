package Strings;

public class SentenceSimilarityIII {
    public static void main(String[] args) {
        String sentence1 = "My Haley";
        String sentence2 = "My name is Haley";
        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }
    static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int i = 0;
        int j = 0;
        while(i < s1.length && j < s2.length){
            if(!s1[i].equals(s2[j])) break;
            i++;
            j++;
        }
        if(i == s1.length || j == s2.length) return true;
        int n = s1.length - 1;
        int m = s2.length - 1;
        while(i <= n && j <= m){
            if(!s1[n].equals(s2[m])) return false;
            n--;
            m--;
        }
        return true;
    }
}
