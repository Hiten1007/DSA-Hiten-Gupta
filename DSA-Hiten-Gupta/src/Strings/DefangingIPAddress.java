package Strings;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "A27hdi.hf.fus.fil";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
/*        String x = "";
        for(int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if(ch == '.'){
                x += "[.]";
            }
            else{
                x += ch;
            }
        }
        return x;

 */
        return address.replace(".", "[.]");
    }
}
