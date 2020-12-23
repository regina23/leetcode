package p16;

public class Power {
    public static double myPow(double x, int n) {
        double res = 1.0;
        if(n == 0) {
            return 1;
        }
        for(int i = n; i != 0; i /= 2, x *= x) {
            if (i % 2 != 0) {
                res *= x;
            }
        }
        return n < 0 ? 1.0/res : res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));  // 1024.00000
        System.out.println(myPow(2.10000, 3));  // 9.26100
        System.out.println(myPow(2.00000, -2));  // 0.25000
    }
}
