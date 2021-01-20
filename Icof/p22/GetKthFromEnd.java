package p22;

public class GetKthFromEnd {
    public static ListNode getKthFromEnd(ListNode head, int k) {
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.print(getKthFromEnd(head, 2).val);
    }
}