package arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {
                {2033,2034},
                {2039,2047},
                {1998,2042},
                {2047,2048},
                {2025,2029},
                {2005,2044},
                {1990,1992},
                {1952,1956},
                {1984,2014}};
        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int i=0; i<logs.length; i++){
            arr[logs[i][0]-1950]++;
            arr[logs[i][1]-1950]--;
        }
        for(int i=1; i<101; i++){
            arr[i] += arr[i-1];
        }
        int maxVal=0, maxYear = 1950;
        for(int i=0; i<101; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
                maxYear = 1950+i;
            }
        }
        return maxYear;
    }
}
