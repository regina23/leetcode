package icof._54;

import source.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        inorder(root);
        return res;
    }
    public void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.right);
        if(k == 0) return;
        if(--k == 0) {
            res=root.val;
            return;
        }
        inorder(root.left);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testRoot = TreeNode.constructTree(new Integer[] {3, 1, 4, null, 2});
        int k = 1;
        int res = solution.kthLargest(testRoot, k);
        System.out.println(res);
    }
}