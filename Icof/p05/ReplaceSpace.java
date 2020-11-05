package p05;

public class ReplaceSpace {
    public static String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray()) {
            if(c == ' '){
                res.append("%20");
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String testS = "We are happy.";
        String res = replaceSpace(testS);
        System.out.println(res);
    }
}
