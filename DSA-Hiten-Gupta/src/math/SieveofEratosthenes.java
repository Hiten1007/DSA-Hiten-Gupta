package math;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        int n = 41;
        sieve(n);
    }
    static void sieve(int n){
        boolean[] isPrime = new boolean[n + 1];
        for(int i = 2; i<= n; i++){
            if(!isPrime[i]){
                for(int j = 2 * i; j <= n; j+= i){
                    isPrime[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(!isPrime[i]){
                System.out.println(i);
            }
        }
    }
}
