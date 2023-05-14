class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int res[]={0,0};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=nums[j]+nums[i];
                
                if(sum==target){
                    res[0]=i;
                    res[1]=j;
                    
                    return res;
                }
                    
            }
        }
        
        return null;
    }
}