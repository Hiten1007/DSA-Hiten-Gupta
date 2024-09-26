package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 4, 5};
        System.out.println(search(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findLastIndex(arr, 4, arr.length - 1));
        System.out.println(findAll(arr, 4, 0, new ArrayList<>()));
    }
    static boolean search(int[] arr, int target, int index){
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }
    static int findLastIndex(int[] arr, int target, int index){
        if(index == -1) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findLastIndex(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
           return findAll(arr, target, index + 1, list);
    }
}
