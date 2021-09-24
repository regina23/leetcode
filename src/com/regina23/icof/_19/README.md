# 剑指 Offer 19. 正则表达式匹配

## 题目描述

请实现一个函数用来匹配包含'. '和'\*'的正则表达式。模式中的字符'.'表示任意一个字符，而'\*'表示它前面的字符可以出现任意次（含0次）。在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab\*ac\*a"匹配，但与"aa.a"和"ab\*a"均不匹配。

**示例1**

> 输入: s = "aa"  p = "a"
> 输出: false
> 解释: "a" 无法匹配 "aa" 整个字符串。

**示例2**

> 输入: s = "aa"  p = "a*"
> 输出: true
> 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。

**示例 3**

> 输入: s = "ab"  p = ".*"
> 输出: true
> 解释: ".\*" 表示可匹配零个或多个（'*'）任意字符（'.'）。

**示例 4**

> 输入: s = "aab"  p = "c\*a\*b"
> 输出: true
> 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。

**示例 5**

> 输入: s = "mississippi"  p = "mis\*is\*p\*."
> 输出: false

**限制**

> - s 可能为空，且只包含从 a-z 的小写字母。
> - p 可能为空，且只包含从 a-z 的小写字母以及字符 . 和 \*，无连续的 '*'。

## 解决方案

假设主串为A，长度为n；模式串为B，长度为m。从B[m-1]开始考虑，B[m-1]可能为正常字符、'*'和'.'三种情况。

- 如果B[m-1]为正常字符，则看B[m-1]与A[n-1]是否相等。如果相等，则看B[m-2]与A[n-2]匹配情况；否则，匹配失败。

- 如果B[m-1]为'.'，可匹配任意字符，匹配则看B[m-2]与A[n-2]匹配情况。

- 如果B[m-1]为'*'，记B[m-2] = c，表示c可重复0次或多次。
    - 如果B[m-2] ≠ A[n-1]，表示B[m-2]重复0次，则看B[m-3]与A[n-1]匹配情况。
    - 如果B[m-2] = A[n-1]，表示B[m-2]重复至少一次，则看B[m-2]与A[n-2]匹配情况，直到匹配结束。

### 1. 动态规划

**转移方程**

设辅助数组f[n+1][m+1]，f[i][j]表示A的前i个和B的前j个能否匹配。

- 对于前两种情况：f[i][j] = f[i-1][j-1]

- 对于第三种情况：
    - 如果c重复0次，f[i][j] = f[i][j-2]
    - 如果c重复多次，f[i][j] = f[i-1][j]

**初始条件**

考虑空串和空正则的情况。

- 空正则的情况：
    - 空串和空正则匹配，f[0][0] = true
    - 非空串和空正则不匹配，f[1][0] = ... = f[n][0] = false

- 非空正则的情况：空串和非空串都需要计算

```Java
class Solution {
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
}
```

### 2. 递归

```Java
class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        // 空正则
        if (m == 0) {
            return n == 0;
        }
        // 非空正则
        if (m > 1 && p.charAt(1) == '*') {
            // 有 * ,匹配0次或多次
            return isMatch(s, p.substring(2)) || (n > 0 && compare(s, p)) && isMatch(s.substring(1), p);
        } else {
            // 无 *
            return n > 0 && compare(s, p) && isMatch(s.substring(1), p.substring(1));
        }
    }
    private boolean compare(String s, String p) {
        return s.charAt(0) == p.charAt(0) || p.charAt(0) == '.';
    }
}
```
