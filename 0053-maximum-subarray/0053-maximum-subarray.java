class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int n=nums.length;int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}