import java.util.Arrays;

public class SqrtDecompositionAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8};
        int n = arr.length;

        int sqrt = (int)Math.sqrt(n);

        int[] blocks = new int[sqrt + 1];

        int blocks_id = -1;
        for(int i = 0; i < n; i++){
            if(i % sqrt == 0){
                blocks_id++;
            }
            blocks[blocks_id] += arr[i];
        }

        System.out.println(Arrays.toString(blocks));
    }

    public int query(int[] arr, int[] blocks, int l, int r, int sqrt){
        int ans = 0;

        while(l % sqrt != 0 && l < r && l != 0){
            ans += arr[l++];
        }

        while(l + sqrt <= r ){
            ans += blocks[l/sqrt];
            l += sqrt;
        }

        while(l <= r){
            ans += arr[l];
            l++;
        }

        return ans;
    }

    public void update(int[] blocks, int[] arr, int i, int val, int sqrt){
        blocks[i/sqrt] += (val - arr[i]);
        arr[i] = val;
    }
}
