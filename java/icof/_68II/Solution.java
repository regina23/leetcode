package icof._68II;

import source.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    Map<Integer, TreeNode> parent = new HashMap<Integer, TreeNode>();
    Set<Integer> visited = new HashSet<Integer>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while(p != null) {
            visited.add(p.val);
            p = parent.get(p.val);
        }
        while(q != null) {
            if(visited.contains(q.val)){
                return q;
            }
            q = parent.get(q.val);
        }
        return null;
    }

    public void dfs(TreeNode root) {
        if(root.left != null) {
            parent.put(root.left.val, root);
            dfs(root.left);
        }
        if(root.right != null) {
            parent.put(root.right.val, root);
            dfs(root.right);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testRoot = TreeNode.constructTree(new Integer[] {3,5,1,6,2,0,8,null,null,7,4});
        TreeNode p = TreeNode.findElement(testRoot, 5);
        TreeNode q = TreeNode.findElement(testRoot, 1);
        TreeNode res = solution.lowestCommonAncestor(testRoot, p, q);
        System.out.println(res.val);
    }

}