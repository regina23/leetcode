package icof._68I;

import source.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    /** 两次遍历

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path_p = getPath(root, p);
        List<TreeNode> path_q = getPath(root, q);
        TreeNode ancestor = null;
        for(int i = 0; i < path_p.size() && i < path_q.size(); i++) {
            if(path_p.get(i) == path_q.get(i)) {
                ancestor = path_p.get(i);
            } else {
                break;
            }
        }
        return ancestor;
    }

    public List<TreeNode> getPath(TreeNode root, TreeNode target) {
        List<TreeNode> path = new ArrayList<TreeNode>();
        TreeNode node = root;
        while(target != node) {
            path.add(node);
            if(target.val > root.val) node = root.right;
            if(target.val < root.val) node = root.left;
        }
        path.add(node);
        return path;
    }
     */

    // 一次遍历
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        while(node != null) {
            if (node.val > p.val && node.val > q.val) node = node.left;
            else if (node.val < p.val && node.val < q.val) node = node.right;
            else break;
        }
        return node;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testRoot = TreeNode.constructTree(new Integer[] {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNode p = TreeNode.findElement(testRoot, 2);
        TreeNode q = TreeNode.findElement(testRoot, 8);
        TreeNode res = solution.lowestCommonAncestor(testRoot, p, q);
        System.out.println(res.val);
    }
}