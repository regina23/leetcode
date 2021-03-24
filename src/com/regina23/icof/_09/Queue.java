package p09;

import java.util.Deque;
import java.util.LinkedList;

public class Queue {
    static class CQueue {
        Deque<Integer> stack1;
        Deque<Integer> stack2;

        public CQueue() {
            stack1 = new LinkedList<Integer>();
            stack2 = new LinkedList<Integer>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (stack2.isEmpty()) {
                return -1;
            } else {
                int deleteItem = stack2.pop();
                return deleteItem;
            }
        }
    }

    public static void main(String[] args) {
        CQueue testQueue1 = new CQueue();
        testQueue1.appendTail(3);
        System.out.println(testQueue1.deleteHead());
        System.out.println(testQueue1.deleteHead());

        CQueue testQueue2 = new CQueue();
        System.out.println(testQueue1.deleteHead());
        testQueue2.appendTail(5);
        testQueue2.appendTail(2);
        System.out.println(testQueue2.deleteHead());
        System.out.println(testQueue2.deleteHead());

    }
}