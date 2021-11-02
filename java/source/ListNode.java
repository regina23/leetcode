package source;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    /**
     * 创建测试用例
     *
     * @param data [xx, xx, xx]
     * @return {@link ListNode}
     */
    public static ListNode createTestData(String data) {
        if(data.equals("[]")) return null;
        data = data.substring(1, data.length() - 1);
        String[] split = data.split(",");
        int len = split.length;
        ListNode[] listNodes = new ListNode[len + 1];
        listNodes[0] = new ListNode(Integer.valueOf(split[0]));
        for(int i = 1; i < len; i++) {
            listNodes[i] = new ListNode(Integer.valueOf(split[i]));
            listNodes[i - 1].next = listNodes[i];
        }
        return listNodes[0];
    }

    /**
     * 打印链表
     */
    public static void print(ListNode listNode) {
        if(listNode == null) {
            System.out.println("null");
            return;
        }
        StringBuilder str = new StringBuilder("[" + String.valueOf(listNode.val));
        ListNode p = listNode.next;
        while(p != null) {
            str.append(",").append(String.valueOf(p.val));
            p = p.next;
        }
        System.out.println(str.append("]"));
    }

}