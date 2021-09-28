package com.regina23.icof._55II;

import com.regina23.source.TreeNode;
import com.sun.source.tree.Tree;

public class Solution {

    /** 从顶至底（先序遍历，判断深度）
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(depth(root.left)-depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right))
            return true;
        return false;
    }
    public int depth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
     */

    // 从底至顶（后序遍历，剪枝）
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }
    public int recur(TreeNode root) {
        if(root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left-right) < 2 ? Math.max(left, right) + 1 : -1;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testRoot = TreeNode.constructTree(new Integer[] {3, 9, 20, null, null, 15, 7});
        boolean res = solution.isBalanced(testRoot);
        System.out.println(res);
    }

}