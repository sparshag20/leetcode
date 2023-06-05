class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int j=1;
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=count+(j++);
            }
            else{
                j=1;
            }
        }
        return count;
    }
}