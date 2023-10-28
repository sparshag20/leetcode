class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int count=0;
        for(int i=0;i<n;i++){
            int mid=0;
            int low=0;
            int high=grid[i].length-1;
            int a=0;
            while(low<=high){
                mid=low+(high-low)/2;
                if(grid[i][mid]<0){
                    high=mid-1;
                    a=grid[i].length-mid;
                }
                else{
                    low=mid+1;
                }
            }
            count+=a;
        }
        return count;
    }
}