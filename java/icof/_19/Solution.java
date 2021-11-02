package icof._19;

public class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] f = new boolean[n+1][m+1];

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= m; j++) {
                if (j == 0) {
                    // 空正则
                    f[i][j] = i == 0;
                } else {  
                    // 非空正则
                    if (p.charAt(j-1) != '*') {  
                        // 非 * 
                        if (i > 0 && (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.')) {
                            f[i][j] = f[i-1][j-1];
                        }
                    } else {  
                        // 有 *
                        if (j >= 2) {
                            // 匹配0次
                            f[i][j] |= f[i][j-2];
                        }
                        if (i >= 1 && j >= 2 && (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.')){
                            // 匹配多次                            
                            f[i][j] |= f[i-1][j];
                        }
                    }
                }
            }
        }
        return f[n][m];        
    }

    public static boolean isMatch2(String s, String p) {
        int n = s.length();
        int m = p.length();
        // 空正则
        if (m == 0) {
            return n == 0;
        }
        // 非空正则
        if (m > 1 && p.charAt(1) == '*') {
            // 有 * ,匹配0次或多次
            return isMatch2(s, p.substring(2)) || (n > 0 && compare(s, p)) && isMatch2(s.substring(1), p);
        } else {
            // 无 *
            return n > 0 && compare(s, p) && isMatch2(s.substring(1), p.substring(1));
        }
    }
    private static boolean compare(String s, String p) {
        return s.charAt(0) == p.charAt(0) || p.charAt(0) == '.';
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("aa", "a"));  // false
        System.out.println(solution.isMatch("aa", "a*"));  // true
        System.out.println(solution.isMatch("ab", ".*"));  // true
        System.out.println(solution.isMatch("aab", "c*a*b"));  // true
        System.out.println(solution.isMatch("mississippi", "mis*is*p*."));  // false
    }
}
