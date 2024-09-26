package Searching.Linearsearch;

public class Basiclinearsearch {
    public static void main(String[] args) {
        int[] arr = {5, 23, -17, 9, 28, 13, -11};
        int target = 28;
        int ans = linearsearch(arr, target);
        int ans2 = linearsearch2(arr, target);
        boolean ans3 = linearsearch3(arr, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }

    static int linearsearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearsearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
