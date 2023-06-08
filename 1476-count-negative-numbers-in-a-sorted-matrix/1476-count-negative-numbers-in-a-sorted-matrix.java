class Solution {
    public int countNegatives(int[][] arr) {
        int n=arr.length;int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}