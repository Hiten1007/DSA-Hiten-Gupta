package Recursion.RecursionQuestions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        int target = 5;
        System.out.println(combinationSum(arr, target));
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(res, candidates, target, curr, 0);

        return res;
    }

    static void helper(List<List<Integer>> res, int[] arr, int target,List<Integer> curr,int ind){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || ind == arr.length){
            return;
        }
        for(int i = ind; i < arr.length; i++){

                curr.add(arr[i]);

                helper(res, arr, target - arr[i], curr, i);

                curr.remove(curr.size() - 1);
        }
    }
}
