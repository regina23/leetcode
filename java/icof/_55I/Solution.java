package icof._55I;

import source.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testRoot = TreeNode.constructTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        int res = solution.maxDepth(testRoot);
        System.out.println(res);
    }
}