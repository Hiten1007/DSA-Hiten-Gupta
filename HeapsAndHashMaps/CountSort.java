package HeapsAndHashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class CountSort {
    static void countSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }

        int[] count = new int[max + 1];

        for (int j : arr) {
            count[j]++;
        }

        int index = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] != 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }

    }

    static void countSortHash(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int index = 0;

        for(int i = min; i <= max; i++){
            int count = map.getOrDefault(i, 0);
            for(int j = 0; j < count; j++){
                arr[index] = i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2, 5, 6, 2, 7, 9, 1, 4, 0, 5};
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
}
