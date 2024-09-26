package Sorting.SortingQuestions;

public class AverageSalary {
    public static void main(String[] args) {
        int[] arr = { 2000, 3003, 1020, 2210};
        System.out.println(average(arr));
    }
    static double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        for(int i = 1; i < salary.length; i++){
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }

        int sum = 0;
        for(int i = 0; i < salary.length; i++){
            if(salary[i] != max && salary[i] != min){
                sum+=salary[i];
            }
        }
        return ((double)sum)/(salary.length - 2);
    }
}
