class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int mid=0;int l=0;int r=n-1;
        int count=0;int z=0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==0){
                z=z+1;
                l=mid+1;
                continue;
            }
            if(nums[mid]>0){
                r=mid-1;
                count=n-mid;
            }
            else{
                l=mid+1;
            }
        }
        //System.out.print(count);
        if(count==0 && nums[0]==0){
            return 0;
        }
        if(count==0 && nums[n-1]==0){
            return n-z-1;
        }
        return Math.max(count,n-count-z);
    }
}