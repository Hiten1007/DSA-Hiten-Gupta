package math;

public class NewtonSqrt {
    public static void main(String[] args) {
        double n = 40;
        System.out.println(sqrt(n));
        System.out.println(Math.sqrt(n));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x + n/x);
            if(Math.abs(root - x) < 0.000001){
                break;
            }
            x = root;
        }
        return root;
    }
}
