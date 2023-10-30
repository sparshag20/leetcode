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
    public long kthLargestLevelSum(TreeNode root, int m) {
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(!q1.isEmpty()){
            int n=q1.size();
            long sum=0;
            for(int i=0;i<n;i++){
                TreeNode k=q1.poll();
                if(k.left!=null){
                    q1.add(k.left);
                }
                if(k.right!=null){
                    q1.add(k.right);
                }
                sum+=k.val;
            }
            pq.add(sum);
        }
        int i=0;
        if(pq.size()<m){
            return -1;
        }
        while(i<m-1){
            pq.poll();
            i++;
        }
        return pq.poll();
    }
}