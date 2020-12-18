package p14;

import java.lang.Math;

class CuttingRope {
    public static int cuttingRope(int n) {
        int sum = 0;
        if(n <= 3) {
            return n - 1; 
        }
        int threeNum = n / 3;
        int remainder = n - 3 * threeNum;
        if(remainder == 0) {
            sum += Math.pow(3, threeNum);
        } else if(remainder == 1) {
            sum += Math.pow(3, threeNum - 1) * 2 * 2;
        } else {
            sum += Math.pow(3, threeNum) * 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}
