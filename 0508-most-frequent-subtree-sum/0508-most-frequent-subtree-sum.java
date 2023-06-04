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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int k=SubtreeSum(hm,root);
        for(int h:hm.keySet()){
            l1.add(hm.get(h));
        }
        
        Collections.sort(l1);
        for(int h:hm.keySet()){
            if(hm.get(h)==l1.get(l1.size()-1)){
                l2.add(h);
            }
        }
        int arr[]=new int[l2.size()];
        for(int i=0;i<l2.size();i++){
            arr[i]=l2.get(i);
        }
        return arr;
    }
    public int SubtreeSum(HashMap<Integer,Integer> hm,TreeNode root){
        int sum=0;
        if(root==null){
            return 0;
        }
        sum=sum+root.val+SubtreeSum(hm,root.left)+SubtreeSum(hm,root.right);
        hm.put(sum,hm.getOrDefault(sum,0)+1);
        return sum;
    }
}