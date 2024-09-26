package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        int[] arr = {4, 1, 4, 4};
        System.out.println(subset3duplicate(arr));
    }
    static void subsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p + ch, up.substring(1));
        subsets(p, up.substring(1));
    }
    static ArrayList<String> subsets2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsets2(p + ch, up.substring(1));
        ArrayList<String> right = subsets2(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static List<List<Integer>> subset3(int[] arr){
        List<List<Integer>> outer  = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }

    static List<List<Integer>> subset3duplicate(int[] arr){
        List<List<Integer>> outer  = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j = start; j < n; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
