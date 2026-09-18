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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list =  new ArrayList<>();
        if(root==null) return list;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<TreeNode> qn = new LinkedList<>();
        Queue<Integer> qi = new LinkedList<>();
        qn.offer(root);
        qi.offer(0);
        while(!qn.isEmpty()){
            TreeNode node = qn.poll();
            int row = qi.poll();
            map.put(row,node.val);
            if(node.left!=null){
                qn.offer(node.left);
                qi.offer(row+1);
            }
            if(node.right!=null){
                qn.offer(node.right);
                qi.offer(row+1);
            }
        }
        for(int value : map.values()){
            list.add(value);
        }
        return list;
    }
}