package arrays;

import java.util.HashMap;

public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(minCostToMoveChips(arr));
    }
    static public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int i = 0; i < position.length; i++){
            if((position[i]&1) == 0){
                odd++;
            }
            else{
                even++;
            }
        }
        return Math.min(odd, even);
    }
}
