package p20;

import java.util.regex.Pattern;

public class IsNumber {
    public static boolean isNumber(String s) {
        String regex = "[+-]?[0-9]+([.][0-9]+)?|[+-]?[1-9]{1}[eE][+-}?[0-9]+";
        return Pattern.matches(regex, s);
    }

    public static void main(String[] args) {
        System.out.println(isNumber("+100"));
    }
}
