class Solution {
    public int search(int[] nums, int target) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l1.add(nums[i]);
        }
        return l1.indexOf(target);
    }
}