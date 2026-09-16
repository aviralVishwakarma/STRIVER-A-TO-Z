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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return list;
        q.offer(root);
        int i = 0 ;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            Stack<Integer> st = new Stack(); 
            while(n-->0){
                TreeNode node = q.poll();
                if(i%2==0) temp.add(node.val);
                if(i%2!=0) st.push(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            while(!st.isEmpty()) temp.add(st.pop());
            list.add(temp);
            i++;
        }
        return list;
    }
}