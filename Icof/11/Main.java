package codinginterviews11;


public class Main {
    public static void main(String[] args) {
        int[] testList = {2, 7, 0};
        for(int t : testList){
            test(t);
        }


    }

    private static void test(int n) {
        Solution solution = new Solution();
        int res = solution.numWays(n);
        long begin = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println( "res = " + res);
		System.out.println("耗时：" + (end - begin) + "ms");
    }

}