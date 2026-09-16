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
    public int diameterOfBinaryTree(TreeNode root) {
        int n = daimeter(root);
        return max;
    }
    public int daimeter(TreeNode node){
        if(node==null) return 0;
        int left = daimeter(node.left);
        int right = daimeter(node.right);
        max = Math.max(left+right,max);
        return Math.max(left,right) + 1 ;
    }
}