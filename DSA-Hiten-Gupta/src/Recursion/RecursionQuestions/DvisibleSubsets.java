package Recursion.RecursionQuestions;

import java.util.*;
import java.lang.*;

public class DvisibleSubsets
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

                for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextInt();
                }

                List<Integer> result = findSubset(arr, N);
                if (result.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(result.size());
                    for (int index : result) {
                        System.out.print((index + 1) + " ");
                    }
                    System.out.println();
                }
    }

    private static List<Integer> findSubset(int[] arr, int N) {
        List<Integer> subset = new ArrayList<>();
        boolean found = backtrack(arr, N, 0, 0, subset);
        return found ? subset : new ArrayList<>();
    }

    private static boolean backtrack(int[] arr, int N, int index, int currentSum, List<Integer> subset) {
        if (currentSum % N == 0 && !subset.isEmpty()) {
            return true;
        }
        if (index >= arr.length) {
            return false;
        }

        // Include the current element
        subset.add(index);
        if (backtrack(arr, N, index + 1, currentSum + arr[index], subset)) {
            return true;
        }
        subset.remove(subset.size() - 1);

        // Exclude the current element
        return backtrack(arr, N, index + 1, currentSum, subset);
    }
}
