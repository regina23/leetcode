package com.regina23.icof._22;

import com.regina23.source.ListNode;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for(int i = 0; i < k; i++){
            former = former.next;
        }
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNode.createTestData("[1,2,3,4,5]");
        System.out.print(solution.getKthFromEnd(head, 2).val);
    }
}