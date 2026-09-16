/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int n = sum(root);
        return max ;
    }
    public int sum(TreeNode node){
        if(node==null) return 0 ;
        int left = sum(node.left);
        if(left<0) left = 0 ;
        int right = sum(node.right);
        if(right<0) right = 0 ;
        max = Math.max(left+right+node.val,max);
        return node.val + Math.max(left,right);
    }
}