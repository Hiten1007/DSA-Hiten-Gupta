package Recursion;

public class SkipAString {
    public static void main(String[] args) {
        String s = "bccdbdAppfbsbsApplebdbsbs";
        String b = "uhdghfed";
        System.out.println(skip(s));
        System.out.println(skipOnlyApp(s));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("Apple")){
            return skip(up.substring(5));
        }
        else{
            return up.charAt(0) + skip(up.substring(1));
        }
    }
    static String skipOnlyApp(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("App") && !(up.startsWith("Apple"))){
            return skipOnlyApp(up.substring(3));
        }
        else{
            return up.charAt(0) + skipOnlyApp(up.substring(1));
        }
    }
}
