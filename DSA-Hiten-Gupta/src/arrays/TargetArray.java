package arrays;

import java.util.*;

public class TargetArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int[] index = {0, 1, 1, 2};
        int[] targetarray = (createTargetArray(arr, index));
        System.out.print(Arrays.toString(targetarray));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
