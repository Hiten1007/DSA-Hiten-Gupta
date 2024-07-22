package HeapsAndHashMaps;

import java.util.Arrays;

public class RadixSort {
    static void radixSort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();

        for(int exp = 1; max/exp > 0; exp *= 10){
            countSort(arr, exp);
        }
    }

    static void countSort(int[] arr, int exp){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for(int i = 0; i < arr.length; i++){
            count[(arr[i]/exp)%10]++;
        }

        for(int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i - 1];
        }

        for(int i = n - 1; i >= 0; i--){
            output[count[(arr[i]/exp) % 10] - 1] = arr[i];
            count[(arr[i]/exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {1232, 8273, 234, 987, 821, 231232, 12322};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
