package arrays;

public class xorqueriesofsubarray {
    public int[] xorQueries(int[] arr, int[][] queries) {
       int[] pre = new int[arr.length];
       pre[0] = arr[0];
       for(int i = 1; i < pre.length; i++){
           pre[i] = pre[i - 1] ^ arr[i];
       }

       int[] res = new int[queries.length];
       for(int i = 0; i < queries.length; i++){
           int k = queries[i][0];
           int j = queries[i][1];

           if(k == 0){
               res[i] = pre[j];
           }
           else{
               res[i] = pre[j]^pre[i - 1];
           }
       }
       return res;
    }
}
