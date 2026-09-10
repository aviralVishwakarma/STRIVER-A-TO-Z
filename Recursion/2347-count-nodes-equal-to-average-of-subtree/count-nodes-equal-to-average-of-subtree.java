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
    List<TreeNode> list = new ArrayList<>();
    int sum = 0 ;
    int count = 0 ;
    int ans = 0 ;
    public int averageOfSubtree(TreeNode root) {
        preorder(root);
        for(TreeNode node : list){
            sum = 0 ;
            count = 0 ;
            sum(node);
            if(node.val==sum/count) ans++;
        }
        return ans;
    }
    public void sum(TreeNode node){
        if(node==null) return ;
        sum(node.left);
        sum+= node.val;
        count++;
        sum(node.right);
    }
    public void preorder(TreeNode node){
        if(node==null) return ;
        preorder(node.left);
        list.add(node);
        preorder(node.right);
    }
}