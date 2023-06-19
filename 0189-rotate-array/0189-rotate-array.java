class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l1.add(nums[i]);
        }
        for(int i=0;i<k;i++){
            l1.add(0,l1.remove(l1.size()-1));
        }    
        for(int i=0;i<nums.length;i++){
            nums[i]=l1.get(i);
        }
    }
}