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
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        int k=sumLeaf(root,"");
        return k;
    }
    public int sumLeaf(TreeNode root,String k){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.left==null && root.right==null){
            k=k+root.val;
            sum= sum+ Integer.parseInt(k);
            k=k.substring(0,k.length()-1);
            return sum;
        }
        k=k+root.val;
        int a=sumLeaf(root.left,k);
        int b=sumLeaf(root.right,k);
        return a+b;
    }
}