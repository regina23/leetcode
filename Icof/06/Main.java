package codinginterviews06;

/**从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * 
 * @author: Regina23
 * 
 */

public class Main {
    public static void main(String[] args) {    
        int[] input = {1, 3, 2};
        ListNode head = input;
        test(head);


    }

    private static void test(ListNode h) {
        Solution solution = new Solution();
        int[] res = solution.reversePrint(h);
        long begin = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println( "res = " + res);
		System.out.println("耗时：" + (end - begin) + "ms");
    }

}