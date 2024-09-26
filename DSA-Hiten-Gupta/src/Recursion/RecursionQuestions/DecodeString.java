package Recursion.RecursionQuestions;

public class DecodeString {
    public static void main(String[] args) {
        String x = "3[a2[b]]";
        System.out.println(decodeString(x));
    }
   static String decodeString(String s) {
       StringBuilder ans = new StringBuilder();
       int i = 0;
       while(i < s.length()) {
           char val = s.charAt(i);
           if (Character.isDigit(val)) {
               int start = i;
               while (Character.isDigit(s.charAt(i))) {
                   i++;
               }
               int a = Integer.parseInt(s.substring(start, i));

               i++;

               int count = 1;
               int startBracket = i;
               while (count > 0) {
                   if (s.charAt(i) == '[') count++;
                   if (s.charAt(i) == ']') count--;
                   i++;
               }

               String inner = s.substring(startBracket, i - 1);
               String decoded = decodeString(inner);

               for (int j = 0; j < a; j++) {
                   ans.append(decoded);
               }
           } else {
               ans.append(val);
               i++;
           }
       }
       return ans.toString();
   }
}
