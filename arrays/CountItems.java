package arrays;

import java.util.*;

public class CountItems {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("r", "r", "r"));
        items.add(Arrays.asList("r", "r", "lenovo"));

        System.out.print(countMatches(items, "name", "r"));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("color") ? 1 : (ruleKey.equals("name") ? 2 : 0);

        return match(items, index, ruleValue, 0);
    }
    static int match(List<List<String>> items, int key, String ruleValue, int index){
        if(index == items.size()){
            return 0;
        }
        else if(items.get(index).get(key).equals(ruleValue)){
            return 1 + match(items, key, ruleValue, index + 1);
        }
        else{
            return match(items, key, ruleValue, index + 1);
        }
    }
}
