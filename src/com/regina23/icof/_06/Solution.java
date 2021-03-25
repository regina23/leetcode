package com.regina23.icof._06;

import com.regina23.source.ListNode;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] res = new int[size];
        for(int i = 0; i < size; i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNode.createTestData("[1,3,2]");
        int[] res = solution.reversePrint(head);
        System.out.println(Arrays.toString(res));
    }
}
