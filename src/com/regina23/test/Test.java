package com.regina23.test;

import com.regina23.source.ListNode;

public class Test {
    public ListNode mergeLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);

    }

    public ListNode merge(ListNode[] lists, int begin, int end) {
        if(begin > end) {
            return null;
        }
        if(begin == end) {
            return lists[begin];
        }
        int mid = (begin + end) / 2;
        return mergeTwoLists(merge(lists,begin,mid),merge(lists, mid+1, end));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return temp.next;
    }
}
