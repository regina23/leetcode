package com.regina23.icof._27;

import com.regina23.source.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testRoot = TreeNode.constructTree(new Integer[] {4, 2, 7, 1, 3, 6, 9});
        TreeNode res = solution.mirrorTree(testRoot);
        System.out.println(res.val);
    }
}