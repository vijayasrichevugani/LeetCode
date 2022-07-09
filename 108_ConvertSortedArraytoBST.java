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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums== null || nums.length==0){
            return null;
        }
        return ConstructBSTRecursive(nums,0,nums.length-1);
    }
    
    private TreeNode ConstructBSTRecursive(int[] nums, int left, int right){
        if(left >right){
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = ConstructBSTRecursive(nums,left,mid-1);
        current.right = ConstructBSTRecursive(nums,mid+1,right);
        return current;
    }
}
