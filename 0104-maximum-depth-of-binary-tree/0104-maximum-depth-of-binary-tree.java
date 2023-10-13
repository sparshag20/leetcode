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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        int count=0;
        while(!q1.isEmpty()){
            int n=q1.size();
            for(int i=0;i<n;i++){
                TreeNode k=q1.poll();
                if(k.left!=null){
                    q1.add(k.left);
                }
                if(k.right!=null){
                    q1.add(k.right);
                }
            }
            count++;
        }
        return count;
    }
}