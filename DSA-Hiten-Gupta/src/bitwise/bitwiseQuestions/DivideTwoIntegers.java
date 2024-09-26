package bitwise.bitwiseQuestions;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1) return 2147483647;

        int sign = (dividend > 0) && (divisor > 0) ? 1 : -1;

        long divD = Math.abs((long)(dividend));
        long divS = Math.abs((long)(divisor));

        long quotient = 0;

        while(divD >= divS){
            long tempD = divS;
            long multiple = 1;
            while(divD >= (tempD<<1)){
                tempD = tempD << 1;
                multiple = multiple << 1;
            }
            divD -= tempD;
            quotient += multiple;
        }
        return (int)(sign*quotient);
    }
}
