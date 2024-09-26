package bitwise.bitwiseQuestions;

public class PrimeNumberOfSetBits {
    public static void main(String[] args) {
        int left = 4;
        int right = 17;
        System.out.println(countPrimeSetBits(left, right));
    }
    static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            if(isPrimeSetBits(i)){
                count++;
            }
        }
        return count;
    }
    static boolean isPrimeSetBits(int n){
        int setBits = 0;
        while(n > 0){
            n = n & (n - 1);
            setBits++;
        }
        if(setBits <= 1) return false;
        for(int i = 2; i * i <= setBits; i++){
            if((setBits)%i==0){
                return false;
            }
        }
        return true;
    }
}
