// n个数据 k个最小

public class test {
    // today is monday.
    // monday is today.
    public static void main(String[] args) {
        String s = "today-is-monday.";
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        String[] sList = s.split("-");
        int len = sList.length;
        StringBuilder sb = new StringBuilder();
        for(int i = len - 1; i >= 1; i--) {
            sb.append(sList[i] + "-");
        }
        sb.append(sList[0]);
        return sb.toString();
    }
    public static String[] rev(String s) {
        int len = s.length();
        String[] sList = new String[len];
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '-') {

            }
        }
    }
    public static String subString(int begin, int end) {
        if(begin > 0 && ) {

        }
    }
}
