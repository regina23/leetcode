package p20;

public class IsNumber {
    public static boolean isNumber(String s) {
        s = s.trim();
        //排除三种情况。  空串，e前没有数字，只有.
        String regex = "\\s*|([+-]?\\.?[eE][\\s\\S]*)|([+-]?\\.)";
        if (s.matches(regex)) return false;
        //对不是特殊情况的字符串，进行正则匹配
        regex = "(([+-])?\\d*\\.?\\d*)([eE][+-]?\\d+)?";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        String s = "3.";
        Boolean res = isNumber(s);
        System.out.print(res); 
    }
}
