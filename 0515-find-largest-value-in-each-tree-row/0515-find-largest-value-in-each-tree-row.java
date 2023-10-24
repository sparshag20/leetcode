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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        if(root==null){
            return l1;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            int n=q1.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                TreeNode k=q1.poll();
                if(k.left!=null){
                    q1.add(k.left);
                }
                if(k.right!=null){
                    q1.add(k.right);
                }
                max=Math.max(max,k.val);
            }
            l1.add(max);
        }
        return l1;
    }
}