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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0 ;
        Queue<TreeNode> qn = new LinkedList<>();
        Queue<Integer> qi = new LinkedList<>();
        qn.offer(root);
        qi.offer(0);
        int max = Integer.MIN_VALUE;
        while(!qn.isEmpty()){
            int n = qn.size();
            int l = 0 ;
            int r = 0 ;
            for(int i = 0 ; i < n ; i++){
                TreeNode node = qn.poll();
                int index = qi.poll();
                if(i==0){
                    l = index;
                }
                if(i==n-1){
                    r = index;
                }
                if(node.left!=null){
                    qn.offer(node.left);
                    qi.offer(2*index+1);
                }
                if(node.right!=null){
                    qn.offer(node.right);
                    qi.offer(2*index+2);
                }
            }
            max = Math.max(r-l+1,max);
        }
        return max;
    }
}