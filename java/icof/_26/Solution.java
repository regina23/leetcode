package icof._26;

import source.TreeNode;

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false;
        return recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    public boolean recur(TreeNode A, TreeNode B) {
        if(B == null) {
            return true;
        }
        if(A == null || A.val != B.val) {
            return false;
        }
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testA = TreeNode.constructTree(new Integer[] {1, 2, 3});
        TreeNode testB = TreeNode.constructTree(new Integer[] {3, 1});
        boolean res = solution.isSubStructure(testA, testB);
        System.out.println(res);
    }
}

