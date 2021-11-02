package algorithm._0005;

public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2) return s;
        boolean[][] dp = new boolean[n][n];  // dp[i][j]表示s[i][j]是否为回文字符串
        char[] charArray = s.toCharArray();
        int maxLen = 1;
        int begin = 0;
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
        }
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < j; i++) {
                if(charArray[i] != charArray[j]){
                    dp[i][j] = false;
                } else {
                    if( j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if(dp[i][j] == true && maxLen < j - i + 1) {
                    maxLen = j - i + 1;
                    begin = i;
                }

            }
        }
        return s.substring(begin, begin + maxLen);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "babad";
        System.out.println(solution.longestPalindrome(s));
    }
}
