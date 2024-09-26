package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.lang.Integer.parseInt;

public class minimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        int[] arr = new int[timePoints.size()];
        for(int i = 0; i < timePoints.size(); i++){
            int hours = parseInt(timePoints.get(i).substring(0, 2));
            hours*= 60;
            int minutes = parseInt(timePoints.get(i).substring(3));
            arr[i] = hours + minutes;
        }
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            ans = Math.min(ans, arr[i - 1] - arr[i]);
        }
        return Math.min(ans, 1440 + arr[0] - arr[arr.length - 1]);
    }

}
