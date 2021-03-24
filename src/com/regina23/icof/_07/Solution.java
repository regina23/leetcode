package com.regina23.icof._07;

import com.regina23.source.TreeNode;
import java.util.HashMap;

public class Solution {
    int[] preorder;  //保留先序遍历
    HashMap<Integer, Integer> dic  = new HashMap<>();  // 标记中序遍历
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }
    TreeNode recur(int root, int left, int right) {
        if(left > right) return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i = dic.get(preorder[root]);
        node.left = recur(root + 1, left, i - 1);
        node.right = recur(root + i - left + 1, i + 1, right);
        return node;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[] {9, 3, 15, 20, 7};
        TreeNode res = solution.buildTree(preorder, inorder);
        System.out.println(res.val);

    }

}
