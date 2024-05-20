package arrays;

public class EvenDigitNumbersArray {
    public static void main(String[] args) {
        int[] arr = {12, -327, -23, 1, 2231};
        System.out.print(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int element : nums){
            if(element < 0){
                element *= -1;
            }
            if(((int)(Math.log10(element)))%2 == 1){
                count++;
            }
        }
        return count;
    }
}
