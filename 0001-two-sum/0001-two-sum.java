class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> l1=new ArrayList<>();
        int res[]={0,0};
        for(int i=0;i<nums.length;i++){
            l1.add(nums[i]);
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            l1.remove(0);
            j++;
            if(l1.contains(k)){
                res[0]=i;
                res[1]=l1.indexOf(k)+j;
                return res;
            }
        }
        return null;
    }
}