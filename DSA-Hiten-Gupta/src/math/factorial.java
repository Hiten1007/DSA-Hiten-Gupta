package math;

public class factorial {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(fact(n));
    }
    static long fact(int N){
        // code here
        if(N <= 1){
            return 1;
        }


        return (long)(N)*fact(N - 1);
    }
}
