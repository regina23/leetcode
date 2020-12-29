package p14;

public class CuttingRope {
    public static int cuttingRope(int n) {
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
        System.out.println(cuttingRope(5));  // 6
        System.out.println(cuttingRope(10));  // 36
        System.out.println(cuttingRope(120));  // 953271190
    }
}
