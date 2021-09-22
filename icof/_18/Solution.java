package com.regina23.icof._18;

import com.regina23.source.ListNode;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if (head.val == val) {
            return head.next;
        }
        // 寻找删除节点的前一个节点
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    public static ListNode deleteNodeRecursion(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if (head.val == val) {
            return head.next;
        }
        head.next = deleteNodeRecursion(head.next, val);
        return head;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNode.createTestData("[4,5,1,9]");
        System.out.println(solution.deleteNode(head, 4).val);
        System.out.println(solution.deleteNode(head, 1).val);

    }
}
