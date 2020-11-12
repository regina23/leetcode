package p10I;

public class Fib {
    // recursion
    public static int fib1(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return (fib1(n-1) + fib1(n-2)) % 1000000007;
        }
    }

    // set an array
    public static int fib2(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            int[] fibList = new int[n+1];
            fibList[0] = 0;
            fibList[1] = 1;
            for(int i = 2; i <= n; i++) {
                fibList[i] = (fibList[i-1] + fibList[i-2]) % 1000000007;
            }
            return fibList[n];
        }
    }

    // DP
    public static int fib3(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        int testNum = 8; 
        int res = fib3(testNum);  // res = 21
        System.out.println(res);
    }
}