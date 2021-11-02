package algorithm._0083;

import source.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode cur = head;
        while(cur.next != null) {
            if(cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode testHead = ListNode.createTestData("[1,1,2]");
        ListNode res = solution.deleteDuplicates(testHead);
        System.out.println(res.val);
    }
}