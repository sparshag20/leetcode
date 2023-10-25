class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            int m=matrix[i].length;
            int mid=(m/2);
            if(matrix[i][mid]>=matrix[i][0] || matrix[i][mid]<=matrix[i][m-1]){
                for(int j=0;j<m;j++){
                    if(matrix[i][j]==target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}