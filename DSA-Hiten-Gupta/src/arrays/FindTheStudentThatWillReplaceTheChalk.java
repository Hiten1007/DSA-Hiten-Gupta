package arrays;

public class FindTheStudentThatWillReplaceTheChalk {
    public int chalkReplacer(int[] chalk, int k) {
        return helper(chalk, k);
//        int x = 0;
//        for(int i = 0; k >= 0; i++){
//            if(i == chalk.length){
//                i = 0;
//            }
//            if(k < chalk[i]){
//                x = i;
//                break;
//            }
//            else{
//                k -= chalk[i];
//            }
//        }
//        return x;
    }
    static int helper(int[] chalk, int k){
        int chalk_sum = 0;
        for(int i = 0; i < chalk.length; i++){
            chalk_sum += chalk[i];
            if(k - chalk_sum < 0){
                return i;
            }
        }
        return helper(chalk, k % chalk_sum);
    }
}
