package Strings;

import java.util.Random;

public class RandomString {
    static String generate(int size){
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();
        for(int i = 0; i < size; i++){
            int num = 97 + (int)(26 * random.nextFloat());
            sb.append((char)(num));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate(26));
    }
}
