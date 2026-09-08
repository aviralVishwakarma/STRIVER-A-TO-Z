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
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return list ;
        q.offer(root);
        int n = 1;
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int m = 0 ;
            for(int i = 0 ; i < n ; i++){
                TreeNode curr = q.poll();
                if(curr.left!=null){
                    m++;
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    m++;
                    q.offer(curr.right);
                }
                temp.add(curr.val);
            }
            list.add(temp);
            n=m;
        }
        return list;
    }
}