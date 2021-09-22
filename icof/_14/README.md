# 剑指offer 14.剪绳子

## 题目描述

给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0], k[1], ...k[m - 1] 。请问 k[0]\*k[1]\*...*k[m - 1] 可能的最大乘积是多少？

例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

**示例1**

> 输入：2
> 输出：1
> 解释：2 = 1 + 1, 1 × 1 = 1

**示例2**

>输入：10
>输出：36
>解释：10 = 3 + 3 + 4, 3 × 3 × 4 = 36

## 解决方案

### 数学推导

设将长度为 n 的绳子分为 a 段，即有 $n = n_1 + n_2 + ... + n_a$ ，

求 $max(n_1 \times n_2 \times ... \times n_a)$ 。

① 当 $n_1 = n_2 = ... = n_a$ 时，有 $max(n_1 \times n_2 \times ... \times n_a)$成立

② 最优解：$n_1 = n_2 = ... = n_a = 3$
    次优解：$n_1 = n_2 = ... = n_{a-1} = 3, n_a = 2$
    最差解：$n_1 = n_2 = ... = n_{a-2} = 3, n_{a-1} = n_a = 2$

```Java
class Solution {
    public int cuttingRope(int n) {
        long sum = 1;
        int mod = 1000000007;
        if(n <= 3) {
            return n - 1; 
        }
        int threeNum = n / 3;
        int remainder = n % 3;
        for(int i = 1; i <= threeNum-1; i++){
            sum *= 3;
            sum %= mod;
        }
        if(remainder == 0) {
            sum = sum * 3 % mod;
        } else if(remainder == 1) {
            sum = sum * 2 % mod;
            sum = sum * 2 % mod;
        } else {
            sum = sum * 3 % mod;
            sum = sum * 2 % mod;
        }
        return (int)sum;
    }
}
```





