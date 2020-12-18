

import java.util.Arrays;

class BreakfastNumber {
    public static int breakfastNumber1(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int i = 0, j = drinks.length-1, cnt = 0;
        while(i < staple.length && j >= 0) {
            if(staple[i] + drinks[j] <= x) {
                cnt += j + 1;
                cnt %= 1000000007; 
                i++;
            } else {
                j--;
            }
        }
        return cnt;
    } 
    public int breakfastNumber2(int[] staple, int[] drinks, int x) {
        int cnt = 0;
        int[] tmp = new int[x+1];
        Arrays.sort(staple);
        Arrays.sort(drinks);
        for(int num : staple){
            if(num <= x){
                tmp[num] += 1;
            }
        }
        for(int i = 2; i<= x; i++){
            tmp[i] += tmp[i-1];
        }
        for(int drink : drinks) {
            int rest = x - drink;
            if(rest <= 0) {
                continue;
            }
            cnt += tmp[rest];
            cnt %= 1000000007;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] staple = {2, 1, 1};
        int[] drinks = {8, 9, 5, 1};
        int x = 15;
        int res1 = breakfastNumber1(staple, drinks, x);
        // int res2 = BreakfastNumber1(staple, drinks, x);
        System.out.println(res1);
    }
}
