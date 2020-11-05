package p06;

import java.util.Stack;

class ReversePrint {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static int[] reversePrint(ListNode head) {
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
        
    }
}
