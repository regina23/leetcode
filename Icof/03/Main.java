package codinginterviews03;

/**找出数组中重复的数字。
 * 
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 
 * 输入：[2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3 
 * 限制：2 <= n <= 100000
 * 
 * @author Regina23
 */

public class Main {
	public static void main(String[] args) {
		int[] testTable = { 3, 3, 3 };
		test(testTable);
	}

	private static void test(int[] input) {
		Solution solution = new Solution();
		int output;
		long begin = System.currentTimeMillis();
		output = solution.findRepeatNumber(input);
		long end = System.currentTimeMillis();
		System.out.println( "res = " + output);
		System.out.println("耗时：" + (end - begin) + "ms");
	}
}