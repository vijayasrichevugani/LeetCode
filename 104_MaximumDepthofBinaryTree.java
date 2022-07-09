/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else{
            int ldepth = maxDepth(root.left);
            int rdepth = maxDepth(root.right);
            if(ldepth<rdepth)
                return rdepth+1;
            else return ldepth+1;
        }
    }
}
