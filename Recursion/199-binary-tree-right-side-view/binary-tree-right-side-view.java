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
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> qn = new LinkedList<>();
        qn.offer(root);
        while (!qn.isEmpty()) {
            int n = qn.size();
            for(int i = 0 ; i < n ; i++) {
                TreeNode node = qn.poll();
                if (i==n-1)
                    list.add(node.val);
                if (node.left != null)
                    qn.offer(node.left);

                if (node.right != null)
                    qn.offer(node.right);
            }
        }
        return list;
    }
}