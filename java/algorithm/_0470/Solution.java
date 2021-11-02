package algorithm._0470;


import java.util.Random;

public class Solution {
    public int rand7() {
        Random random = new Random();
        int i = random.nextInt(7) + 1; // [1, 7]
        return i;
    }

    public int rand10() {
        while(true) {
            int num = (rand7() - 1) * 7 + rand7();
            if(num <= 40) return num % 10 + 1;
            num = (num - 40 - 1) * 7 + rand7();
            if(num <= 60) return num % 10 + 1;
            num = (num - 60 - 1) * 7 + rand7();
            if(num <= 20) return num % 10 + 1;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rand7());
    }
}
