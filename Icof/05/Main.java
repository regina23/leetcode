package codinginterviews05;


/**替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * 
 * 限制：0 <= s.length <= 10000
 * 
 * @author: Regina23
 */

public class Main {
    public static void main(String[] args) {
        String testS = "We are happy.";
        test(testS);
    }

    private static void test(String s) {
        Solution solution = new Solution();
        String res = solution.replaceSpace(s);
        long begin = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println( "res = " + res);
		System.out.println("耗时：" + (end - begin) + "ms");
    }

}
