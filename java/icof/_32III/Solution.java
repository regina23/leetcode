package com.regina23.icof._32III;

import com.regina23.source.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            if(res.size() % 2 == 1) Collections.reverse(tmp);
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        com.regina23.icof._32II.Solution solution = new com.regina23.icof._32II.Solution();
        TreeNode testRoot = TreeNode.constructTree(new Integer[] {3, 9, 20, null, null, 15, 7});
        List<List<Integer>> res = solution.levelOrder(testRoot);
        System.out.println(res);

    }
}