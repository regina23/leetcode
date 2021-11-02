package algorithm._0206;


import source.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNode.createTestData("[1,2,3,4,5]");
        ListNode res = solution.reverseList(head);
        System.out.println(res.val);
    }
}
