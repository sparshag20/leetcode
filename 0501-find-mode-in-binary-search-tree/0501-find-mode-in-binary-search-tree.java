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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
        countN(root,hm);
        List<Integer> l1=new ArrayList<>();
        for(int i:hm.keySet()){
            max=Math.max(max,hm.get(i));
        }    
        int n=0;
        for(int i:hm.keySet()){
            if(hm.get(i)==max){
                l1.add(i);
            }
        }
        int arr[]=new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            arr[i]=l1.get(i);
        }
        return arr;
    }
    public void countN(TreeNode root,HashMap<Integer,Integer> hm){
        if(root==null){
            return;
        }
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        countN(root.left,hm);
        countN(root.right,hm);
    }
}