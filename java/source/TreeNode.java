package com.regina23.source;


import java.util.Deque;
import java.util.LinkedList;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) {
        val = x;
    }

    /**
     * 构建树
     *
     * @param data Integer[]
     * @return {@link TreeNode}
     */
    public static TreeNode constructTree(Integer[] data) {
        if(data.length == 0) return new TreeNode(0);
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        // 创建根节点
        TreeNode root = new TreeNode(data[0]);
        nodeQueue.offer(root);
        TreeNode cur;
        // 记录当前行节点的数量（上一行中非空节点的数量 * 2）
        int lineNodeNum = 2;
        // 记录当前行数字在数组中的起始位置
        int startIndex = 1;
        // 记录数组中剩余元素数量
        int restLength = data.length - 1;
        // 创建其余节点
        while(restLength > 0) {
            for(int i = startIndex; i < startIndex + lineNodeNum; i += 2) {
                if(i == data.length) return root;
                cur = nodeQueue.poll();
                if(data[i] != null) {
                    cur.left = new TreeNode(data[i]);
                    nodeQueue.offer(cur.left);
                }
                if(i + 1 == data.length) return root;
                if(data[i + 1] != null) {
                    cur.right = new TreeNode(data[i + 1]);
                    nodeQueue.offer(cur.right);
                }
            }
            startIndex += lineNodeNum;
            restLength -= lineNodeNum;
            lineNodeNum = nodeQueue.size() * 2;
        }
        return root;

    }

    // 前序遍历
    public static void preOrder(TreeNode root) {
        if(root == null) return;
        System.out.print(root.val + ",");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    public static void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val + ",");
        inOrder(root.right);
    }

    // 后序遍历
    public static void aftOrder(TreeNode root) {
        if(root == null) return;
        aftOrder(root.left);
        aftOrder(root.right);
        System.out.print(root.val + ",");
    }

    private static final String space = "      ";

    /**
     * 打印树
     *
     * @param root
     */
    public static void print(TreeNode root) {
        print(root, 0);
    }

    private static void print(TreeNode node, int deep) {
        if(node == null) {
            printSpace(deep);
            System.out.println("#");
            return;
        }
        print(node.right, deep + 1);
        printSpace(deep);
        printNode(node.val);
        print(node.left, deep + 1);
    }
    private static void printSpace(int count) {
        for(int i = 0; i < count; i++) {
            System.out.printf(space);
        }
    }

    private static void printNode(int val) {
        StringBuilder res = new StringBuilder(val + "<");
        int spaceNum = space.length() - res.length();
        for (int i = 0; i < spaceNum; i++) {
            res.append(" ");
        }
        System.out.println(res);
    }

    /**
     * 查找值为k的节点
     *
     * @param root
     * @param k
     * @return {@link TreeNode}
     */
    public static TreeNode findElement(TreeNode root, int k) {
        while(root.val != k) {
            if(root.left != null){
                root = root.left;
            }
            if(root.right != null) {
                root = root.right;
            }
        }
        return root;
    }
}