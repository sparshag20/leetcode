class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;int j=0;int i=0;
        boolean flag=false;
        while(i<n){
            sum+=nums[i];
            if(sum>=target){
                min=Math.min(min,i-j+1);
                while(sum>target){
                    if(sum-nums[j]>=target){
                        sum=sum-nums[j++];
                    }
                    else{
                        break;
                    }
                }
                min=Math.min(min,i-j+1);
                flag=true;
            }
            i++;
        }
        if(!flag){
            return 0;
        }
        return min;
    }
}