package Searching.SearchingPracticeQuestions;

import java.util.ArrayList;
import java.util.*;

public class Intersectionof2Arrays {
    public static void main(String[] args) {
        int[] num1 = {4,9,5};
        int[] num2 ={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(num1,num2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);  // Ensure nums1 is sorted
        Arrays.sort(nums2);  // Ensure nums2 is sorted

        List<Integer> list = new ArrayList<>();

        // Ensure we always binary search in the longer array
        if (nums1.length > nums2.length) {
            for (int num : nums2) {
                if (binarysearchAndRemove(num, nums1)) {
                    list.add(num);
                }
            }
        } else {
            for (int num : nums1) {
                if (binarysearchAndRemove(num, nums2)) {
                    list.add(num);
                }
            }
        }

        // Convert list to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    // This method performs binary search and removes the found element from the array
    static boolean binarysearchAndRemove(int target, int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                // Mark this element as used
                nums[mid] = Integer.MAX_VALUE;
                Arrays.sort(nums);  // Sort the array again to maintain order
                return true;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
