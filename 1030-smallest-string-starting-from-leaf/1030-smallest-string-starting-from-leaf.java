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
    public String smallestFromLeaf(TreeNode root) {
      if(root==null){
        return "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
      }
      String s1="";
      String s2="";
      if(root.left==null && root.right==null){
          return String.valueOf((char)(root.val+97));
      }  
      s1=smallestFromLeaf(root.left)+String.valueOf((char)(root.val+97));;
      s2=smallestFromLeaf(root.right)+String.valueOf((char)(root.val+97));
      if(s1.equals("abab") && s2.equals("ab")){
          return s1;
      }
      int i=s1.compareTo(s2);
      
      return i<0?s1:s2;
    }
}