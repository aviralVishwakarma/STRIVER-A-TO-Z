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
    int ans = 0 ;
    public int countNodes(TreeNode root) {
        int left = left_height(root,0);
        int right = right_height(root,0);
        if(left==right) return (1<<left) - 1 ;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public int left_height(TreeNode node , int h){
        if(node==null) return h;
        return left_height(node.left,h+1);
    }
    public int right_height(TreeNode node , int h){
        if(node==null) return h;
        return right_height(node.right,h+1);
    }
}