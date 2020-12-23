package p15;

public class HammingWeight {
    public static int hammingWeight(int n) {
        int cnt = 0;
        while(n != 0) {
            cnt += n & 1;  // 与运算判断最右位是0或1
            n >>>= 1;  // 无符号右移1位
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
