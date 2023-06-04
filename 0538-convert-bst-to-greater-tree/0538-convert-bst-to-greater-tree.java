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
    int ans=0;
    public TreeNode convertBST(TreeNode root) {
        
        if(root!=null){
         convertBST(root.right);
         ans=ans+root.val;
         root.val=ans;
         convertBST(root.left);
        }
         
          return root;
    }
}