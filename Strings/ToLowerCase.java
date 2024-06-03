package Strings;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hiten Gupta";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
/*        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                ans += (char)(s.charAt(i) + 32);
            }
            else{
                ans += s.charAt(i);
            }
        }
        return ans;

 */
        return s.toLowerCase();
    }
}
