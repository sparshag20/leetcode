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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        boolean f=false;
        while(!q1.isEmpty()){
            for(int i=0;i<q1.size();i++){
                TreeNode k=q1.remove();
                if(k==null){
                    f=true;
                }
                else{
                    if(f){
                        return false;
                    }
                    else{
                        q1.add(k.left);
                        q1.add(k.right);
                    }
                }
            }
        }
        return true;
    }
}