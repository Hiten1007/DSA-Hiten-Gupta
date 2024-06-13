package bitwise.bitwiseQuestions;

public class AddBinary {
    public static void main(String[] args) {
        String a = "10101010101010100101000001111";
        String b = "11010101011110101011111011101101";
        System.out.println(addBinary(a, b));
    }
    static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder str = new StringBuilder();
        while(i >= 0 || j >= 0 || carry == 1){
            if(i >= 0){
                carry += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                carry += b.charAt(j) - '0';
                j--;
            }
            str.append(carry%2);
            carry /= 2;
        }
        return str.reverse().toString();
    }
}
