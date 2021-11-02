package algorithm._0021;

import source.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val){
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = ListNode.createTestData("[1,2,4]");
        ListNode l2 = ListNode.createTestData("[1,3,4]");
        ListNode res = solution.mergeTwoLists(l1, l2);
        System.out.println(res.val);
    }
}
