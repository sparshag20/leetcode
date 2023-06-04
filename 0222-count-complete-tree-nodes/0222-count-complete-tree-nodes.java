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
    public int countNodes(TreeNode root) {
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        int count=0;
        boolean f=false;
        while(!q1.isEmpty()){
            TreeNode k=q1.remove();
            if(k==null){
                f=true;
            }
            else{
                if(!f){
                    count++;
                    q1.add(k.left);
                    q1.add(k.right);
                }
                else{
                    return count;
                }
            }
        }
        return count;
    }
}