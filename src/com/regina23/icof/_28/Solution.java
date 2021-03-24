package com.regina23.icof._28;

import com.regina23.source.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return recur(root.left, root.right);
    }
    boolean recur(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null|| left.val != right.val)
            return false;
        return recur(left.left, right.right) && recur(left.right, right.left);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testRoot = TreeNode.constructTree(new Integer[] {1, 2, 2, 3, 4, 4, 3});
        boolean res = solution.isSymmetric(testRoot);
        System.out.println(res);
    }
}