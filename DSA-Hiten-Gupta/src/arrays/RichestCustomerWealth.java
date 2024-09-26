package arrays;

import java.util.*;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] accounts = new int[n][m];

        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                accounts[i][j]= in.nextInt();
            }
        }
        System.out.print(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {

        int maxw = 0;

        for(int []a: accounts){
            int sum = 0;
            for (int j : a) {
                sum += j;
            }
            if (sum > maxw) {
                maxw = sum;
            }
        }
        return maxw;
    }
}
