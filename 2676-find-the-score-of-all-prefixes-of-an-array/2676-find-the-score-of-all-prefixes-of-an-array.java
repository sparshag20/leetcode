class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long a[]=new long[n];
        long max=nums[0];
        a[0]=nums[0]+max;
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            a[i]=nums[i]+max+a[i-1];
        }
        return a;
    }
}