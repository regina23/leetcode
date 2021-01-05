package p18;

public class DeleteNode {
    public static ListNode deleteNode(ListNode head, int val) {
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
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        System.out.println(deleteNode(head, 4).val);
        System.out.println(deleteNode(head, 1).val);

    }
}
