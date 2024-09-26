package Searching.SearchingPracticeQuestions;

public class KokoEatingBananas{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int h = 8;
        System.out.println(minEatingSpeed(arr, h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(piles[i], max);
        }
        int start = 0;
        int end = max;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(findAns(piles, mid) > h){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
    static int findAns(int[] piles, int speed){
        double value = 0;
        for(int i = 0; i < piles.length; i++){
            value += Math.ceil((double)piles[i]/speed);
        }
        return (int) value;
    }
}
