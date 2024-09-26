package Strings;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)()G";
        System.out.println(interpret(command));
    }
    static String interpret(String command) {
        String str = command.replace("()", "o");
        return str.replace("(al)", "al");
    }
}
