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
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            while(n-->0){
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            list.add(temp);
        }
        for(int i = 0 ; i < list.size(); i++){
            if(i%2!=0){
                int j = 0 ;
                int k = list.get(i).size()-1;
                while(j<k){
                    int temp = list.get(i).get(j);
                    list.get(i).set(j, list.get(i).get(k));
                    list.get(i).set(k,temp) ;
                    j++;
                    k--;
                }
            }
        }
        return list;
    }
}