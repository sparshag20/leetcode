class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int l=0;int r=0;
        int max=0;int min=Integer.MAX_VALUE;
        int len=0;int min1=0;int max1=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                int a=Math.abs(0-i)+1;
                int b=Math.abs(n-i);
                max=nums[i];
                max1=Math.min(a,b);
                l=i;
            }
            if(nums[i]<min){
                int a=Math.abs(0-i)+1;
                int b=Math.abs(n-i);
                min=nums[i];
                min1=Math.min(a,b);
                r=i;
            }
        }
        int k=Math.max(l+1,r+1);
        int j=Math.max(n-l,n-r);
        int t=Math.min(k,j);
        return Math.min(max1+min1,t);
    }
}