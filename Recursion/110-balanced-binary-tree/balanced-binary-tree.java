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
    boolean bool = true;
    public boolean isBalanced(TreeNode root) {
        traverse(root);
        return bool;
    }
    public void traverse(TreeNode node){
        if(node==null) return ;
        max =Integer.MIN_VALUE;
        depth(node.left,0);
        int left = max ;
        max =Integer.MIN_VALUE;
        depth(node.right,0);
        int right = max;
        if(Math.abs(left-right)>1) bool = false ;
        traverse(node.left);
        traverse(node.right);
    }
    int max =Integer.MIN_VALUE;
    public void depth(TreeNode node , int n ){
        if(node==null){
            max = Math.max(max,n);
            return;
        }
        n++;
        depth(node.left,n);
        depth(node.right,n);
    }
}