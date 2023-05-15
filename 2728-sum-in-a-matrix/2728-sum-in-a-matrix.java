class Solution {
    public int matrixSum(int[][] nums) {
        int ind=0;int sum=0;
        boolean f=false;
        while(!f){
            f=true;
            int max=0;
            for(int i=0;i<nums.length;i++){
                int max1=0;
                for(int j=0;j<nums[i].length;j++){
                if(nums[i][ind]!=0){
                    f=false;
                }
                if(nums[i][j]>max1){
                    ind=j;
                    max1=nums[i][j];
                }
            }
            nums[i][ind]=0;
                max=Math.max(max1,max);
            }
            System.out.println(max);
            sum+=max;
        }
        return sum;
    }
}