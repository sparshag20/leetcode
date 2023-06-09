class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;int max=0;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]+1==nums[i+1] ){
                count++;
            }
            else{
                max=Math.max(count,max);
                count=1;
            }
        }
        max=Math.max(count,max);
        return max;
    }
}