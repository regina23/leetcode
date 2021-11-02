package algorithm._0014;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        int cnt = strs.length;
        for(int i = 1; i < cnt; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if(prefix.length() == 0){
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        int index = 0;
        while(index < length && s1.charAt(index) == s2.charAt(index)) {
            index ++;
        }
        return s1.substring(0, index);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] test = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(test));
    }
}
