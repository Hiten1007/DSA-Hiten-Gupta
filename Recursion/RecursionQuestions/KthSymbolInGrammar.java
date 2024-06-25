package Recursion.RecursionQuestions;

public class KthSymbolInGrammar {
    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        System.out.println(kthGrammar(n, k));
    }
    static int kthGrammar(int n, int k) {
       if(n == 1){
           return 0;
       }
       if(k%2 == 1) return kthGrammar(n - 1, k/2 + 1);
       return kthGrammar(n - 1, k/2) ^ 1;
    }
}
