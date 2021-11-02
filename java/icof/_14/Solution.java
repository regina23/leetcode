package icof._14;

public class Solution {
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
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.cuttingRope(5));  // 6
        System.out.println(solution.cuttingRope(10));  // 36
        System.out.println(solution.cuttingRope(120));  // 953271190
    }
}
