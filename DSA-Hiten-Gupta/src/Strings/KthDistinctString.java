package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KthDistinctString {
    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        System.out.println(kthDistinct(arr, 1));
    }
    static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String a : arr)
            map.put(a,map.getOrDefault(a,0)+1);
        int count=1;
        for(String a : arr) {
            if(map.get(a)==1 && count++ ==k)
                return a;
        }
        return "";
    }
}
