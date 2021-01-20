package p06;

import java.util.Stack;

public class ReversePrint {


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
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        int[] res = reversePrint(head);
        for(int each : res) {
            System.out.println(each);
        }
    }
}
