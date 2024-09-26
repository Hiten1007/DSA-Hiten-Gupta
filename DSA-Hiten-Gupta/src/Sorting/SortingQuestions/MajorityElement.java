package Sorting.SortingQuestions;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 1, 1};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        int count = 1;
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(temp == nums[i]){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    temp = nums[i];
                    count = 1;
                }
            }
        }
        return temp;
    }
}
