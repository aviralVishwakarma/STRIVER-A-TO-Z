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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return list;
        paths(root,"");
        return list;
    }
    public void paths(TreeNode node , String s){
        if(node.left==null && node.right==null){
            list.add(s+node.val);
            return;
        }
        if(node.left!=null) paths(node.left,s+node.val+"->");
        if(node.right!=null) paths(node.right,s+node.val+"->");
    }
}