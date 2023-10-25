class Solution {
    public int sumOfBeauties(int[] nums) {
        int n=nums.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            arr[i]=max;
        }
        int arr2[]=new int[n];
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            arr2[i]=min;
        }
        int sum=0;
        for(int i=1;i<=n-2;i++){
            if(nums[i]>arr[i-1] && nums[i]<arr2[i+1]){
                sum+=2;
            }
            else if(nums[i]>nums[i-1] && nums[i]<nums[i+1]){
                sum+=1;
            }
        }
        return sum;
    }
}