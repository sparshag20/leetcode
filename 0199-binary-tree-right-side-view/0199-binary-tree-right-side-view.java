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
        List<Integer> l1=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.peek()!=null){
            int m=0;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode k=q.poll();
                if(k.left!=null){
                    q.add(k.left);
                }
                if(k.right!=null){
                    q.add(k.right);
                }
                m=k.val;
            }
            l1.add(m);
            
        }
        return l1;
    }
}